package br.edu.ifrn.peoo.lista1;

import javax.swing.JOptionPane;

/**
 *
 * @author 20171144010008
 */
public class Agenda {

    private Pessoa[] pessoas;
    private int numeroAmigos;
    private int numeroConhecidos;

    public Agenda(int numeroPessoas) {
        pessoas = new Pessoa[numeroPessoas];
        for (int i = 0; i < pessoas.length; i++) {
            if (1 + (int) (Math.random() * 2) == 1) {
                pessoas[i] = new Amigo();
                numeroAmigos++;
            } else {
                pessoas[i] = new Conhecido();
                numeroConhecidos++;
            }
        }
    }

    public Pessoa[] getPessoas() {
        return pessoas;
    }

    public void setPessoas(Pessoa[] pessoas) {
        this.pessoas = pessoas;
    }

    public int getNumeroAmigos() {
        return numeroAmigos;
    }

    public void setNumeroAmigos(int numeroAmigos) {
        this.numeroAmigos = numeroAmigos;
    }

    public int getNumeroConhecidos() {
        return numeroConhecidos;
    }

    public void setNumeroConhecidos(int numeroConhecidos) {
        this.numeroConhecidos = numeroConhecidos;
    }

    public void addInformacoes() {
        for (Pessoa pessoa : pessoas) {
            if (pessoa instanceof Amigo) {
                String nome = JOptionPane.showInputDialog("Nome: ");
                int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade: "));
                String data = JOptionPane.showInputDialog("Data de Nascimento: ");
                ((Amigo) pessoa).setNome(nome);
                ((Amigo) pessoa).setIdade(idade);
                ((Amigo) pessoa).setDataNascimento(data);
            }
            if (pessoa instanceof Conhecido) {
                String nome = JOptionPane.showInputDialog("Nome: ");
                int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade: "));
                String email = JOptionPane.showInputDialog("Email: ");
                ((Conhecido) pessoa).setNome(nome);
                ((Conhecido) pessoa).setIdade(idade);
                ((Conhecido) pessoa).setEmail(email);
            }
        }
    }

    public void imprimeAniversários() {
        for (Pessoa pessoa : pessoas) {
            if (pessoa instanceof Amigo) {
                System.out.println(((Amigo) pessoa).getDataNascimento());
            }
        }
    }

    public void imprimeEmail() {
        for (Pessoa pessoa : pessoas) {
            if (pessoa instanceof Conhecido) {
                System.out.println(((Conhecido) pessoa).getEmail());
            }
        }
    }
}
