package com.phuoctam.mode;

import java.util.Calendar;
import java.util.Date;

import com.phuoctam.entity.BookEntity;

public class Book {
    private Integer id;
    private String title;
    private String author;
    private String description;
    private Date created_at;
    private Date updated_at;

    public Book() {
    }
    public Book(BookEntity bookEntity) {
        this.id = bookEntity.getId();
        this.title = bookEntity.getTitle();
        this.author = bookEntity.getAuthor();
        this.description = bookEntity.getDescription();
        this.created_at = bookEntity.getCreatedAt();
        this.updated_at = bookEntity.getUpdatedAt();
    }
	
    
}
