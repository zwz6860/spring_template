package org.java.service.impl;

import java.util.List;

import org.java.entity.GameActivity;
import org.java.mapper.GameActivityMapper;
import org.java.mapper.SysUserMapper;
import org.java.service.IGameActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
@Component
@Service
public class GameActivityServiceImpl implements IGameActivityService{

	@Autowired
	private GameActivityMapper gameActivityMapper;
	
	@Override
	public List<GameActivity> getGameActivityInfo() {
		return gameActivityMapper.getGameActivityInfo();
		
	}

	
	
}
