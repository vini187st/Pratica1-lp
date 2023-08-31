public class EmpregadoDaFaculdade {
    private String nome;
    private double salario;
    private int horasAula;

    // Construtor
    public EmpregadoDaFaculdade(String nome, double salario, int horasAula) {
        this.nome = nome;
        this.salario = salario;
        this.horasAula = horasAula;
    }

    // Método getGastos atualizado com o bônus por hora/aula
    double getGastos() {
        return this.salario + (40 * this.horasAula); // Adicionando o bônus de R$ 40 por hora/aula
    }

    // Método getInfo atualizado com o valor total a receber (salário + bônus)
    String getInfo() {
        return "nome: " + this.nome + " com salário: " + (this.salario + (40 * this.horasAula));
    }

    public static void main(String[] args) {
        // Criar um objeto EmpregadoDaFaculdade
        EmpregadoDaFaculdade empregado = new EmpregadoDaFaculdade("João", 2000.0, 10);

        // Exibir resultados dos métodos getGastos() e getInfo()
        System.out.println("Gastos: " + empregado.getGastos());
        System.out.println("Informações: " + empregado.getInfo());
    }
}