package com.chazan.sistema_de_ninjas_api.Missoes;

import com.chazan.sistema_de_ninjas_api.Ninjas.Entity.NinjaEntity;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_missoes")
public class MissoesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String nome;
    private String dificuldade;
    private String local;
    private NinjaEntity ninja;

    public MissoesEntity() {
    }

    public MissoesEntity(String nome, String dificuldade, String local) {
        this.nome = nome;
        this.dificuldade = dificuldade;
        this.local = local;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
}
