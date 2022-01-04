package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.BookModel;

public interface BookRepository extends JpaRepository<BookModel, Integer>{

}
