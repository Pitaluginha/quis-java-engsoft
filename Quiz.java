import java.util.ArrayList;
import java.util.Scanner;

// Classe Cabeçalho
class Cabecalho {
    public static void exibir() {
        System.out.println("======================================");
        System.out.println(" Faculdade: Nome da Faculdade ");
        System.out.println(" Aluno: Seu Nome ");
        System.out.println(" Professor: Nome do Professor ");
        System.out.println(" Tema: Quiz de Conhecimento Geral ");
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

public class Quiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cabecalho.exibir();
        
        ArrayList<Questao> questoes = new ArrayList<>();
        questoes.add(new Questao("Quem escreveu 'Dom Quixote'?", "William Shakespeare", "Machado de Assis", "Miguel de Cervantes", "Monteiro Lobato", "J.K. Rowling", "C"));
        questoes.add(new Questao("Qual é o elemento químico mais abundante no universo?", "Oxigênio", "Carbono", "Hidrogênio", "Ferro", "Hélio", "C"));
        questoes.add(new Questao("Quantos lados tem um hexágono?", "Quatro", "Cinco", "Seis", "Sete", "Oito", "C"));
        questoes.add(new Questao("Qual planeta é conhecido como o Planeta Vermelho?", "Mercúrio", "Vênus", "Terra", "Marte", "Júpiter", "D"));
        questoes.add(new Questao("Quem foi o primeiro presidente do Brasil?", "Getúlio Vargas", "Juscelino Kubitschek", "Dom Pedro II", "Marechal Deodoro da Fonseca", "Tancredo Neves", "D"));
        // Adicione mais 10 perguntas aqui...

        int pontuacao = 0;
        for (Questao q : questoes) {
            q.escrevaQuestao();
            System.out.print("Digite sua resposta (A, B, C, D ou E): ");
            String resposta = scanner.next().toUpperCase();
            if (q.isCorreta(resposta)) {
                pontuacao++;
            }
        }
        
        System.out.println("Quiz finalizado! Você acertou " + pontuacao + " de " + questoes.size() + " perguntas.");
    }
}
