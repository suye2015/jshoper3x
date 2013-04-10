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
 * PageT generated by hbm2java
 */
@Entity
@Table(name = "page_t", catalog = "jshoper3")
public class PageT implements java.io.Serializable {

	private String pageid;
	private String enpagename;
	private String cnpagename;
	private String url;
	private String rangearea;
	private String creatorid;
	private Date createtime;

	public PageT() {
	}

	public PageT(String pageid, String rangearea, String creatorid, Date createtime) {
		this.pageid = pageid;
		this.rangearea = rangearea;
		this.creatorid = creatorid;
		this.createtime = createtime;
	}

	public PageT(String pageid, String enpagename, String cnpagename, String url, String rangearea, String creatorid, Date createtime) {
		this.pageid = pageid;
		this.enpagename = enpagename;
		this.cnpagename = cnpagename;
		this.url = url;
		this.rangearea = rangearea;
		this.creatorid = creatorid;
		this.createtime = createtime;
	}

	@Id
	@Column(name = "PAGEID", unique = true, nullable = false, length = 20)
	public String getPageid() {
		return this.pageid;
	}

	public void setPageid(String pageid) {
		this.pageid = pageid;
	}

	@Column(name = "ENPAGENAME", length = 45)
	public String getEnpagename() {
		return this.enpagename;
	}

	public void setEnpagename(String enpagename) {
		this.enpagename = enpagename;
	}

	@Column(name = "CNPAGENAME", length = 45)
	public String getCnpagename() {
		return this.cnpagename;
	}

	public void setCnpagename(String cnpagename) {
		this.cnpagename = cnpagename;
	}

	@Column(name = "URL")
	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Column(name = "RANGEAREA", nullable = false, length = 1)
	public String getRangearea() {
		return this.rangearea;
	}

	public void setRangearea(String rangearea) {
		this.rangearea = rangearea;
	}

	@Column(name = "CREATORID", nullable = false, length = 20)
	public String getCreatorid() {
		return this.creatorid;
	}

	public void setCreatorid(String creatorid) {
		this.creatorid = creatorid;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATETIME", nullable = false, length = 0)
	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

}
