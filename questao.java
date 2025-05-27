public class Questao {
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
