import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cabecalho.exibir();

        ArrayList<Questao> questoes = new ArrayList<>();
        questoes.add(new Questao(
                "Qual a capital do Brasil?",
                "Rio de Janeiro",
                "São Paulo",
                "Brasília",
                "Salvador",
                "Belo Horizonte",
                "C"
        ));
        questoes.add(new Questao(
                "Qual é o maior planeta do sistema solar?",
                "Terra",
                "Júpiter",
                "Saturno",
                "Marte",
                "Netuno",
                "B"
        ));
        questoes.add(new Questao(
                "Quem escreveu 'Dom Quixote'?",
                "William Shakespeare",
                "Machado de Assis",
                "Miguel de Cervantes",
                "Monteiro Lobato",
                "J.K. Rowling",
                "C"
        ));
        questoes.add(new Questao(
                "Qual é o elemento químico mais abundante no universo?",
                "Oxigênio",
                "Carbono",
                "Hidrogênio",
                "Ferro",
                "Hélio",
                "C"
        ));
        questoes.add(new Questao(
                "Quantos lados tem um hexágono?",
                "Quatro",
                "Cinco",
                "Seis",
                "Sete",
                "Oito",
                "C"
        ));

        int pontuacao = 0;

        for (Questao q : questoes) {
            q.escrevaQuestao();
            System.out.print("Digite sua resposta (A, B, C, D ou E): ");
            String resposta = scanner.nextLine().trim().toUpperCase();

            while (!resposta.matches("[ABCDE]")) {
                System.out.print("Resposta inválida. Digite uma letra entre A e E: ");
                resposta = scanner.nextLine().trim().toUpperCase();
            }

            if (q.isCorreta(resposta)) {
                pontuacao++;
            }
        }

        System.out.println("Quiz finalizado! Você acertou " + pontuacao + " de " + questoes.size() + " perguntas.");

        scanner.close();
    }
}
