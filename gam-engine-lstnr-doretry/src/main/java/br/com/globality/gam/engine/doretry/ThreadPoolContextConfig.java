package br.com.globality.gam.engine.doretry;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@Configuration
@EnableScheduling
@ComponentScan(basePackages = "br.com.globality.gam.engine")
public class ThreadPoolContextConfig {
	
	@Bean(name="runDoRetryExecutor")
	public ThreadPoolTaskExecutor taskExecutorListener() {
		ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(10);
        executor.setMaxPoolSize(50);
        executor.setQueueCapacity(300);
        executor.initialize();
		return executor;
	}
		
}