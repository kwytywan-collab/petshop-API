package com.senai.projeto.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@Data

public class FornecedoresEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100)
    private String RazaoSocial;
    @Column(length = 100)
    private String cnpj;
    @Column(length = 100)
    private String email;
    @Column(length = 100)
    private String telefone;
}
