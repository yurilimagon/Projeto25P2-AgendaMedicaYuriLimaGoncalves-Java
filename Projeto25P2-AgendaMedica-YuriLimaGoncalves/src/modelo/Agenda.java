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
public class Agenda {
    //ATRIBUTOS
    private int idAgenda;
    private String dataAgendamento;
    private int horario;
    private String situacao;
    private Paciente paciente;
    private Medico medico;
    private Prontuario prontuario;
    private Receita receita;
    private ArrayList<Receita> receitas = new ArrayList<>();
    
    
    //CONSTRUTORES
    //VAZIO
    public Agenda() {
    }
    //CHEIO
    public Agenda(int idAgenda, String dataAgendamento, int horario, String situacao, Paciente paciente, Medico medico, Prontuario prontuario, Receita receita) {
        this.idAgenda = idAgenda;
        this.dataAgendamento = dataAgendamento;
        this.horario = horario;
        this.situacao = situacao;
        this.paciente = paciente;
        this.medico = medico;
        this.prontuario = prontuario;
        this.receita = receita;
    }
    
    
    //GETTERS E SETTERS
    public int getIdAgenda() {
        return idAgenda;
    }

    public void setIdAgenda(int idAgenda) {
        this.idAgenda = idAgenda;
    }

    public String getDataAgendamento() {
        return dataAgendamento;
    }

    public void setDataAgendamento(String dataAgendamento) {
        this.dataAgendamento = dataAgendamento;
    }

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Prontuario getProntuario() {
        return prontuario;
    }

    public void setProntuario(Prontuario prontuario) {
        this.prontuario = prontuario;
    }

    public Receita getReceita() {
        return receita;
    }

    public void setReceita(Receita receita) {
        this.receita = receita;
    }

    public ArrayList<Receita> getReceitas() {
        return receitas;
    }

    public void setReceitas(ArrayList<Receita> receitas) {
        this.receitas = receitas;
    }
    
    //MÉTODOS
    public void addReceita(Receita objReceita){
        receitas.add(objReceita);
    }
    
    public void listarReceitas(){
        for(int i = 0; i < receitas.size(); i++){
            System.out.println("\nidExame: " + receitas.get(i).getIdExame() + "\nDescrição: " + receitas.get(i).getDescricao() + 
                               "\nValor: " + receitas.get(i).getValor());
        }
    }
}
