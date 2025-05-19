package com.spring.jobListing.repositories;

import java.util.List;

import com.spring.jobListing.models.Post;

public interface SearchRepository {
	

	List<Post> findByText(String text);

}
