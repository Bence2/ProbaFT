package hu.springweb.chatapp.config;

import hu.springweb.chatapp.service.GetMessagesService;
import hu.springweb.chatapp.service.GetMessagesServiceImpl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBeanConfig
{
	@Bean
	public GetMessagesService getMessagesService()
	{
		return new GetMessagesServiceImpl();
	}

}
