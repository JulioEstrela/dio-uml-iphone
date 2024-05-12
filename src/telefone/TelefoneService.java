package telefone;

public class TelefoneService {
    public void ligar(Contato contato) {
        System.out.println("Ligando para: " + contato);
    }

    public void atender() {
        System.out.println("Atendendo ligação");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }
}
