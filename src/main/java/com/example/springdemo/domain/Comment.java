package com.example.springdemo.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_comment")
@Data
public class Comment {
    @Id
    private String id;
    private String userId;
    private String content;
}