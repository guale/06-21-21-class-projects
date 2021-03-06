package com.tts.techtalentblog.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BlogPost {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String title;
	private String author;
	private String blogEntry;

	public BlogPost(String title, String author, String blogEntry){
		this.title = title;
		this.author = author;
		this.blogEntry = blogEntry;
	}

	public BlogPost(){}

	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getBlogEntry() {
		return blogEntry;
	}

/*	public void setId(long id) {
		this.id = id;
	}*/

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setBlogEntry(String blogEntry) {
		this.blogEntry = blogEntry;
	}

	@Override
	public String toString() {
		return "BlogPost{" +
				"id=" + id +
				", title='" + title + '\'' +
				", author='" + author + '\'' +
				", blogEntry='" + blogEntry + '\'' +
				'}';
	}
}
