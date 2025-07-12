package com.theus.springmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.theus.springmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
