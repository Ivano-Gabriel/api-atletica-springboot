package com.uninassau.ateltica;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



@Entity
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nome;
    private int matricula;
    private String esporte;
    private String experiencia;
    private String status = "PENDENTE";
    private String curso;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    
    public int getMatricula() { return matricula; }
    public void setMatricula(int matricula) { this.matricula = matricula; }
    
    public String getEsporte() { return esporte; }
    public void setEsporte(String esporte) { this.esporte = esporte; }
    
    public String getExperiencia() { return experiencia; }
    public void setExperiencia(String experiencia) { this.experiencia = experiencia; }
    
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    
    public String getCurso() { return curso; }
    public void setCurso(String curso) { this.curso = curso; }
}