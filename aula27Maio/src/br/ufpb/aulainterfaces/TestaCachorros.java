package br.ufpb.aulainterfaces;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCachorros {

    public static void main(String [] args){
        List<Cachorro> listaDeCachorros = new ArrayList<>();

        for (int k=0; k< 5; k++){
            String nome = JOptionPane.showInputDialog("Qual o nome do cachorro?");
            String raca = JOptionPane.showInputDialog("Qual a raça do cachorro?");
            Cachorro cachorro = new Cachorro(nome, raca);
            listaDeCachorros.add(cachorro);
        }

        Collections.sort(listaDeCachorros);

        for (Cachorro c: listaDeCachorros){
            System.out.println(c.toString());
        }


        Ser meuSer = new Cachorro("Bob", "Pequinês");
        SerComunicante meuSer2 = (SerComunicante) meuSer;
        System.out.println(meuSer2.emitirSom());

    }
}
