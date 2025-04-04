package org.example.btvnbuoi4.entity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="student")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int dateBirth;
    private String gender;
    private String email;
    private String phone;

    @ManyToOne
    @JoinColumn(name = "idHp", nullable = false)
    private Module module;
}
