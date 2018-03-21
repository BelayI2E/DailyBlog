package com.daily.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.daily.dao.PostDao;
import com.daily.model.Post;

@Service
@Transactional
public class PostServiceImpl implements PostService {
	
	private PostDao postDao;
	

	public PostDao getPostDao() {
		return postDao;
	}

	public void setPostDao(PostDao postDao) {
		this.postDao = postDao;
	}

	@Override
	public void addPosts(Post post) {
		this.postDao.addPost(post);

	}

	@Override
	public void updatePost(Post post) {
		this.postDao.updatePost(post);

	}

	@Override
	public void deletePost(Post post) {
		this.postDao.deletePost(post);

	}

	@Override
	public Post findPost(long id) {
		return this.postDao.getPost(id);
	}

	@Override
	public List<Post> getAllPosts() {
		return this.postDao.getAllPosts();
	}

	@Override
	public List<Post> findLatestFour() {
		
		return null;
	}

}
