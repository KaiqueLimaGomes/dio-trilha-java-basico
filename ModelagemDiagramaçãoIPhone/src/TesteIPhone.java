public class TesteIPhone {
    public static void main(String[] args) {
        IPhone meuIPhone = new IPhone();

        // Testando Reprodutor Musical
        meuIPhone.selecionarMusica("Imagine - John Lennon");
        meuIPhone.tocar();
        meuIPhone.pausar();

        // Testando Aparelho Telefônico
        meuIPhone.ligar("11999999999");
        meuIPhone.atender();
        meuIPhone.iniciarCorreioVoz();

        // Testando Navegador na Internet
        meuIPhone.exibirPagina("https://www.dio.me");
        meuIPhone.adicionarNovaAba();
        meuIPhone.atualizarPagina();
    }
}