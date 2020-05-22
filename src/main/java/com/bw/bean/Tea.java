package com.bw.bean;

public class Tea {
	private String cid;
	private String cname;
	public Tea() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Tea(String cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	@Override
	public String toString() {
		return "Tea [cid=" + cid + ", cname=" + cname + "]";
	}
	
}
