package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.BookModel;
import com.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	
	BookRepository bookRepo;

	public BookModel insertBook(BookModel b) {
		bookRepo.save(b);
		return b;
	}

	
	  public BookModel updateBook(BookModel b) {
		  int id=b.getBookId(); 
		
		  BookModel be=bookRepo.findById(id).orElseThrow(null);
	
	  be.setAuthor(be.getAuthor());
	  be.setPrice(be.getPrice());
	  be.setPublication(be.getPublication()); 
	  be.setTitle(be.getPublication());
	  bookRepo.save(be);
	  return be;
	  
	  }
	 
	
	public List<BookModel> viewBookList(){
		List<BookModel> l=bookRepo.findAll();
		return l;
	}


}


