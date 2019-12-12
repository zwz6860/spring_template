package org.java.conf;

import java.util.ArrayList;
import java.util.List;

import org.java.utils.SessionInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
* @author 夏立学
* @version 创建时间：2019年9月9日 下午3:18:45
*  @comment 类说明
*/
@Configuration
@Component	
public class SessionConfiguration implements WebMvcConfigurer{

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// TODO Auto-generated method stub
		/**
		 * addPathPatterns 拦截请求类型 /**表示所有
		 * excludePathPatterns 排除的请求类型 /static/**不拦截静态资源
		 */
		List<String> list = new ArrayList<String>();
		list.add("/static/**");
		list.add("/user/**");
		registry.addInterceptor(new SessionInterceptor()).addPathPatterns("/**").excludePathPatterns(list);
		WebMvcConfigurer.super.addInterceptors(registry);
		
	}

}
