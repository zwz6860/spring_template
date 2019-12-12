package org.java.controller;

import org.java.common.ReturnDataList;
import org.java.entity.WinningList;
import org.java.service.ILotteryService;
import org.java.service.impl.LotteryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
* @author 夏立学
* @version 创建时间：2019年9月27日 下午1:44:22
*  @comment 中奖号
*/
@Controller
@RequestMapping("/lottery")
public class LotteryController {

	@Autowired
	private ILotteryService lotteryService;
	
	//跳转中奖页面
	@GetMapping("/skipLottery")
	public String skipGameActivity() {
		return "lottery/lotteryInfo";
	}
	
	//查询历史中奖号
	@GetMapping("/getLotteryInfo")
	@ResponseBody
	public ReturnDataList<WinningList> getLotteryInfo() {
		ReturnDataList<WinningList> data= new ReturnDataList<WinningList>();
		data.dataList=lotteryService.getInfo();
		return data;
	}
}
