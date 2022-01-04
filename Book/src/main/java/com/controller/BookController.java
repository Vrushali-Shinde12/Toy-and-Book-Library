package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.BookModel;
import com.service.BookService;

//@Controller
@RestController
@RequestMapping(path="/book")
public class BookController {

	@Autowired
	
	BookService bookService;
	
	@PostMapping("/insertBook")
	@ResponseBody
	public BookModel insertBook(@RequestBody BookModel b)
	{
		BookModel b1=bookService.insertBook(b);
		return b1;
	}
	
	@PutMapping(path="/updateBook")
	
	public BookModel updateBook(@RequestBody BookModel b)
	{
		BookModel b2=bookService.insertBook(b);
		return b2;
	}
	
	@GetMapping("/viewBookList")
	
		public List<BookModel> getBookList(BookModel b) {
			 List<BookModel> b3=bookService.viewBookList();
			 return b3;
		}
	}



