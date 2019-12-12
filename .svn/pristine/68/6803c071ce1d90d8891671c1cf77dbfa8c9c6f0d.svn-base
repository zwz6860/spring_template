package org.java.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.java.common.ReturnDataList;
import org.java.common.ReturnModel;
import org.java.entity.GameActivity;
import org.java.service.IGameActivityService;
import org.java.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
* @author 夏立学
* @version 创建时间：2019年9月12日 下午1:35:07
*  @comment 游戏相关
*/
@Controller
@RequestMapping("/game")
public class GameController {

	@Autowired
	private IGameActivityService gameActivityServer;
	
	//跳转活动时间页面
	@GetMapping("/skipGameActivity")
	public String skipGameActivity() {
		return "gameActivityInfo";
	}
	

	//查询活动信息
	@GetMapping("getGameActivityInfo")
	@ResponseBody
	public ReturnDataList<GameActivity> getGameActivityInfo() {
		System.err.println("进入查询用户活动接口");
		List<GameActivity> list = gameActivityServer.getGameActivityInfo();
		list.forEach(System.out::println);
		ReturnDataList data=new ReturnDataList();
		data.dataList=list;
		return data;
	}
	
	
}
