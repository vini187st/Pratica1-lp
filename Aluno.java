public class Aluno {
    private String nome;
    private String matricula;
    private double notaAV1;
    private double notaAV2;
    private double notaAE;
    private String curso;
    private int periodo;

    // Construtor
    public Aluno(String nome, String matricula, double notaAV1, double notaAV2, String curso, int periodo) {
        this.nome = nome;
        this.matricula = matricula;
        this.notaAV1 = notaAV1;
        this.notaAV2 = notaAV2;
        this.curso = curso;
        this.periodo = periodo;
    }

    // Método para alterar a nota da AV1
    public void alteraNotaAV1(double novaNotaAV1) {
        this.notaAV1 = novaNotaAV1;
    }

    // Método para alterar a nota da AV2
    public void alteraNotaAV2(double novaNotaAV2) {
        this.notaAV2 = novaNotaAV2;
    }

    // Método para alterar a nota da AE
    public void alteraNotaAE(double novaNotaAE) {
        this.notaAE = novaNotaAE;
    }

    // Método para avaliar o aluno
    public void avaliarAluno() {
        double somaNotasAV = notaAV1 + notaAV2;
        if (somaNotasAV >= 60) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Recuperação");
        }
    }

    // Método para avaliar a recuperação do aluno
    public void avaliarRecuperacao(double notaAE) {
        double media = (notaAV1 + notaAV2 + notaAE) / 3;
        if (media >= 60) {
            System.out.println("Aprovado na recuperação");
        } else {
            System.out.println("Reprovado na recuperação");
        }
    }

    public static void main(String[] args) {
        // Criar um objeto Aluno
        Aluno aluno = new Aluno("João", "12345", 70.0, 50.0, "Engenharia", 3);

        // Testar métodos
        aluno.avaliarAluno(); // Avaliação inicial
        aluno.alteraNotaAV2(65.0); // Alterar a nota da AV2
        aluno.avaliarAluno(); // Avaliação após alteração da nota
        aluno.alteraNotaAE(55.0); // Alterar a nota da AE
        aluno.avaliarRecuperacao(55.0); // Avaliação da recuperação
    }
}
