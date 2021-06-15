package com.wzc.login.domain;

/**
 * @author WANGZIC
 */
public class User {
	private Integer user_id;
	
	private String username;

	private String password;

	private String rolename;

	private String desc;

	private String sex;

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}


	public String getRolename() {
		return rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public Integer getUser_id() {
		return user_id;
	}


	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "User{" +
				"user_id=" + user_id +
				", username='" + username + '\'' +
				", password='" + password + '\'' +
				", rolename='" + rolename + '\'' +
				", desc='" + desc + '\'' +
				", sex='" + sex + '\'' +
				'}';
	}

}
