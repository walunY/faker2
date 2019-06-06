package xyz.walun.faker2.config;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

/**
 * 开启一个线程池
 * @author ：Walun
 * @date ：Created in 2019/6/5 22:24
 */
@Configuration
@ComponentScan(basePackages = { "xyz.walun"})
@EnableAsync
public class ThreadConfig implements AsyncConfigurer{
	@Override
	public Executor getAsyncExecutor() {
		ThreadPoolTaskExecutor threadPool = new ThreadPoolTaskExecutor();
		//设置核心线程数
		threadPool.setCorePoolSize(25);
		//设置最大线程数
		threadPool.setMaxPoolSize(50);
		//线程池所使用的缓冲队列
		threadPool.setQueueCapacity(10);
		//等待任务在关机时完成--表明等待所有线程执行完
		threadPool.setWaitForTasksToCompleteOnShutdown(true);
		// 等待时间 （默认为0，此时立即停止），并没等待xx秒后强制停止
		threadPool.setAwaitTerminationSeconds(60);
		// 初始化线程
		threadPool.initialize();
		return threadPool;
	}

	@Override
	public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
		return null;
	}
}
