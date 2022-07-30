package com.Suresh.SpringBoot.Properities;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "myapp")
@EnableConfigurationProperties   //read the yaml file properities which has prefix as MyApp
public class MyAppProperitiesReading {

	//this messages name should be same in yml file (both names must be identical)
	private Map<String,String> messages = new HashMap<>();

	public Map<String, String> getMessages() {
		return messages;
	}

	public void setMessages(Map<String, String> messages) {
		this.messages = messages;
	}

	@Override
	public String toString() {
		return "MyAppProperitiesReading [messages=" + messages + "]";
	}
	
	
	
}
