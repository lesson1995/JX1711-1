package org.great.bean;

import java.math.BigDecimal;

public class TbUser {
	private int userid;
	private String useraccount;
	private String username;
	private String userpwd;
	private String usersex;
	private String usertel;
	private String userident;	

	private String userprof;
	private String userdept;
	private String userstate;
	private int roleid;
	
	public int getRoleid() {
		return roleid;
	}

	public void setRoleid(int roleid) {
		this.roleid = roleid;
	}

	public TbUser(int userid, String useraccount, String username, String userpwd, String usersex, String usertel,
			String userident, String userprof, String userdept, String userstate, int roleid) {
		super();
		this.userid = userid;
		this.useraccount = useraccount;
		this.username = username;
		this.userpwd = userpwd;
		this.usersex = usersex;
		this.usertel = usertel;
		this.userident = userident;
		this.userprof = userprof;
		this.userdept = userdept;
		this.userstate = userstate;
		this.roleid = roleid;
	}

	public TbUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getUseraccount() {
		return useraccount;
	}

	public void setUseraccount(String useraccount) {
		this.useraccount = useraccount;
	}

	

	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserpwd() {
		return userpwd;
	}
	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}
	public String getUsersex() {
		return usersex;
	}
	public void setUsersex(String usersex) {
		this.usersex = usersex;
	}
	public String getUsertel() {
		return usertel;
	}
	public void setUsertel(String usertel) {
		this.usertel = usertel;
	}
	public String getUserident() {
		return userident;
	}
	public void setUserident(String userident) {
		this.userident = userident;
	}
	public String getUserprof() {
		return userprof;
	}
	public void setUserprof(String userprof) {
		this.userprof = userprof;
	}
	public String getUserdept() {
		return userdept;
	}
	public void setUserdept(String userdept) {
		this.userdept = userdept;
	}
	public String getUserstate() {
		return userstate;
	}
	public void setUserstate(String userstate) {
		this.userstate = userstate;
	}
	
	
}
