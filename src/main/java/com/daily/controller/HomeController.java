package com.daily.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.daily.model.Post;
import com.daily.service.PostService;
import com.daily.service.UserService;
@Controller
public class HomeController {
	@Autowired
	
	private UserService userService;
	@Autowired
	private PostService postService;
	
	
	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public PostService getPostService() {
		return postService;
	}

	public void setPostService(PostService postService) {
		this.postService = postService;
	}

	@RequestMapping(value="/",method=RequestMethod.GET)
	public ModelAndView getPost(){
		ModelAndView mod= new ModelAndView("index");
		List<Post> posts= postService.getAllPosts();
		mod.addObject("posts", posts);
		return mod;
		
	}
	
	@RequestMapping(value="/result",method=RequestMethod.GET)
	public String poster(){
		return "add";
	}
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String save(@ModelAttribute("post") Post post){
		
		this.postService.addPosts(post);
		return "success";
	}
	
	@RequestMapping(value="/create-post",method=RequestMethod.GET)
	public String createNewPost(){
		return "new_post";
	}
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String login(){
		return "login";
	}
	
	@RequestMapping(value="/register",method=RequestMethod.GET)
	public String register(){
		return "register";
	}
	
	
}
