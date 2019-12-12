package org.java.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.java.entity.WinningList;
import org.java.mapper.WinningListMapper;
import org.java.service.ISchedulerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
* @author 夏立学
* @version 创建时间：2019年9月27日 上午10:44:37
*  @comment 调度执行方法接口实现类
*/
@Service
@Component
public class SchedulerServiceImpl implements ISchedulerService {

	@Autowired
	private WinningListMapper winningListMapper;//记录中奖号表
	
	@Override
	public void produceWinNums() {//从1-15中生成4个不重复的随机数
		List<Integer> nums=new ArrayList<Integer>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		nums.add(6);
		nums.add(7);
		nums.add(8);
		nums.add(9);
		nums.add(10);
		nums.add(11);
		nums.add(12);
		nums.add(13);
		nums.add(14);
		nums.add(15);
		Map<Integer, Integer> winNums=new HashMap<Integer, Integer>();//记录中奖号码
		Integer winSort=1;//记录中奖位置
		while(true) {
            if(winNums.size()>=5) {
            	break;
            }
            Random random = new Random();
            Math.random();
            int j = random.nextInt(nums.size()-1);
            winNums.put(winSort++, nums.get(j));
            nums.remove(j);
		}
		WinningList data = new WinningList();
		data.setOneWinningNum(winNums.get(1));
		data.setTwoWinningNum(winNums.get(2));
		data.setThreeWinningNum(winNums.get(3));
		data.setFourWinningNum(winNums.get(4));
		data.setFiveWinningNum(winNums.get(5));
		data.setCreateTime(System.currentTimeMillis());
		data.setIntegral(5);//默认每次开奖积分为5
		winningListMapper.insert(data);
	}

}
