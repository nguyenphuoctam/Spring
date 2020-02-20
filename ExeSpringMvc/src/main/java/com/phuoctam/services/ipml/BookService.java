package com.phuoctam.services.ipml;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phuoctam.entity.BookEntity;
import com.phuoctam.services.IBookService;
import com.phuoctam.repositories.RepoBook;

@Service
public class BookService implements IBookService {

	@Autowired
	RepoBook repoBook;

	public void save(BookEntity book) {
		// TODO Auto-generated method stub

	}

	public void deleteById(Integer id) {
		// TODO Auto-generated method stub

	}

	public List<BookEntity> getListBooks() {
		return repoBook.findAll();
	}

	public BookEntity getBookById(Integer bookId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Integer> getCountPage() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Integer> getCountPage(String author) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<BookEntity> getBookOfPage(Integer page) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<BookEntity> searchByAuthor(Integer page, String author) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<BookEntity> sortByAuthor(Integer page) {
		// TODO Auto-generated method stub
		return null;
	}

}
