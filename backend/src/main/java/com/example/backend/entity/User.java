package com.example.backend.entity;


import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
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
@Table(name = "users_dummy")
public class User {
    @Id
    @GeneratedValue ( strategy = GenerationType.SEQUENCE)
    @Column(name = "id", updatable = false)
    Long id;

    @Column(name = "username", nullable = false, unique = true)
    String username;

    @Column(name = "password_hash", nullable = false)
    String password;
}
