public class Iphone implements Cellphone, MusicPlayer, Browser{

    @Override
    public void exibirPagina(String url) {
        System.out.println("acessando " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
        System.out.println("Página atualizada");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("ligando para " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Ligação atendida");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Deixe sua mensagem após o sinal");

    }

    @Override
    public void tocar() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Pausado");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Tocando " + musica);
    }
}
