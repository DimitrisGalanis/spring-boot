package com.example.backend.entity;


import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Users_dummy")
public class User {
    @Id
    @UuidGenerator
    @Column(name = "id", unique = true, updatable = false)
    String id;

    @Column(name = "username", nullable = false)
    String username;

    @Column(name = "password_hash", nullable = false)
    String password;
}
