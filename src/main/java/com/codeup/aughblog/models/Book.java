package com.codeup.aughblog.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String author;

    @Column
    private String description;

    @Column
    private String bookCover;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "book")
    private List<Post> posts;

    public Book() {
    }

    public Book(long id, String title, String author, String description, String bookCover, List<Post> posts) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.description = description;
        this.bookCover = bookCover;
        this.posts = posts;
    }

    public Book(String title, String author, String description, String bookCover, List<Post> posts) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.bookCover = bookCover;
        this.posts = posts;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public String getBookCover() {
        return bookCover;
    }

    public void setBookCover(String bookCover) {
        this.bookCover = bookCover;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }
}
