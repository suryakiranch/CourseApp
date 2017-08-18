package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.Author;
import com.example.demo.repository.AuthorRepository;

@Service
public class AuthorService {

	@Autowired
	private AuthorRepository authorRepository;

	public Author createAuthor(Author author) throws Exception {
		return authorRepository.save(author);
	}

	public Author updateAuthor(Author author) throws Exception {
		return authorRepository.save(author);
	}

	public void deleteAuthor(Long aid) throws Exception {
		authorRepository.delete(aid);
	}

	public List<Author> getAllAuthors() throws Exception {
		return  authorRepository.findAll();
	}

	public Author getAuthorById(Long aid) throws Exception {
		return authorRepository.findOne(aid);
	}

}
