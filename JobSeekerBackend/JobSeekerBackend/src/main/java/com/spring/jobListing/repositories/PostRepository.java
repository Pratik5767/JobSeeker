package com.spring.jobListing.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.spring.jobListing.models.Post;


public interface PostRepository extends MongoRepository<Post, String>{

	
}
