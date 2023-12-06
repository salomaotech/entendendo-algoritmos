package com.salomaotech.entendendo.algoritmos.pesquisa;

/**
 *
 * @author - www.salomaotech.com
 */
public class Binaria {

    private int tentativas = 0;

    public int pesquisar(int[] lista, int item) {

        int baixo = 0;
        int alto = lista.length - 1;

        while (baixo <= alto) {

            int meio = (baixo + alto) / 2;
            int chute = lista[meio];

            if (chute == item) {

                /* retorna se o item está na lista */
                return meio;

            }

            if (chute > item) {

                alto = meio - 1;

            } else {

                baixo = meio + 1;

            }

            tentativas++;

        }

        return -1;

    }

    public int getTentativas() {
        return tentativas;
    }

}
