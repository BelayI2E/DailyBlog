package com.daily.dao;

import java.util.List;



import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.daily.model.Post;

public class PostDaoImpl implements PostDao {

	private static final Logger log=Logger.getLogger(PostDaoImpl.class);
	
	private SessionFactory sessionFactory;
	
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void addPost(Post post) {
		log.debug("adding a new Post");
		try{
			Session session =this.sessionFactory.openSession();
			Transaction tx= session.beginTransaction();
			session.persist(post);
			tx.commit();
			log.debug("adding new post succesfull");
			
		}catch(RuntimeException ex){
			log.error("adding new post failed");
			throw ex;
		}

	}

	@Override
	public void updatePost(Post post) {
		log.debug("updating post");
		try{
			this.sessionFactory.getCurrentSession().update(post);
			log.debug("updating post succesfuls");
		}catch(RuntimeException ex){
			log.error("updating post failed");
			throw ex;
		}

	}

	@Override
	public void deletePost(Post post) {
		log.debug("deleting post ");
		try{
			this.sessionFactory.getCurrentSession().delete(post);
			log.debug("deleting post succesfull");
		}catch(RuntimeException ex){
			log.error("deleting post failed");
			throw ex;
		}

	}

	@Override
	public Post getPost(long id) {
		log.debug("finding post by id");
		try{
			
			Session session= this.sessionFactory.openSession();
			session.beginTransaction();
			Post post=(Post) session.get(Post.class, id);
			log.debug("finding post succesfull");
			return post;
		}catch(RuntimeException ex){
			log.error("finding post failed");
			throw ex;
		}
		
	}

	@Override
	public List<Post> getAllPosts() {
		log.debug("finding all the posts ");
		try{
			@SuppressWarnings("unchecked")
			List<Post>posts= this.sessionFactory.openSession().createQuery("from Post as p").list();
			log.debug("finding all posts successful");
			return posts;
		}catch(RuntimeException ex){
			log.error("getting all posts failed");
			throw ex;
		}
		
	}

	@Override
	public List<Post> findCurrentFour() {
		return null;
}
}