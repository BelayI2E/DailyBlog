package com.daily.service;

import java.util.List;

import com.daily.model.Post;

public interface PostService {
	
	public void addPosts(Post post);
	public void updatePost(Post post);
	public void deletePost(Post post);
	public Post findPost(long id);
	public List<Post> getAllPosts();
	public List<Post> findLatestFour();

}
