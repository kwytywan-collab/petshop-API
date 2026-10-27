package com.senai.projeto.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table (name = "tab_servicos")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ServicosEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100)
    private String nome;
    @Column(length = 100)
    private String descricao;
    @Column(length = 100)
    private int preco;
    @Column(length = 100)
    private int duracaoMinutos;
}
