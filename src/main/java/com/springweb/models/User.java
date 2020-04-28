package com.springweb.models;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class User {
    @Id
    private Integer id;
    private String username;
    private String passwordcapital;

    public User() {
    }

    public User(Integer id, String username, String passwordcapital) {
        this.id = id;
        this.username = username;
        this.passwordcapital = passwordcapital;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswordcapital() {
        return passwordcapital;
    }

    public void setPasswordcapital(String passwordcapital) {
        this.passwordcapital = passwordcapital;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", passwordcapital='" + passwordcapital + '\'' +
                '}';
    }
}
