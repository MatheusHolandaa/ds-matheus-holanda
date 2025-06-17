import javax.swing.JOptionPane;

public class CarroOP {
    String modelo;
    int ano;
    String cor;

    public CarroOP(String modelo, int ano, String cor) {
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }

    public void exibirInformacoes() {
        String mensagem = "Modelo: " + modelo + "\nAno: " + ano + "\nCor: " + cor;
        JOptionPane.showMessageDialog(null, mensagem, "Informações do Carro", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        // showInputDialog para coletar dados
        String modelo = JOptionPane.showInputDialog(null, "Digite o modelo do carro:");
        String anoStr = JOptionPane.showInputDialog(null, "Digite o ano do carro:");
        String cor = JOptionPane.showInputDialog(null, "Digite a cor do carro:");

        int ano = 0;
        try {
            ano = Integer.parseInt(anoStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ano inválido! Usando 2000 como padrão.", "Erro", JOptionPane.ERROR_MESSAGE);
            ano = 2000;
        }

        CarroOP carro = new CarroOP(modelo, ano, cor);

        // showConfirmDialog
        int confirmar = JOptionPane.showConfirmDialog(null, "Deseja ver as informações do carro?", "Confirmar", JOptionPane.YES_NO_OPTION);

        if (confirmar == JOptionPane.YES_OPTION) {
            carro.exibirInformacoes();
        } else {
            JOptionPane.showMessageDialog(null, "Encerrando programa.", "Encerrar", JOptionPane.WARNING_MESSAGE);
            System.exit(0);
        }

        // showOptionDialog com opções personalizadas
        Object[] opcoes = {"Alterar Modelo", "Alterar Cor", "Sair"};
        int escolha = JOptionPane.showOptionDialog(
                null,
                "O que deseja fazer agora?",
                "Menu de Ações",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opcoes,
                opcoes[0]
        );

        switch (escolha) {
            case 0:
                String novoModelo = JOptionPane.showInputDialog(null, "Digite o novo modelo:");
                carro.modelo = novoModelo;
                JOptionPane.showMessageDialog(null, "Modelo atualizado com sucesso!", "Atualizado", JOptionPane.PLAIN_MESSAGE);
                break;
            case 1:
                String novaCor = JOptionPane.showInputDialog(null, "Digite a nova cor:");
                carro.cor = novaCor;
                JOptionPane.showMessageDialog(null, "Cor atualizada com sucesso!", "Atualizado", JOptionPane.PLAIN_MESSAGE);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Encerrando o programa...", "Sair", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
        }

        // Exibir informações atualizadas
        carro.exibirInformacoes();
    }
}
