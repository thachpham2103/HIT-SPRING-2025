package org.example.btvnbuoi2.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="user")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class Employee {
    @Id
    @Column(name="id", length=20)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="name", length=40)
    private String name;
    @Column(name="email", length=50)
    private String email;
    @Column(name="address", length=100)
    private String address;
    @Column(name="phone", length=60)
    private String phone;

}
