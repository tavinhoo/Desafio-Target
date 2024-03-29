import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        /* ---------------------------------------------- */
        // ->> DESAFIO 1:
        /* ---------------------------------------------- */
        int K = 0;
        int soma = 0;

        while (K < 13) {
            K += 1;
            soma += K;
        }

        // Resultado: 91
        System.out.println(soma);

        /* ---------------------------------------------- */
        // ->> DESAFIO 2:
        /* ---------------------------------------------- */

        int qtdElementos = 1000;

        int[] fibonacci = new int[qtdElementos];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        // Entrada do usuário.
        int numeroInformado = 10;

        for (int i = 2; i < fibonacci.length; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        boolean nEstaPresente = false;

        for (int i : fibonacci) {
            if (i == numeroInformado) {
                nEstaPresente = true;
                break;
            }
        }

        if (nEstaPresente) {
            System.out.println("Este numero está presente na sequência de Fibonacci! ");
        } else {
            System.out.println("Este numero não está presente na sequência de Fibonacci! ");
        }

        /* ---------------------------------------------- */
        // ->> DESAFIO 3:
        /* ---------------------------------------------- */
        /*
         * a) a) 1, 3, 5, 7, "9"
         * 
         * b) 2, 4, 8, 16, 32, 64, "128"
         * 
         * c) 0, 1, 4, 9, 16, 25, 36, "49"
         * 
         * d) 4, 16, 36, 64, "100"
         * 
         * e) 1, 1, 2, 3, 5, 8, "13"
         * 
         * f) 2,10, 12, 16, 17, 18, 19, 20
         * 
         */

        /* ---------------------------------------------- */
        // ->> DESAFIO 4:
        /* ---------------------------------------------- */

        /* 
        
         - Ligar dois dos três interruptores.
             Passar pelas salas.

         - Desligar um dos dois interruptores acionados anteriormente
             Passar pelas salas

        Conclusão: 
        
        Na primeira ida, 2 interruptores acionados acendem 2 lampadas(primeira ida) - 
            - A lâmpada que estiver apagada com 2 interruptores ligados, é controlada pelo interruptor desligado(encontramos uma, restam duas)
        Desativar um dos interruptores acionados apagará uma lâmpada que anteriormente estava acesa (segunda ida)
            - A lâmpada que estiver apagada é controlada pelo interruptor desligado(dos dois que anteriormente estavam acionados) e a que estiver acesa
            é controlada pelo interruptor que continuou acionado.

        [DÚVIDA]: Como você faria para descobrir, usando apenas """"duas idas até *uma* das salas das lâmpadas""", qual interruptor controla cada lâmpada?
        
        */

        /* ---------------------------------------------- */
        // ->> DESAFIO 5:
        /* ---------------------------------------------- */

        String palavraQualquer = "Target Sistemas";
        String palavraInvertida = "";
        String[] vetorDeLetras = palavraQualquer.split("");

        for (int i = palavraQualquer.length() - 1; i >= 0; i--) {
            palavraInvertida += vetorDeLetras[i];
        }
        // output: sametsiS tegraT
        System.out.println(palavraInvertida);
    }
}
