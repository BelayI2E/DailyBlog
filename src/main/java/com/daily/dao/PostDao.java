package com.daily.dao;

import java.util.List;

import com.daily.model.Post;

public interface PostDao {
	
	public void addPost(Post post);
	public void updatePost(Post post);
	public void deletePost(Post post);
	public Post getPost(long id);
	public List<Post> getAllPosts();
	public List<Post> findCurrentFour();

}
