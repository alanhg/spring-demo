package com.example.springdemo.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;


@Entity
@Table(name = "t_user")
@Data
public class User {
    @Id
    private String id;
    private String name;
    private String sex;
    @OneToMany(mappedBy = "userId")
    private List<Comment> comments;
}
