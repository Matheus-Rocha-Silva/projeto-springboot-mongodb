package com.theus.springmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.theus.springmongo.domain.Post;
import com.theus.springmongo.repository.PostRepository;
import com.theus.springmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repo;
	
	public Post findById(String id) {
		Post user = repo.findById(id);
		if(user == null) {
			throw new ObjectNotFoundException("Objeto não encontrado.");
		}
		return user;
	}
	
	public List<Post> findByTitle(String text){
		return repo.searchTitle(text);
	}
}
