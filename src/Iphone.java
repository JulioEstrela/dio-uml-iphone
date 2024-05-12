import internet.NavegadorInternetService;
import musica.Musica;
import musica.ReprodutorMusicalService;
import telefone.TelefoneService;
import telefone.Contato;

/**
 * O projeto simula a UML do Iphone 1.
 * Com as seguintes Funcionalidades:
 * <ul>
 *     <li>Reprodutor Musical</li>
 *     <li>Aparelho Telefônico</li>
 *     <li>Navegador de Internet</li>
 * </ul>
 * <p>
 * O modelo é baseado em aplicativos:
 * cada aplicativo tem suas próprias regras de negócio,
 * implementando os atributos e comportamentos em sua própria classe.
 * A classe  {@code Iphone} apenas utiliza esses "aplicativos".
 *
 * @since 12/05/2024
 * @author Júlio Antunes Estrela
 * @version 1.0
 */
public class Iphone {
    public static void main(String[] args) {
        //REPRODUTOR MUSICAL
        ReprodutorMusicalService ipod = new ReprodutorMusicalService();

        // Música adicionada nos arquivos do Iphone
        Musica musica1 = new Musica("With a Little Help from My Friends");

        // Ao selecionar a música, o reprodutor musical exibe algumas informações sobre ela
        ipod.selecionarMusica(musica1);

        // Toca a música previamente selecionada
        ipod.tocarMusica();

        // Pausa a música previamente selecionada
        ipod.pausarMusica();


        //TELEFONE
        TelefoneService telefoneService = new TelefoneService();

        // Adicionando contato ao Iphone
        Contato contato = new Contato("Júlio", "11999192149");

        telefoneService.ligar(contato);
        telefoneService.atender();
        telefoneService.iniciarCorreioVoz();


        //NAVEGADOR INTERNET
        NavegadorInternetService navegadorInternetService = new NavegadorInternetService();

        //No navegador, é possível criar várias abas,
        //Cada aba pode ser relacionada a uma página da internet
        navegadorInternetService.adicionarNovaAba();
        navegadorInternetService.selecionarAba(0);
        navegadorInternetService.acessarPagina("apple.com");
        navegadorInternetService.atualizarPagina();

        navegadorInternetService.adicionarNovaAba();
        navegadorInternetService.selecionarAba(1);
        navegadorInternetService.acessarPagina("github.com");
        navegadorInternetService.atualizarPagina();

        //As páginas ficam relacionadas às abas em que foram abertas
        navegadorInternetService.selecionarAba(0); //apple.com
        navegadorInternetService.atualizarPagina();
    }
}
