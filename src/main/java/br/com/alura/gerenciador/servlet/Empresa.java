package br.com.alura.gerenciador.servlet;


import java.util.Date;

public class Empresa {

    private Long id;
    private String nome;
    private Date dataAbertura;

    public Empresa(String nome, Date dataAbertura) {
        this.nome = nome;
        this.dataAbertura = dataAbertura;
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

    public Date getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Date dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
