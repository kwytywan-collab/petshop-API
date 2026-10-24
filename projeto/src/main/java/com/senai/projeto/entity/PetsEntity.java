package com.senai.projeto.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor

public class PetsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @Column(length = 100)
    private String nome;
    @Column(length = 100)
    private String especie;
    @Column(length = 100)
    private String raca;
    @Column(length = 100)
    private String clienteId;

}
