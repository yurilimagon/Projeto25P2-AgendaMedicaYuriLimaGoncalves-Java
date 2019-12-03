/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author yuril
 */
public class Receita {
    //ATRIBUTOS
    private int idExame;
    private String descricao;
    private double valor;
    
    //CONSTRUTORES
    //VAZIO
    public Receita() {
    }
    //CHEIO
    public Receita(int idExame, String descricao, double valor) {
        this.idExame = idExame;
        this.descricao = descricao;
        this.valor = valor;
    }
    
    //GETTERS E SETTERS
    public int getIdExame() {
        return idExame;
    }

    public void setIdExame(int idExame) {
        this.idExame = idExame;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    //MÉTODOS
}
