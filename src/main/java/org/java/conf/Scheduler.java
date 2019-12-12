package org.java.conf;

import org.java.service.ISchedulerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
* @author 夏立学
* @version 创建时间：2019年9月27日 上午11:15:34
*  @comment 执行调度
*/
@Component
public class Scheduler {

	@Autowired
	private ISchedulerService scheduler;
	
	//每5分钟开一次奖
	/*
	 * @Scheduled(cron = "0 0/5 * * * ? ") public void openWinning() {
	 * scheduler.produceWinNums(); }
	 */
	
}
