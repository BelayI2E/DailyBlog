package com.daily.dao;

import java.util.List;

import com.daily.model.User;

public interface UserDao {
	
	public void addUser(User user);
	public void updateUser(User user);
	public void deleteUser(User user);
	public User getUserById(long id);
	public List<User> getAllUsers();

}
