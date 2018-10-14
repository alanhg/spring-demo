package com.example.springdemo.domain;

import com.example.springdemo.constant.Sex;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "t_user")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    private String id;
    private String name;
    @Enumerated(EnumType.STRING)
    private Sex sex;
    @OneToMany(mappedBy = "userId")
    private List<Comment> comments;
}
