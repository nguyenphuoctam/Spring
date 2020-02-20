package com.phuoctam.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.phuoctam.entity.BookEntity;

public interface IBookService {
	void save(BookEntity book);

	void deleteById(Integer id);

	List<BookEntity> getListBooks();

	BookEntity getBookById(Integer bookId);

	List<Integer> getCountPage();

	List<Integer> getCountPage(String author);

	List<BookEntity> getBookOfPage(Integer page);

	List<BookEntity> searchByAuthor(Integer page, String author);

	List<BookEntity> sortByAuthor(Integer page);
}
