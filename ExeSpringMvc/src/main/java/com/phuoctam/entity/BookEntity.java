package com.phuoctam.entity;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tblbook")
public class BookEntity {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "title", nullable = false)
	private String title;
	
	@Column(name = "author", nullable = false)
	private String author;
	
	@Column(name = "description",nullable = false)
	private String description;
	
	@Column(name = "created_at", nullable = false)
	private Date createdAt;
	
	@Column(name = "updated_at")
	private Date updatedAt;

	public BookEntity() {
	}

//	public BookEntity(int id, String title, String author, String description, Calendar createdAt, Calendar updatedAt) {
//		super();
//		this.id = id;
//		this.title = title;
//		this.author = author;
//		this.description = description;
//		this.createdAt = createdAt;
//		this.updatedAt = updatedAt;
//	}

	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id + "-" + title + "-" + author + "-" + description + "-" + createdAt + "-" + updatedAt;
	}
	/*
	 * id; private String title; private String author; private String description;
	 * private Calendar createdAt; private Calendar updatedAt;
	 */

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
}
