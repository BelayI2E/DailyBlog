package com.daily.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.daily.dao.UserDao;
import com.daily.model.User;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	private UserDao userDao;
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void addUser(User user) {
		this.userDao.addUser(user);

	}

	@Override
	public void updateUser(User user) {
		this.userDao.updateUser(user);

	}

	@Override
	public void deleteUser(User user) {
		this.userDao.deleteUser(user);

	}

	@Override
	public User getUser(long id) {
		return this.userDao.getUserById(id);
	}

	@Override
	public List<User> getAllUsers() {
		return this.userDao.getAllUsers();
	}

}
