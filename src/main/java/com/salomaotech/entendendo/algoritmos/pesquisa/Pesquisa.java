package com.salomaotech.entendendo.algoritmos.pesquisa;

/**
 *
 * @author - www.salomaotech.com
 */
public class Pesquisa {

    public static void main(String[] args) {

        int[] lista = new int[10000000];

        for (int i = 0; i <= lista.length - 1; i++) {

            lista[i] = i;

        }

        /* pesquisa ruim, no pior dos casos realiza todas as tentativas */
        Comum comum = new Comum();
        comum.pesquisar(lista, 22000);

        /* pesquisa binária, dividir para pesquisar, muito mais rápido */
        Binaria binaria = new Binaria();
        binaria.pesquisar(lista, 22000);

        System.out.println("Tentativas: " + comum.getTentativas());
        System.out.println("Tentativas: " + binaria.getTentativas());

    }

}
