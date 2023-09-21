import javax.swing.JOptionPane;

public abstract class Veiculo {
    protected String placa;
    protected int ano;

    public Veiculo() {
        this.placa = "";
        this.ano = 0;
    }

    public Veiculo(String placa, int ano) {
        this.placa = placa;
        this.ano = ano;
    }

    public abstract void exibirDados();
}

public final class Onibus extends Veiculo {
    private int assentos;

    public Onibus(String placa, int ano, int assentos) {
        super(placa, ano);
        this.assentos = assentos;
    }

    @Override
    public void exibirDados() {
        String mensagem = "Ônibus\n" +
                "Placa: " + placa + "\n" +
                "Ano: " + ano + "\n" +
                "Assentos: " + assentos;
        JOptionPane.showMessageDialog(null, mensagem);
    }
}

public final class Caminhao extends Veiculo {
    private int eixos;

    public Caminhao(String placa, int ano, int eixos) {
        super(placa, ano);
        this.eixos = eixos;
    }

    @Override
    public void exibirDados() {
        String mensagem = "Caminhão\n" +
                "Placa: " + placa + "\n" +
                "Ano: " + ano + "\n" +
                "Eixos: " + eixos;
        JOptionPane.showMessageDialog(null, mensagem);
    }
}

public class veiculo {
    public static void main(String[] args) {
        String placa;
        int ano, assentos, eixos;

        // Criar uma instância da classe Onibus
        placa = JOptionPane.showInputDialog("Informe a placa do ônibus:");
        ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano do ônibus:"));
        assentos = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de assentos do ônibus:"));
        Onibus onibus = new Onibus(placa, ano, assentos);
        onibus.exibirDados();

        // Criar uma instância da classe Caminhao
        placa = JOptionPane.showInputDialog("Informe a placa do caminhão:");
        ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano do caminhão:"));
        eixos = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de eixos do caminhão:"));
        Caminhao caminhao = new Caminhao(placa, ano, eixos);
        caminhao.exibirDados();
    }
}
