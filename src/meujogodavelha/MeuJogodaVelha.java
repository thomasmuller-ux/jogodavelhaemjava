package meujogodavelha;

import java.util.Random;
import java.util.Scanner;

public class MeuJogodaVelha {

    static String[][] matrizPessoa = {{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}}; //DECLARANDO A MATRIZ MÁQUINA

    public static String Matriz() { //MOSTRANDO A MATRIZ PESSOA
        for (int i = 0; i < matrizPessoa.length; i++) {
            for (int j = 0; j < matrizPessoa.length; j++) {
                System.out.printf("   " + matrizPessoa[i][j]);
            }
            System.out.println("\n |---+---+---|");
        }
        return null;
    }

    public static boolean VerificaCasa(String p) { //PERCORRENDO CADA LINHA E COLUNA DA MATRIZ PESSOA
        for (int i = 0; i < matrizPessoa.length; i++) {
            for (int j = 0; j < matrizPessoa.length; j++) {
                if (matrizPessoa[i][j].equals(p)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void SubstituindoLetras(String p, String j) { //SUBSTITUINDO O NUMERO PELO SIMBOLO CORRESPONDENTE
        switch (p) {
            case "1":
                matrizPessoa[0][0] = j;
                break;
            case "2":
                matrizPessoa[0][1] = j;
                break;
            case "3":
                matrizPessoa[0][2] = j;
                break;
            case "4":
                matrizPessoa[1][0] = j;
                break;
            case "5":
                matrizPessoa[1][1] = j;
                break;
            case "6":
                matrizPessoa[1][2] = j;
                break;
            case "7":
                matrizPessoa[2][0] = j;
                break;
            case "8":
                matrizPessoa[2][1] = j;
                break;
            case "9":
                matrizPessoa[2][2] = j;
                break;
        }
    }

    public static String Vencedor(int vez) { //DESCOBRIR E DECLARAR O VENCEDOR DO JOGO DA VELHA CONTRA MÁQUINA
        String vencedor = "null";
        if (matrizPessoa[0][0] == "X" && matrizPessoa[0][1] == "X" && matrizPessoa[0][2] == "X") {
            vencedor = "X";
        } else if (matrizPessoa[1][0] == "X" && matrizPessoa[1][1] == "X" && matrizPessoa[1][2] == "X") {
            vencedor = "X";
        } else if (matrizPessoa[2][0] == "X" && matrizPessoa[2][1] == "X" && matrizPessoa[2][2] == "X") {
            vencedor = "X";
        } else if (matrizPessoa[0][0] == "X" && matrizPessoa[0][1] == "X" && matrizPessoa[0][2] == "X") {
            vencedor = "X";
        } else if (matrizPessoa[0][0] == "X" && matrizPessoa[1][0] == "X" && matrizPessoa[2][0] == "X") {
            vencedor = "X";
        } else if (matrizPessoa[0][1] == "X" && matrizPessoa[1][1] == "X" && matrizPessoa[2][1] == "X") {
            vencedor = "X";
        } else if (matrizPessoa[0][2] == "X" && matrizPessoa[1][2] == "X" && matrizPessoa[2][2] == "X") {
            vencedor = "X";
        } else if (matrizPessoa[0][0] == "X" && matrizPessoa[1][1] == "X" && matrizPessoa[2][2] == "X") {
            vencedor = "X";
        } else if (matrizPessoa[0][2] == "X" && matrizPessoa[1][1] == "X" && matrizPessoa[2][0] == "X") {
            vencedor = "X";
        } else if (matrizPessoa[0][0] == "X" && matrizPessoa[0][1] == "X" && matrizPessoa[0][2] == "X") {
            vencedor = "X";
        } else if (matrizPessoa[1][0] == "O" && matrizPessoa[1][1] == "O" && matrizPessoa[1][2] == "O") {
            vencedor = "O";
        } else if (matrizPessoa[2][0] == "O" && matrizPessoa[2][1] == "O" && matrizPessoa[2][2] == "O") {
            vencedor = "O";
        } else if (matrizPessoa[0][0] == "O" && matrizPessoa[0][1] == "O" && matrizPessoa[0][2] == "O") {
            vencedor = "O";
        } else if (matrizPessoa[0][1] == "O" && matrizPessoa[1][1] == "O" && matrizPessoa[2][1] == "O") {
            vencedor = "O";
        } else if (matrizPessoa[0][0] == "0" && matrizPessoa[1][0] == "0" && matrizPessoa[2][0] == "O") {
            vencedor = "O";
        } else if (matrizPessoa[0][2] == "O" && matrizPessoa[1][2] == "O" && matrizPessoa[2][2] == "O") {
            vencedor = "O";
        } else if (matrizPessoa[0][0] == "O" && matrizPessoa[1][1] == "O" && matrizPessoa[2][2] == "O") {
            vencedor = "O";
        } else if (matrizPessoa[0][2] == "O" && matrizPessoa[1][1] == "O" && matrizPessoa[2][0] == "O") {
            vencedor = "O";
        } else if (vez == 9) {
            vencedor = "Empate";
        }
        return vencedor;
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random aleatorio = new Random();
        String posicaoPessoa; //DECLARANDO A VARIÁVEL POSIÇÃO PESSOA
        int posicao = 0; //DECLARANDO A VARIÁVEL POSIÇÃO 
        int valendo = 0; //ENQUANTO VALER 0, A JOGADA NÃO É VALIDA REPETINDO ATÉ QUE A JOGADA SEJA VÁLIDA, E ELE VALERÁ 1, PASSANDO PRO SEGUNDO JOGADOR 
        int jogadas = 0; //CONTADOR DAS JOGADAS

        System.out.println("");
        System.out.println("----------JOGO-DA-VELHA----------");
        System.out.println("");

        System.out.println("Você deseja jogar com o computador ou com outra pessoa? "
                + "Digite COMP para jogar com o computador ou PESSOA para jogar com outra pessoa. ");
        String decisao = ler.next();

        System.out.println("");
        System.out.println("----------JOGO-DA-VELHA----------");
        System.out.println("");

        switch (decisao) {
            case "PESSOA":
                System.out.print("Qual o nome do Jogador 1? ");
                String decisao2 = ler.next();
                System.out.print("Qual o nome do Jogador 2? ");
                String decisao4 = ler.next();
                System.out.print("O jogador " + decisao2 + " quer jogar com X ou O? ");
                String decisao5 = ler.next();
                int comeca = aleatorio.nextInt(2) + 1;

                if (comeca == 1) { //SE FOR 1 O JOGADOR X INICIA
                    System.out.println("");
                    System.out.println(decisao2 + " começa.");
                    System.out.println("");

                    if (decisao5.equals("X")) {
                        while (true) {

                            Matriz();

                            do { //FAÇA ENQUANTO VALENDO = 0
                                System.out.println("");
                                System.out.println(decisao2 + " , informe uma posição: ");
                                posicaoPessoa = ler.next();
                                while (!VerificaCasa(posicaoPessoa)) { //SE O NÚMERO DIGITADO JÁ ESTIVER PREENCHIDO  
                                    System.out.println("Essa posição está ocupada, tente novamente! ");
                                    System.out.println(decisao2 + " , informe outra posição: ");
                                    posicaoPessoa = ler.next();
                                    valendo = 0;
                                }
                                SubstituindoLetras(posicaoPessoa, "X"); //SUBSTITUINDO O NÚMERO POR X 
                                valendo = 1; //VALENDO ESTÁ VALENDO 1 ENTÃO É O FIM DO CICLO
                            } while (valendo == 0); //FIM JOGADOR PESSOA

                            jogadas++;
                            valendo = 0; //VOLTA A VALER 0 PORQUE PARA FAZER OUTRO CICLO PARA O JOGADOR O
                            Matriz();
                            if (!Vencedor(jogadas).equals("null")) { //SE NÃO FOR NULO PARA, QUEBRANDO O WHILE
                                break;
                            }
                            do { //MESMA COISA
                                System.out.println("");
                                System.out.println(decisao4 + " , informe uma posição: ");
                                posicaoPessoa = ler.next();
                                while (!VerificaCasa(posicaoPessoa)) {
                                    System.out.println("Essa posição está ocupada, tente novamente! ");
                                    System.out.println(decisao4 + " , informe outra posição: ");
                                    posicaoPessoa = ler.next();
                                    valendo = 0;
                                }
                                SubstituindoLetras(posicaoPessoa, "O");
                                valendo = 1;
                            } while (valendo == 0);

                            jogadas++;
                            valendo = 0;
                            if (!Vencedor(jogadas).equals("null")) {
                                break;
                            }
                        }
                        System.out.println("O jogador que jogou com " + Vencedor(jogadas) + " venceu!");
                        break;
                    } else if (decisao5.equals("O")) {
                        while (true) {//MESMA COISA

                            Matriz();

                            do {
                                System.out.println("");
                                System.out.println(decisao2 + " , informe uma posição: ");
                                posicaoPessoa = ler.next();
                                while (!VerificaCasa(posicaoPessoa)) {
                                    System.out.println("Essa posição está ocupada, tente novamente! ");
                                    System.out.println(decisao2 + " , informe outra posição: ");
                                    posicaoPessoa = ler.next();
                                    valendo = 0;
                                }
                                SubstituindoLetras(posicaoPessoa, "O");
                                valendo = 1;
                            } while (valendo == 0);

                            jogadas++;
                            valendo = 0;
                            Matriz();
                            if (!Vencedor(jogadas).equals("null")) {
                                break;
                            }
                            do {
                                System.out.println("");
                                System.out.println(decisao4 + " , informe uma posição: ");
                                posicaoPessoa = ler.next();
                                while (!VerificaCasa(posicaoPessoa)) {
                                    System.out.println("Essa posição está ocupada, tente novamente! ");
                                    System.out.println(decisao4 + " , informe outra posição: ");
                                    posicaoPessoa = ler.next();
                                    valendo = 0;
                                }
                                SubstituindoLetras(posicaoPessoa, "X");
                                valendo = 1;
                            } while (valendo == 0);

                            jogadas++;
                            valendo = 0;
                            if (!Vencedor(jogadas).equals("null")) {
                                break;
                            }
                        }

                        System.out.println("O jogador que jogou com " + Vencedor(jogadas) + " venceu!");
                        break;

                    }
                } else if (comeca == 2) {
                    System.out.println("");
                    System.out.println(decisao4 + " começa.");
                    System.out.println("");

                    if (decisao5.equals("X")) {
                        while (true) {

                            Matriz();

                            do {
                                System.out.println("");
                                System.out.println(decisao4 + " , informe uma posição: ");
                                posicaoPessoa = ler.next();
                                while (!VerificaCasa(posicaoPessoa)) {
                                    System.out.println("Essa posição está ocupada, tente novamente! ");
                                    System.out.println(decisao4 + " , informe outra posição: ");
                                    posicaoPessoa = ler.next();
                                    valendo = 0;
                                }
                                SubstituindoLetras(posicaoPessoa, "O");
                                valendo = 1;
                            } while (valendo == 0);

                            jogadas++;
                            valendo = 0;
                            Matriz();
                            if (!Vencedor(jogadas).equals("null")) {
                                break;
                            }
                            do { //MESMA COISA
                                System.out.println("");
                                System.out.println(decisao2 + " , informe uma posição: ");
                                posicaoPessoa = ler.next();
                                while (!VerificaCasa(posicaoPessoa)) {
                                    System.out.println("Essa posição está ocupada, tente novamente! ");
                                    System.out.println(decisao2 + " , informe outra posição: ");
                                    posicaoPessoa = ler.next();
                                    valendo = 0;
                                }
                                SubstituindoLetras(posicaoPessoa, "X");
                                valendo = 1;
                            } while (valendo == 0);

                            jogadas++;
                            valendo = 0;
                            if (!Vencedor(jogadas).equals("null")) {
                                break;
                            }
                        }
                        System.out.println("O jogador que jogou com " + Vencedor(jogadas) + " venceu!");
                        break;
                    } else if (decisao5.equals("O")) {
                        while (true) {//MESMA COISA

                            Matriz();

                            do {
                                System.out.println("");
                                System.out.println(decisao4 + " , informe uma posição: ");
                                posicaoPessoa = ler.next();
                                while (!VerificaCasa(posicaoPessoa)) {
                                    System.out.println("Essa posição está ocupada, tente novamente! ");
                                    System.out.println(decisao4 + " , informe outra posição: ");
                                    posicaoPessoa = ler.next();
                                    valendo = 0;
                                }
                                SubstituindoLetras(posicaoPessoa, "O");
                                valendo = 1;
                            } while (valendo == 0);

                            jogadas++;
                            valendo = 0;
                            Matriz();
                            if (!Vencedor(jogadas).equals("null")) {
                                break;
                            }
                            do {
                                System.out.println("");
                                System.out.println(decisao2 + " , informe uma posição: ");
                                posicaoPessoa = ler.next();
                                while (!VerificaCasa(posicaoPessoa)) {
                                    System.out.println("Essa posição está ocupada, tente novamente! ");
                                    System.out.println(decisao2 + " , informe outra posição: ");
                                    posicaoPessoa = ler.next();
                                    valendo = 0;
                                }
                                SubstituindoLetras(posicaoPessoa, "X");
                                valendo = 1;
                            } while (valendo == 0);

                            jogadas++;
                            valendo = 0;
                            if (!Vencedor(jogadas).equals("null")) {
                                break;
                            }
                        }

                        System.out.println("O jogador que jogou com " + Vencedor(jogadas) + " venceu!");
                        break;

                    }
                }

                break;
            case "COMP": //CASO SEJA DIGITADO COMP
                System.out.print("Qual o seu nome? ");
                String decisao14 = ler.next();
                int comeca1 = aleatorio.nextInt(2) + 1; //SORTEIA DOIS NUMEROS
                if (comeca1 == 1) {
                    System.out.println("");
                    System.out.println(decisao14 + " começa.");
                    System.out.println("");

                    while (true) {

                        Matriz();

                        do {
                            System.out.println("");
                            System.out.println(decisao14 + " , informe uma posição: ");
                            posicaoPessoa = ler.next();
                            while (!VerificaCasa(posicaoPessoa)) {
                                System.out.println("Essa posição está ocupada, tente novamente! ");
                                System.out.println(decisao14 + " , informe outra posição: ");
                                posicaoPessoa = ler.next();
                                valendo = 0;
                            }
                            SubstituindoLetras(posicaoPessoa, "X");
                            valendo = 1;
                        } while (valendo == 0);

                        jogadas++;
                        valendo = 0;
                        Matriz();
                        if (!Vencedor(jogadas).equals("null")) {
                            break;
                        }
                        do {
                            System.out.println("");
                            System.out.println("Máquina, informou uma posição: ");
                            System.out.println("");
                            posicao = aleatorio.nextInt(9) + 1;
                            String pos = Integer.toString(posicao);
                            while (!VerificaCasa(pos)) {
                                System.out.println("Essa posição está ocupada, tente novamente! ");
                                System.out.println("Máquina, informou outra posição: ");
                                posicao = aleatorio.nextInt(9) + 1;
                                pos = Integer.toString(posicao);
                                valendo = 0;
                            }
                            SubstituindoLetras(pos, "O");
                            valendo = 1;
                        } while (valendo == 0);

                        jogadas++;
                        valendo = 0;
                        if (!Vencedor(jogadas).equals("null")) {
                            break;
                        }
                    }
                    System.out.println("O jogador que jogou com " + Vencedor(jogadas) + " venceu!");
                    break;
                } else if (comeca1 == 2) { //SE FOR 0, INICIA JOGADOR O

                    System.out.println("A máquina começou");

                    while (true) {

                        do {
                            System.out.println("");
                            System.out.println("Máquina, informou uma posição: ");
                            System.out.println("");
                            posicao = aleatorio.nextInt(9) + 1;
                            String pos = Integer.toString(posicao);
                            while (!VerificaCasa(pos)) {
                                System.out.println("Essa posição está ocupada, tente novamente! ");
                                System.out.println("Máquina, informou outra posição: ");
                                posicao = aleatorio.nextInt(9) + 1;
                                pos = Integer.toString(posicao);
                                valendo = 0;
                            }
                            SubstituindoLetras(pos, "O");
                            valendo = 1;
                            Matriz();
                        } while (valendo == 0);

                        jogadas++;
                        valendo = 0;
                        if (!Vencedor(jogadas).equals("null")) {
                            break;
                        }

                        do {
                            System.out.println("");
                            System.out.println(decisao14 + " , informe uma posição: ");
                            posicaoPessoa = ler.next();
                            while (!VerificaCasa(posicaoPessoa)) {
                                System.out.println("Essa posição está ocupada, tente novamente! ");
                                System.out.println(decisao14 + " , informe outra posição: ");
                                posicaoPessoa = ler.next();
                                valendo = 0;
                            }
                            SubstituindoLetras(posicaoPessoa, "X");
                            valendo = 1;
                        } while (valendo == 0);

                    }
                    System.out.println("O jogador que jogou com " + Vencedor(jogadas) + " venceu!");
                    break;
                }
                break;

        }

    }
}
