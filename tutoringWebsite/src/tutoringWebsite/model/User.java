package tutoringWebsite.model;


import java.util.ArrayList;
import java.util.Map;

public class User {
	private int user_Id;
	private String email;
	private String password;
	private String name;
	private int userType;

	public User(){
	}
	public void setEmail(String email){
		this.email = email;
	}
	public String getEmail() {
		return this.email;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword() {
		return this.password;
	}
	
	public int getUser_Id() {
		return user_Id;
	}
	public void setUser_Id(int user_Id) {
		this.user_Id = user_Id;
	}
	public void cancel() {
		email = null;
		password = null;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getUserType() {
		return userType;
	}
	public void setUserType(int userType) {
		this.userType = userType;
	}
	
	
	
	public User getUser(String name) {
		User user = new User();
		//I don't think this method does anything
		return user;
	}

	public User createAccount(String email, String password, String name, int userType) {
		 
		User account = new User();
		account.setEmail(email);
		account.setPassword(password);
		account.setName(name);
		account.setUserType(userType);
		
		return account;	
	}
	public boolean isStudent(String name) {
		return name.contains("@ycp.edu");
		
	}
	public void removeAccount(User user) {
	user.setEmail(null);
	user.setName(null);
	user.setPassword(null);
	user.setUser_Id(-1);
	user.setUserType(0);
		
	}
	
}