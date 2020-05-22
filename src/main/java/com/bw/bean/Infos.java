package com.bw.bean;

public class Infos {
	private String id;
	private String sid;
	private String uptime;
	private String status;
	private String cid;
	
	private String cname;

	public Infos() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Infos(String id, String sid, String uptime, String status, String cid, String cname) {
		super();
		this.id = id;
		this.sid = sid;
		this.uptime = uptime;
		this.status = status;
		this.cid = cid;
		this.cname = cname;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getUptime() {
		return uptime;
	}

	public void setUptime(String uptime) {
		this.uptime = uptime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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
		return "Infos [id=" + id + ", sid=" + sid + ", uptime=" + uptime + ", status=" + status + ", cid=" + cid
				+ ", cname=" + cname + "]";
	}

	
	
}
