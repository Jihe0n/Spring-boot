package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.UserProfile;

@RestController
public class UserProfileController {

	private Map<String , UserProfile> userMap;
	
	
	// 스프링이  컨트롤러를 만들고 바로 직후에 바로 호출되는 것 >> 그래서 초기화로 쓰임
	@PostConstruct  
	public void init() {
		 userMap = new HashMap<String, UserProfile>();
		 userMap.put("1", new UserProfile("1","홍길동","11-11","대치1동"));
		 userMap.put("2", new UserProfile("2","홍길동","11-12","대치2동"));
		 userMap.put("3", new UserProfile("3","홍길동","11-13","대치3동"));
	}
	
}
