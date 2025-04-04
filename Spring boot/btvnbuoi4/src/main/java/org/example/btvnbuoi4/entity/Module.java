package org.example.btvnbuoi4.entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@Table(name="hocphan")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Module {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long idHp;

    private String tenHp;
    private String subject;

    @OneToMany(mappedBy = "module", cascade = CascadeType.ALL)
    private List<Student> students;
}
