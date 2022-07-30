package com.Suresh.SpringBoot.Controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Suresh.SpringBoot.Properities.MyAppProperitiesReading;

@RestController
public class GoodMorningController {

	//autowire the properities file reading
	@Autowired
	private MyAppProperitiesReading prop;
	
	@GetMapping("/message")
	public String getMessages() {
		
		Map<String, String> map = prop.getMessages();
		String msg1 = map.get("msg1");
		String msg2 = map.get("msg2");
		String msg3 = map.get("msg3");
		String msg4 = map.get("msg4");
		System.out.println("******Printing the messages ");
		System.out.println(msg1 + " " + msg2 +"  " + msg3 +" " +msg4);
		return msg1;
	}
	
}
