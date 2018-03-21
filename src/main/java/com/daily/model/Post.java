package com.daily.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="post")
public class Post implements Serializable{

	private static final long serialVersionUID = -4743340104844620951L;
	@Id
	@GeneratedValue
	private long id;
	@Column(nullable=false, length=400)
	private String title;
	@Column(nullable=false)
	@Lob
	private String body;
	@ManyToOne(optional=true, fetch=FetchType.LAZY)
	private User author;
	@Column(nullable=false)
	private Date date= new Date();
	
	public Post(){}
	
	public Post(String title, String body,Date date){
		this.title=title;
		this.body=body;
		this.date=date;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public User getAuthor() {
		return author;
	}

	public void setAuthor(User author) {
		this.author = author;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Post [title=" + title + ", body=" + body + ", author=" + author + ", date=" + date + "]";
	}
	



}
