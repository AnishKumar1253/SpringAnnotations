package com.masai.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PropertyExample 
{
	@Value("${db.username}")
	private String username;
	
	@Value("${db.password}")
	private String password;
	
	public void displayInfo()
	{
		System.out.println("Username:"+username);
		System.out.println("Password"+password);
	}

}
