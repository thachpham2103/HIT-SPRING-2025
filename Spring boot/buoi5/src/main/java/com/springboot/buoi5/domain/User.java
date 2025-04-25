package com.springboot.buoi5.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Nationalized;

@Getter
@Setter
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

}
