package com.pt.vo;

public class UserEntity {

	private Long id; 
	private String name;
	private String loginname;
    
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLoginname() {
		return loginname;
	}
	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}

	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", name=" + name + ", loginname=" + loginname + "]";
	}

}
