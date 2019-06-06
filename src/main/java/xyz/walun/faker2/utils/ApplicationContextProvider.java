package xyz.walun.faker2.utils;

import lombok.Data;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * 提供程序上下文，实现多例
 * @author ：Walun
 * @date ：Created in 2019/6/5 9:28
 */
@Component
@Data
public class ApplicationContextProvider implements ApplicationContextAware {
	private static ApplicationContext context;
	private ApplicationContextProvider(){}
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		context = applicationContext;
	}
	public  static <T> T getBean(String name,Class<T> aClass){
		return context.getBean(name,aClass);
	}

	public static void setAC(ApplicationContext applicationContext)throws BeansException {
		context = applicationContext;
	}
}

