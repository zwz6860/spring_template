package org.java.utils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.java.entity.SysUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author 夏立学
 * @version 创建时间：2019年9月5日 下午3:41:44
 * @comment 拦截器
 */
public class SessionInterceptor implements HandlerInterceptor {
    private static final Logger log = LoggerFactory.getLogger(HandlerInterceptor.class);

	/**
	 * 在业务处理器处理请求之前被调用。预处理，可以进行编码、安全控制、权限校验等处理；
	 */
	@Override
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2) throws Exception {
        log.info("---------------------请求处理之前----------------------------");
		SysUser userInfo =(SysUser)arg0.getSession().getAttribute("userInfo");
		if(userInfo==null) {
			System.err.println("拦截器拦截>>>没有用户信息");
			arg0.getRequestDispatcher("/user/skipLogin").forward(arg0, arg1);
			return false;
		}else {
			System.err.println("拦截器拦截>>>有用户信息");
			return true;
		}
	}

	/**
	 * 在业务处理器处理请求执行完成后，生成视图之前执行。后处理（调用了Service并返回ModelAndView，但未进行页面渲染），有机会修改ModelAndView
	 */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			@Nullable ModelAndView modelAndView) throws Exception {
        log.info("---------------------请求处理完----------------------------");

	}

	/**
	 * 在DispatcherServlet完全处理完请求后被调用，可用于清理资源等。返回处理
	 */
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
			@Nullable Exception ex) throws Exception {
        log.info("---------------------请求渲染----------------------------");

	}
	
}
