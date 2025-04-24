package school.sptech.entity;

import jakarta.persistence.*;

import javax.print.attribute.standard.DateTimeAtCompleted;
import java.time.LocalDate;

@Entity
@Table(name = "banda")
public class Banda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nome;

    private LocalDate dataEntrada;

    private Integer idade;


    private String papel;

    public Banda() {}

    public Banda(String nome, LocalDate dataEntrada, Integer idade, String papel) {
        this.id = id;
        this.nome = nome;
        this.dataEntrada = dataEntrada;
        this.idade = idade;
        this.papel = papel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getPapel() {
        return papel;
    }

    public void setPapel(String papel) {
        this.papel = papel;
    }
}
