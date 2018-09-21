package br.edu.ifrn.peoo.lista1;

/**
 *
 * @author 20171144010008
 */
public class Amigo extends Pessoa {

    private String dataNascimento;

    public Amigo(){
        this.dataNascimento = "Indefinido";
    }
    
    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
}
