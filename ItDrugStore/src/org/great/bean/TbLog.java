package org.great.bean;



public class TbLog {
	private int logid;
	private String loguser;
	private String logtime;
	private String logiteam;
	
	
	public TbLog() {
		super();
		// TODO Auto-generated constructor stub
	}


	public TbLog(int logid, String loguser, String logtime, String logiteam) {
		super();
		this.logid = logid;
		this.loguser = loguser;
		this.logtime = logtime;
		this.logiteam = logiteam;
	}


	public int getLogid() {
		return logid;
	}


	public void setLogid(int logid) {
		this.logid = logid;
	}


	public String getLoguser() {
		return loguser;
	}


	public void setLoguser(String loguser) {
		this.loguser = loguser;
	}


	public String getLogtime() {
		return logtime;
	}


	public void setLogtime(String logtime) {
		this.logtime = logtime;
	}


	public String getLogiteam() {
		return logiteam;
	}


	public void setLogiteam(String logiteam) {
		this.logiteam = logiteam;
	}


	
	
}
