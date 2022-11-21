package com.example.notas.dataprovider.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="topico")
@Getter
@Setter
public class TopicoEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private String titulo;

    @Column
    private String descricao;
}
