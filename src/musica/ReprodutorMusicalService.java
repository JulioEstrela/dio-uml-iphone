package musica;

import exceptions.SongNotSelectedException;

public class ReprodutorMusicalService {

    private Musica musicaSelecionada;

    private void tocarMusica(Musica musica) throws SongNotSelectedException {
        System.out.println("Tocando música: " + musica.getNome());
    }

    //Pensando no workflow de um smartphone,
    //o usuário sempre selecionará a música antes de tocar
    public void tocarMusica()  {
        if (musicaSelecionada != null){
            tocarMusica(musicaSelecionada);
        }
        else {
            throw new SongNotSelectedException("Erro ao tocar música: música não selecionada");
        }
    }

    private void pausarMusica(Musica musica) {
        System.out.println("Pausando música: " + musica.getNome());
    }
    public void pausarMusica() {
        if (musicaSelecionada != null){
            pausarMusica(musicaSelecionada);
        }
        else {
            throw new SongNotSelectedException("Erro ao pausar música: música não selecionada");
        }
    }

    public void selecionarMusica(Musica musica) {
        System.out.println("Selecionando música: " + musica);
        this.musicaSelecionada = musica;
    }
}
