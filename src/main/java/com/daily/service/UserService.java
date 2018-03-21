package com.daily.service;

import java.util.List;

import com.daily.model.User;

public interface UserService {
	
	public void addUser(User user);
	public void updateUser(User user);
	public void deleteUser(User user);
	public User getUser(long id);
	public List<User> getAllUsers();

}
