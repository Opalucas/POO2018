package br.edu.ifrn.peoo.lista1;

import java.util.Scanner;

/**
 *
 * @author 20171144010008
 */
public class TesteAgenda {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Número de pessoas: ");
        int numeroPessoa = teclado.nextInt();
        
        Agenda agenda = new Agenda(numeroPessoa);
        System.out.println(agenda.getNumeroAmigos() + "\n" + agenda.getNumeroConhecidos());
        System.out.println("Deseja adicionar informações na agenda? ");
        System.out.println("1 - Sim   2 - Não");
        int numeroResposta = teclado.nextInt();
        
        if (numeroResposta == 1) {
            agenda.addInformacoes();
            
        } else {
            System.out.println("Até mais!");
        }
    }
}
