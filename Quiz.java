import java.util.ArrayList;
import java.util.Scanner;

// Classe Cabeçalho
class Cabecalho {
    public static void exibir() {
        System.out.println("======================================");
        System.out.println(" Unifan ");
        System.out.println(" Aluno: Felipe Campos Pitaluga ");
        System.out.println(" Professor: Brenno Paixão ");
        System.out.println(" Tema: Quiz de Conhecimentos Gerais ");
        System.out.println("======================================\n");
    }
}

// Classe Questao
class Questao {
    String pergunta;
    String opcaoA, opcaoB, opcaoC, opcaoD, opcaoE;
    String correta;
    
    public Questao(String pergunta, String opcaoA, String opcaoB, String opcaoC, String opcaoD, String opcaoE, String correta) {
        this.pergunta = pergunta;
        this.opcaoA = opcaoA;
        this.opcaoB = opcaoB;
        this.opcaoC = opcaoC;
        this.opcaoD = opcaoD;
        this.opcaoE = opcaoE;
        this.correta = correta;
    }
    
    public void escrevaQuestao() {
        System.out.println(pergunta);
        System.out.println("A) " + opcaoA);
        System.out.println("B) " + opcaoB);
        System.out.println("C) " + opcaoC);
        System.out.println("D) " + opcaoD);
        System.out.println("E) " + opcaoE);
        System.out.println();
    }
    
    public boolean isCorreta(String resposta) {
        if (resposta.equalsIgnoreCase(this.correta)) {
            System.out.println("Parabéns, resposta correta!\n");
            return true;
        } else {
            System.out.println("Resposta errada! A correta é: " + this.correta + "\n");
            return false;
        }
    }
}
