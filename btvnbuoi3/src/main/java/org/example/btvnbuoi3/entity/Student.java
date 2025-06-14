    package org.example.btvnbuoi3.entity;


    import jakarta.persistence.*;
    import lombok.*;
    import org.springframework.context.annotation.Primary;

    @Entity
    @Table(name="sinhvien")
    @AllArgsConstructor
    @NoArgsConstructor
    @Setter
    @Getter

    public class Student {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;

        @Column( name="fullname",nullable = false, length = 100)
        private String name;

        @Column(unique = true,length = 150)
        private String email;

        @Column(name="phoneNumber", length=15)
        private String phoneNumber;

        @Column(name="homeAddress",columnDefinition = "TEXT")
        private String address;

       }
