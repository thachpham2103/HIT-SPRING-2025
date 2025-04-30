package btvnbuoi6springboot.btvnbuoi6.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
//@Getter
//@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="positions")
@Data

public class Positions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 20)
    private Long id;

    @Column(name="title", nullable = false, unique = true, length = 100)
    private String title;

    @Column(columnDefinition = "TEXT")
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
