package com.chazan.sistema_de_ninjas_api.Ninjas.Entity;

import com.chazan.sistema_de_ninjas_api.Missoes.MissoesEntity;
import jakarta.persistence.*;

import java.util.List;

//JPA = Java Persistence API

// Entity: transforma uma classe em uma entidade no BD
@Entity
// Table: designa a tabela especifica que vai se relacionar com o BD
@Table(name = "tb_cadastro_Ninjas")
public class NinjaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String nome;
    private String email;
    private int idade;

    // Nesse contexto o ManyToOne representa vários ninjas para 1 missão
    @ManyToOne()
    // Foreing Key ou chave estrangeira
    @JoinColumn(name = "missoes_id")
    private MissoesEntity missoes;

    public NinjaEntity() {
    }

    public NinjaEntity(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
