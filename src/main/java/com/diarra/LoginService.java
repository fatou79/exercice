package com.diarra;

public class LoginService {
	public boolean validateUser(String user, String password) {
		return user.equalsIgnoreCase("fatima") && password.equals("diop");
	}
	

}
