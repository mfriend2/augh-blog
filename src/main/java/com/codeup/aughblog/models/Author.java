package com.codeup.aughblog.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="authors")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 50, unique = true)
    private String username;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column
    private String profilePicUrl;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "author")
    private List<Post> posts;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "author")
    private List<Comment> comments;

    public Author() {
    }

    public Author(long id, String username, String email, String password, String profilePicUrl, List<Post> posts, List<Comment> comments) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.profilePicUrl = profilePicUrl;
        this.posts = posts;
        this.comments = comments;
    }

    public Author(String username, String email, String password, String profilePicUrl, List<Post> posts, List<Comment> comments) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.profilePicUrl = profilePicUrl;
        this.posts = posts;
        this.comments = comments;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public String getProfilePicUrl() {
        return profilePicUrl;
    }

    public void setProfilePicUrl(String profilePicUrl) {
        this.profilePicUrl = profilePicUrl;
    }
}
