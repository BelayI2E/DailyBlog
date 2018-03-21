package com.daily.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.daily.model.User;
@Repository
public class UserDaoImpl implements UserDao {

	private static final Logger log=Logger.getLogger(UserDaoImpl.class);
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void addUser(User user) {
		log.debug("Trying to create new User");
		try{
			this.sessionFactory.getCurrentSession().persist(user);
			log.debug("user created succesfully");
		}catch(RuntimeException ex){
			log.error("creatig new user failed");
			throw ex;
		}
		

	}

	@Override
	public void updateUser(User user) {
		log.debug("Updating current user");
		try{
			this.sessionFactory.getCurrentSession().update(user);
			log.debug("updating user succesful");
		}catch(RuntimeException ex){
			log.error("updating user failed");
			throw ex;
		}

	}

	@Override
	public void deleteUser(User user) {
		log.debug("deleting current user");
		try{
			this.sessionFactory.getCurrentSession().delete(user);
			log.debug("deleting user succesful");
		}catch(RuntimeException ex){
			log.error("deleting user failed");
			throw ex;
		}

	}

	@Override
	public User getUserById(long id) {
		log.debug("finding user by id");
		try{
			User user=(User) this.sessionFactory.getCurrentSession().get(User.class, id);
				log.debug("finding user by id succesful");
				return user;
		
		}catch(RuntimeException ex){
			log.error("finding user by id failed");
			throw ex;
		}
		
	}

	@Override
	public List<User> getAllUsers() {
		log.debug("finding users ");
		try{
			@SuppressWarnings("unchecked")
			List<User> users= this.sessionFactory.getCurrentSession().createCriteria("from User as u").list();
			if(users!=null){
				log.debug("finding users succesful");
				return users;
			}
		}catch(RuntimeException ex){
			log.debug("finding users failed");
			throw ex;
		}
		return null;
	}

}
