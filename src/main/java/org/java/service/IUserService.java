package org.java.service;
/**
* @author 夏立学
* @version 创建时间：2019年9月6日 下午5:06:42
*  @comment 用户service层
*/

import java.util.List;

import org.java.entity.SysUser;

public interface IUserService {

	SysUser getUserList(Integer id);//查询用户
	
	SysUser login(SysUser user);//登陆
	
}
