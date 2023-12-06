package com.salomaotech.entendendo.algoritmos.pesquisa;

/**
 *
 * @author - www.salomaotech.com
 */
public class Comum {

    private int tentativas = 0;

    public int pesquisar(int[] lista, int item) {

        for (int i = 0; i <= (lista.length - 1); i++) {

            if (lista[i] == item) {

                /* retorna em qual posição está o item a ser pesquisado */
                return i;

            }

            tentativas++;

        }

        return tentativas;

    }

    public int getTentativas() {
        return tentativas;
    }

}
