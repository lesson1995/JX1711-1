package org.great.bean;



public class TbParam {
	private int id;
	private int pid;
	private String pname;
	public TbParam(int id, int pid, String pname) {
		super();
		this.id = id;
		this.pid = pid;
		this.pname = pname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public TbParam() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

	
}
