package com.jshop.entity;

// Generated 2013-3-22 15:24:47 by Hibernate Tools 4.0.0

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * SerialT generated by hbm2java
 */
@Entity
@Table(name = "serial_t", catalog = "jshoper3")
public class SerialT implements java.io.Serializable {

	private String biz;
	private String head;
	private String lastid;
	private int increment;
	private Date updatetime;

	public SerialT() {
	}

	public SerialT(String biz, String lastid, int increment, Date updatetime) {
		this.biz = biz;
		this.lastid = lastid;
		this.increment = increment;
		this.updatetime = updatetime;
	}

	public SerialT(String biz, String head, String lastid, int increment, Date updatetime) {
		this.biz = biz;
		this.head = head;
		this.lastid = lastid;
		this.increment = increment;
		this.updatetime = updatetime;
	}

	@Id
	@Column(name = "BIZ", unique = true, nullable = false, length = 45)
	public String getBiz() {
		return this.biz;
	}

	public void setBiz(String biz) {
		this.biz = biz;
	}

	@Column(name = "HEAD", length = 20)
	public String getHead() {
		return this.head;
	}

	public void setHead(String head) {
		this.head = head;
	}

	@Column(name = "LASTID", nullable = false, length = 20)
	public String getLastid() {
		return this.lastid;
	}

	public void setLastid(String lastid) {
		this.lastid = lastid;
	}

	@Column(name = "INCREMENT", nullable = false)
	public int getIncrement() {
		return this.increment;
	}

	public void setIncrement(int increment) {
		this.increment = increment;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATETIME", nullable = false, length = 0)
	public Date getUpdatetime() {
		return this.updatetime;
	}

	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}

}
