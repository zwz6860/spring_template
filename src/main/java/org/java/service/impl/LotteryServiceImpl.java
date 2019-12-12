package org.java.service.impl;

import java.util.List;

import org.java.entity.WinningList;
import org.java.mapper.WinningListMapper;
import org.java.service.ILotteryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
* @author 夏立学
* @version 创建时间：2019年9月27日 下午2:14:01
*  @comment 
*/
@Component
@Service
public class LotteryServiceImpl implements ILotteryService{

	@Autowired
	private WinningListMapper winningListMapper;
	
	@Override
	public List<WinningList> getInfo() {
		return winningListMapper.getInfo();
		
	}

}
