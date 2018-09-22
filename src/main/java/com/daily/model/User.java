package com.daily.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User implements Serializable{

	private static final long serialVersionUID = 891293904158584377L;
	
	@Id
	@GeneratedValue
	private long id;
	@Column(nullable=false,length=50,unique=true)
	private String username;
	@Column(length=60)
	private String password;
	@Column(length=50)
	private String firstname;
	@Column(length=50)
	private String lastname;
	@OneToMany(mappedBy="author")
	private List<Post> posts= new ArrayList<Post>();
	
	public User(){}
	public User(String username, String password, String firstname, String lastname){
		
		this.username=username;
		this.password=password;
		this.firstname=firstname;
		this.lastname=lastname;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public List<Post> getPosts() {
		return posts;
	}
	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}
	@Override
	public String toString() {
		return "User [username=" + username  + ", firstname=" + firstname + ", lastname="
				+ lastname + "]";
	}
	
}
