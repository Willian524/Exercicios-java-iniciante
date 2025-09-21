import entities.Entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    /**
     * Lista de nomes
     *
     * Crie um programa que leia uma lista de nomes (até o usuário digitar “fim”).
     *
     * Crie métodos para:
     *
     * Imprimir a lista em ordem alfabética.
     *
     * Verificar se um nome específico está na lista.
     *
     * Contar quantos nomes têm mais de 5 letras.
     *
     */


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        Entities entities = new Entities();
        List<String> list = new ArrayList();
        do {
            System.out.println("Digite o nome:");
            nome = sc.nextLine();
            if(!nome.equalsIgnoreCase("fim")){

                list.add(nome);
            }
        }while (!nome.equalsIgnoreCase("fim"));
        System.out.println("Lista fora de ordem:");
        for(String listt : list){
            System.out.println(listt);
        }

        System.out.println("...................");
        entities.listaOrdemAlfabetica(new ArrayList<>(list));
        System.out.println("...................");
        System.out.println("Digite o nome que procura: ");
        nome = sc.nextLine();

        if(entities.verificarNome(new ArrayList<>(list), nome)){
            System.out.println(nome);
        }
        else{
            System.out.println("Nome nao encontrado!");
        }


        System.out.println("Quantidades de nomes com mais de cinco letras: " + entities.contarLetras(list));


        sc.close();
    }
}