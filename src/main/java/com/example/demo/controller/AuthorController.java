package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Author;
import com.example.demo.service.AuthorService;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("author")
public class AuthorController {

	@Autowired
	private AuthorService authorService;

	@PostMapping
	public Author createAuthor(@RequestBody Author author) throws Exception {
		return authorService.createAuthor(author);

	}

	@PutMapping
	public Author updateAuthor(@RequestBody Author author) throws Exception {

		return authorService.updateAuthor(author);
	}

	@DeleteMapping(value = "/{authorId}")
	public ResponseEntity<HttpStatus> deleteAuthor(@PathVariable("authorId") Long aid) throws Exception {

		authorService.deleteAuthor(aid);

		return new ResponseEntity<HttpStatus>(HttpStatus.OK);
	}

	@GetMapping
	public List<Author> getAllAuthors() throws Exception {
		return authorService.getAllAuthors();
	}

	@GetMapping(value = "/{authorId}")
	public Author getAuthorById(@PathVariable("authorId") Long aid) throws Exception {
		return authorService.getAuthorById(aid);
	}

}
