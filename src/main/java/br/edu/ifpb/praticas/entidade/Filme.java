package br.edu.ifpb.praticas.entidade;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by diogomoreira on 28/08/16.
 */
@Entity
public class Filme implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String nome;
    private String Genero;
    private int ano;
    private int nota;

    public Filme() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Filme{" + "id=" + id + ", nome=" + nome + ", G\u00eanero=" + Genero + ", ano=" + ano + ", nota=" + nota + '}';
    }

}
