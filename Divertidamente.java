import java.util.Scanner;

public class Divertidamente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int alegria = 0, tristeza = 0;
        int mediaProvas, alegriaTres;

        System.out.println("Insira a quantidade de amizades que a Riley fez: ");
            int amizades = scanner.nextInt();
            alegria = amizades * 10;

        if (amizades > 0){
            System.out.println("Com as " + amizades + " amizades, Riley passa a ter " + alegria + " pontos de alegria.");
          }  else {
                System.out.println("Riley não realizou nenhuma amizade, pontos de tristeza aumentados em: " + (tristeza + 30)+ " pontos.");}

        System.out.println("Insira a nota que Riley obteve na avaliação A1: ");
            int notaA1 = scanner.nextInt();
        System.out.println("Insira a nota que Riley obteve na avaliação A2: ");
            int notaA2 = scanner.nextInt();
        System.out.println("Insira a nota que Riley obteve na avaliação A3:" );
            int notaA3 = scanner.nextInt();
            mediaProvas = (notaA1 + notaA2 + notaA3) / 3;

        if (mediaProvas >= 7){
            alegria += 50;
            System.out.println("Riley foi aprovada, pontos de alegria acrescidos em: " + alegria);
                }
            else {
                System.out.println("Riley foi reprovada, pontos de tristeza acrescidos em: " +  (tristeza + 50));
            }

        System.out.println("Insira a quantidade de algoritmos que a Riley conseguiu fazer: ");
            int algoritmosFeitos = scanner.nextInt();
            int pontosFeitos = algoritmosFeitos * 10;
        System.out.println("Agora, insira a quantidade de algoritmos que a Riley não conseguiu fazer. \nCaso tenha feito todos, digite 0.");
            int algoritmosNaoFeitos = scanner.nextInt();
            int pontosNaoFeitos = algoritmosNaoFeitos * 10;

        if (algoritmosNaoFeitos == 0){
            System.out.println("Ótimo trabalho, Riley realizou todos os algoritimos e está com o total de alegria em " + (alegria + algoritmosFeitos) + " pontos.");
        }
        else if (algoritmosFeitos > algoritmosNaoFeitos){
        System.out.println("Ótimo trabalho! Os pontos de alegria passaram a ser: " + (alegria + pontosFeitos));}
        else if (algoritmosNaoFeitos > 1){
            System.out.println("Devido ao número de algoritmos não realizados, a o valor total de tristeza passa a ser: " + (tristeza + pontosNaoFeitos));
        } 
        alegria = alegria + pontosFeitos;
        tristeza = tristeza + pontosNaoFeitos;

        if (alegria > tristeza){
            System.out.println("A mudança para a nova cidade foi uma experiência incrível para a Riley. ");}
            else {
                System.out.println("A mudança para a nova cidade foi uma experiência desagradável para a Riley. ");
            }
        scanner.close();
    }
}
