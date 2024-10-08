package com.ayrton.projects.controller.controller;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ayrton.projects.controller.domain.Post;

import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/posts")
public class PostController {
	
	private static final Logger logger = LoggerFactory.getLogger(PostController.class);
	
	// Este metodo irá gerir excpção generica 
	@RequestMapping("/get/{slug}")
	public String getPost(@PathVariable(value="slug") String slug) throws Exception {
		Post post = null;
		
		if (post == null) {
			throw new Exception("We could not find the post with slug:" + slug);
		}
		
		return "post";
	}
	
	/*
	// Este metodo irá gerir qualquer exception
	@ExceptionHandler(Exception.class)
	public String handlException1(HttpServletRequest req, Exception exception, Model model) {
		model.addAttribute("errorMessage", exception.getMessage());
		return "postError";
	}
	*/
	
}
