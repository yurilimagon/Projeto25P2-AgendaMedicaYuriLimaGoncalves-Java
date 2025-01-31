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
public class Prontuario {
    //ATRIBUTOS
    private String sintomas;
    private String medicamentos;
    private String hipoteseDiagnostica;
    private String conduta;
    
    //CONSTRUTORES
    //VAZIO
    public Prontuario() {
    }
    //CHEIO
    public Prontuario(String sintomas, String medicamentos, String hipoteseDiagnostica, String conduta) {
        this.sintomas = sintomas;
        this.medicamentos = medicamentos;
        this.hipoteseDiagnostica = hipoteseDiagnostica;
        this.conduta = conduta;
    }
    
    //GETTERS E SETTERS
    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public String getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos;
    }

    public String getHipoteseDiagnostica() {
        return hipoteseDiagnostica;
    }

    public void setHipoteseDiagnostica(String hipoteseDiagnostica) {
        this.hipoteseDiagnostica = hipoteseDiagnostica;
    }

    public String getConduta() {
        return conduta;
    }

    public void setConduta(String conduta) {
        this.conduta = conduta;
    }
    
    //MÉTODOS
}
