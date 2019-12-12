package org.java.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import javax.servlet.http.HttpSession;

import org.java.common.ReturnData;
import org.java.common.ReturnModel;
import org.java.entity.SysUser;
import org.java.service.IUserService;
import org.java.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 夏立学
 * @version 创建时间：2019年9月3日 下午2:28:37
 * @comment 用户接口
 */
@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private IUserService userService;

	@Autowired
	private StringRedisTemplate stringRedisTemplate;
	// 登陆功能 原不走缓存的登陆

	//	@GetMapping("login")
	//	@ResponseBody
	//	public ReturnData<String> login(SysUser user, HttpSession session) {
	//		ReturnData<String> data = new ReturnData<String>();// 接口返回信息
	//		SysUser userInfo = userService.login(user);
	//		session.setAttribute("userInfo", userInfo);
	//		if (userInfo != null) {
	//			System.err.println("登陆成功");
	//			data.model = "/";
	//		} else {
	//			System.err.println("登陆失败");
	//			data.model = "#";
	//			data.data = "账号或密码错误";
	//		}
	//		return data;
	//	}

	// 第二种走缓存的登陆
	@GetMapping("login")
	@ResponseBody
	public ReturnData<String> login(SysUser user, HttpSession session) {
		ReturnData<String> data = new ReturnData<String>();// 接口返回信息
		// 第一步根据用户账号去查询缓存是否有该用户信息
		SysUser userInfo;// 局部通用变量
		String key="SYS_USER_";
		userInfo = JsonUtils.jsonToPojo(stringRedisTemplate.opsForValue().get(key+user.getLoginAccount()), SysUser.class);
		if (userInfo != null) {
			// 缓存有用户数据直接取缓存数据
			data.model = "/";
		} else {
			// 缓存中没有用户信息查库
			userInfo = userService.login(user);
			if(userInfo != null) {
				//账号密码正确存入缓存中
				stringRedisTemplate.opsForValue().set(key+user.getLoginAccount(), JsonUtils.objectToJson(userInfo),1,TimeUnit.DAYS);
				data.model = "/";
			}else {
				data.data = "账号或密码错误";
				System.err.println("登陆失败,账号或密码错误");
			}
		}
		session.setAttribute("userInfo", userInfo);
		return data;
	}

	// 退出功能
	@GetMapping("logout")
	@ResponseBody
	public ReturnModel logout(HttpSession session) {
		session.removeAttribute("userInfo");
		System.err.println("用户退出");
		return new ReturnModel("/user/skipLogin");
	}

	// 跳转登陆页面
	@GetMapping("skipLogin")
	public String skipLogin() {
		return "login";
	}

}
