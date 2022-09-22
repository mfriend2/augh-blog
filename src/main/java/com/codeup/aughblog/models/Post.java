package com.codeup.aughblog.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "posts")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String body;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "book")
    private List<Comment> comments;

    public Post() {
    }

    public Post(long id, String title, String body, Author author, Book book, List<Comment> comments) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.author = author;
        this.book = book;
        this.comments = comments;
    }

    public Post(String title, String body, Author author, Book book, List<Comment> comments) {
        this.title = title;
        this.body = body;
        this.author = author;
        this.book = book;
        this.comments = comments;
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

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}
