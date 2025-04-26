package com.springboot.buoi5.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Nationalized;

//@Getter
//@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name=" users")

public class User {
    @Id
    @GeneratedValue(generator ="uuid2")
    @GenericGenerator(name="uuid2", strategy="org.hibernate.id.UUIDGenerator")
    @Column(insertable = false,updatable = false,nullable = false, columnDefinition = "CHAR(36)")
    private String id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    @JsonIgnore // không để lộ password qua API
    private String password;

    @Column(nullable = false)
    @Nationalized
    private String firstName;

    @Column(nullable = false)
    @Nationalized
    private String lastName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
