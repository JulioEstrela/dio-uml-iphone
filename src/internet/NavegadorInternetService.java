package internet;

import java.util.ArrayList;

public class NavegadorInternetService {
    private final ArrayList<AbaNavegador> ABAS = new ArrayList<AbaNavegador>();
    private AbaNavegador abaAtual;

    public void acessarPagina(String linkDaPagina) {
        System.out.println("Acessando a página: " + linkDaPagina);
        abaAtual.setLinkDaPagina(linkDaPagina);
    }

    public void adicionarNovaAba() {
        AbaNavegador abaNavegador = new AbaNavegador();
        System.out.println("Adicionando nova aba: " + abaNavegador.getID());
        this.ABAS.add(abaNavegador);
    }

    public void selecionarAba(int numeroDaAba) {
        System.out.println("Selecionando aba: " + ABAS.get(numeroDaAba).getID());
        this.abaAtual = ABAS.get(numeroDaAba);
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página atual: " + abaAtual.getLinkDaPagina());
    }
}
