package com.example.JPA.Repository;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@ComponentScan
@Repository
@Component
@Entity
@Table(name = "myFirsTable")
@AllArgsConstructor
@NoArgsConstructor
@Data

public class TestRepo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "word")
    int numPalabra;


    public void save(TestRepo entidad) {
    }
}
