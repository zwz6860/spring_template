package org.java.service;
/**
* @author 夏立学
* @version 创建时间：2019年9月12日 下午3:55:41
*  @comment 游戏类型的server
*/

import java.util.List;

import org.java.entity.GameActivity;

public interface IGameActivityService {

	//查询游戏活动信息
	List<GameActivity> getGameActivityInfo();
	
}
