import exceptions.SongNotSelectedException;
import musica.ReprodutorMusicalService;
import org.junit.Assert;
import org.junit.Test;

public class TesteReprodutorMusicalService {
    @Test
    public void tocarMusica_ShouldGiveException_WhenSongIsNotSelected() {
        ReprodutorMusicalService reprodutorMusicalService = new ReprodutorMusicalService();

        Assert.assertThrows(SongNotSelectedException.class, () -> reprodutorMusicalService.tocarMusica());
    }
}
