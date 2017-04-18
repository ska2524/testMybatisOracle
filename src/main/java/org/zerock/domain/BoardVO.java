package org.zerock.domain;

import java.sql.Date;

public class BoardVO {
	
	private int bno;
	private String title, content, writer;
	private Date regDate, updataDate;
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public Date getUpdataDate() {
		return updataDate;
	}
	public void setUpdataDate(Date updataDate) {
		this.updataDate = updataDate;
	}
	@Override
	public String toString() {
		return "boardVO [bno=" + bno + ", title=" + title + ", content=" + content + ", writer=" + writer + ", regDate="
				+ regDate + ", updataDate=" + updataDate + "]";
	}
	
	
	
}
