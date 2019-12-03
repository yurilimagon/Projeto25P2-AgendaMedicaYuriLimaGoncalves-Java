/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author yuril
 */
public class Paciente {
    //ATRIBUTOS
    private String cpf;
    private String nome;
    private String endereco;
    private String cidade;
    private String estado;
    private String dtNascimento;
    private String celular;
    private String sexo;
    private Agenda agenda;
    private ArrayList<Agenda> agendas = new ArrayList<>();
    
    //CONSTRUTORES
    //VAZIO
    public Paciente() {
    }
    //CHEIO
    public Paciente(String cpf, String nome, String endereco, String cidade, String estado, String dtNascimento, String celular, String sexo, Agenda agendas) {
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.dtNascimento = dtNascimento;
        this.celular = celular;
        this.sexo = sexo;
        this.agenda = agenda;
    }
    
    //GETTERS E SETTERS
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(String dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Agenda getAgenda() {
        return agenda;
    }

    public void setAgenda(Agenda agenda) {
        this.agenda = agenda;
    }

    public ArrayList<Agenda> getAgendas() {
        return agendas;
    }

    public void setAgendas(ArrayList<Agenda> agendas) {
        this.agendas = agendas;
    }
    
    //MÉTODOS
    public void addAgenda(Agenda objAgenda){
        agendas.add(objAgenda);
    }
    
    public void listarAgendas(){
        for(int i = 0; i < agendas.size(); i++){
            System.out.println("\nidAgenda: " + agendas.get(i).getIdAgenda() + "\nData Agendamento: " + agendas.get(i).getDataAgendamento() + 
                               "\nHorário: " + agendas.get(i).getHorario() + "\nSituação: " + agendas.get(i).getSituacao());
        }
    }
}
