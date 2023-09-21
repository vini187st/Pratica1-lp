import java.util.Scanner;

class Ingresso {
    private double valor;

    public Ingresso(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}

class Normal extends Ingresso {
    public Normal(double valor) {
        super(valor);
    }

    public void imprimeIngresso() {
        System.out.println("Ingresso Normal");
        System.out.println("Valor: R$" + getValor());
    }
}

class VIP extends Ingresso {
    private double adicional;

    public VIP(double valor, double adicional) {
        super(valor);
        this.adicional = adicional;
    }

    public void imprimeIngresso() {
        System.out.println("Ingresso VIP");
        System.out.println("Valor: R$" + (getValor() + adicional));
    }
}

class Camarote extends Ingresso {
    private double adicional;
    private String localizacao;

    public Camarote(double valor, double adicional, String localizacao) {
        super(valor);
        this.adicional = adicional;
        this.localizacao = localizacao;
    }

    public void imprimeIngresso() {
        System.out.println("Ingresso Camarote");
        System.out.println("Valor: R$" + (getValor() + adicional));
        System.out.println("Localização: " + localizacao);
    }
}

public class ingresso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o tipo de ingresso:");
        System.out.println("(1) Ingresso Normal");
        System.out.println("(2) Ingresso VIP");
        System.out.println("(3) Ingresso Camarote");

        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("Informe o valor do Ingresso Normal:");
                double valorNormal = scanner.nextDouble();
                Normal ingressoNormal = new Normal(valorNormal);
                ingressoNormal.imprimeIngresso();
                break;
            case 2:
                System.out.println("Informe o valor do Ingresso VIP:");
                double valorVIP = scanner.nextDouble();
                System.out.println("Informe o valor adicional do Ingresso VIP:");
                double adicionalVIP = scanner.nextDouble();
                VIP ingressoVIP = new VIP(valorVIP, adicionalVIP);
                ingressoVIP.imprimeIngresso();
                break;
            case 3:
                System.out.println("Informe o valor do Ingresso Camarote:");
                double valorCamarote = scanner.nextDouble();
                System.out.println("Informe o valor adicional do Ingresso Camarote:");
                double adicionalCamarote = scanner.nextDouble();
                System.out.println("Informe a localização do Ingresso Camarote:");
                scanner.nextLine(); // Consumir a quebra de linha pendente
                String localizacaoCamarote = scanner.nextLine();
                Camarote ingressoCamarote = new Camarote(valorCamarote, adicionalCamarote, localizacaoCamarote);
                ingressoCamarote.imprimeIngresso();
                break;
            default:
                System.out.println("Opção inválida");
        }

        scanner.close();
    }
}