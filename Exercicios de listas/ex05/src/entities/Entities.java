package entities;

import java.util.Collections;
import java.util.List;

public class Entities {

    public void listaOrdemAlfabetica(List<String>list){
        Collections.sort(list);
        System.out.println("Lista em ordem alfabetica:");
        for(String listSort : list){
            System.out.println(listSort);
        }
    }

    public boolean verificarNome(List<String>list, String nome) {
        return list.contains(nome);
    }

    public int contarLetras(List<String>list){
        int contador = 0;

        for(String listLetras : list){
            if(listLetras.length() > 5 ){
                contador++;
            }
        }

        return contador;

    }
}
