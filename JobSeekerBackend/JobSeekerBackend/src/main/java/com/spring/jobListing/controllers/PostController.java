package com.spring.jobListing.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.jobListing.models.Post;
import com.spring.jobListing.repositories.PostRepository;
import com.spring.jobListing.repositories.SearchRepository;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class PostController {
	
	@Autowired
	private PostRepository postRepository;
	@Autowired
	private SearchRepository searchRepository;
	
	@GetMapping("/allPosts")
	public List<Post> getAllPost() {
		return postRepository.findAll();
	}
	
	@GetMapping("/posts/{text}")
	public List<Post> search(@PathVariable String text) {
		return searchRepository.findByText(text);
	}
	
	@PostMapping("/post")
	public Post addPost(@RequestBody Post post) {
		return postRepository.save(post);
	}
	
}