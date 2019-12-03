/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author yuril
 */
public class Medico {
    //ATRIBUTOS
    private int crm;
    private String nome;
    private String especialidade;
    private String cidade;
    private String estado;
    private String celular;
    private String contato;
    private Agenda agenda;
    private ArrayList<Agenda> agendas = new ArrayList<>();
    
    //CONSTRUTORES
    //VAZIO
    public Medico() {
    }
    //CHEIO
    public Medico(int crm, String nome, String especialidade, String cidade, String estado, String celular, String contato, Agenda agenda) {
        this.crm = crm;
        this.nome = nome;
        this.especialidade = especialidade;
        this.cidade = cidade;
        this.estado = estado;
        this.celular = celular;
        this.contato = contato;
        this.agenda = agenda;
    }
    
    //GETTERS E SETTERS
    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
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

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
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
