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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Paciente paciente01 = new Paciente();
        paciente01.setCpf("12345678910");
        paciente01.setNome("Paciente1");
        paciente01.setEndereco("End1");
        paciente01.setCidade("Cidade1");
        paciente01.setEstado("Estado1");
        paciente01.setDtNascimento("01/01/0001");
        paciente01.setCelular("99999-8888");
        paciente01.setSexo("Masculino");
        
        Paciente paciente02 = new Paciente();
        paciente02.setCpf("23456789012");
        paciente02.setNome("Paciente2");
        paciente02.setEndereco("End2");
        paciente02.setCidade("Cidade2");
        paciente02.setEstado("Estado2");
        paciente02.setDtNascimento("02/02/0002");
        paciente02.setCelular("99999-7777");
        paciente02.setSexo("Feminino");
        
        Medico medico01 = new Medico();
        medico01.setCrm(12345678);
        medico01.setNome("Med1");
        medico01.setEspecialidade("Espec1");
        medico01.setCidade("Cidade1");
        medico01.setEstado("Estado1");
        medico01.setCelular("99999-6666");
        medico01.setContato("Cont1");
        
        Medico medico02 = new Medico();
        medico02.setCrm(87654321);
        medico02.setNome("Med2");
        medico02.setEspecialidade("Espec2");
        medico02.setCidade("Cidade2");
        medico02.setEstado("Estado2");
        medico02.setCelular("99999-5555");
        medico02.setContato("Cont2");
        
        Receita receita01 = new Receita();
        receita01.setIdExame(0);
        receita01.setDescricao("Descrição1");
        receita01.setValor(200);
        
        Receita receita02 = new Receita();
        receita02.setIdExame(1);
        receita02.setDescricao("Descrição2");
        receita02.setValor(300);
        
        Prontuario pront01 = new Prontuario();
        pront01.setSintomas("Sintomas1");
        pront01.setMedicamentos("Medicamentos1");
        pront01.setHipoteseDiagnostica("HipDiag1");
        pront01.setConduta("Conduta1");
                
        Prontuario pront02 = new Prontuario();
        pront02.setSintomas("Sintomas2");
        pront02.setMedicamentos("Medicamentos2");
        pront02.setHipoteseDiagnostica("HipDiag2");
        pront02.setConduta("Conduta2");
        
        Agenda agenda01 = new Agenda();
        agenda01.setIdAgenda(0);
        agenda01.setDataAgendamento("01/01/2019");
        agenda01.setHorario(13);
        agenda01.setSituacao("Agendada");
        agenda01.setProntuario(pront01);
        
        Agenda agenda02 = new Agenda();
        agenda02.setIdAgenda(1);
        agenda02.setDataAgendamento("01/01/2019");
        agenda02.setHorario(14);
        agenda02.setSituacao("Agendada");
        agenda01.setProntuario(pront02);
        
        agenda01.addReceita(receita01);
        agenda01.listarReceitas();
        
        System.out.println("\nPaciente: " + paciente01.getNome());
        paciente01.addAgenda(agenda01);
        paciente01.listarAgendas();
        
        System.out.println("\nMedico: " + medico01.getNome());
        medico01.addAgenda(agenda02);
        medico01.listarAgendas();
    }
    
}
