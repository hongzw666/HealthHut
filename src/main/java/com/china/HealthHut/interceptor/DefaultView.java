package com.china.HealthHut.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class DefaultView implements WebMvcConfigurer{
	@Autowired 
	private LoginInterceptor loginInterceptor;
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/HealthHut").setViewName("/adminLogin");
		registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
	}
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(loginInterceptor)
		.addPathPatterns("/**").excludePathPatterns(
				"/HealthHut/App/*","/HealthHut","/HealthHut/logout","/HealthHut/toAdminRegister",
				"/HealthHut/userLogin",
				"/HealthHut/adminRegister","/HealthHut/toAdminLogin",
				"/HealthHut/adminLogin","/HealthHut/css/**",
				"/HealthHut/js/**","/HealthHut/fonts/**","/HealthHut/images/**");
	}
}
