package musica;

public class Musica {

    private static int staticId = 0;
    private final int ID;
    private String nome;

    public Musica(String nome) {
        ID = staticId;
        staticId += 1;
        this.nome = nome;
    }

    public int getID() {
        return ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Musica{" +
                "id=" + ID +
                ", nome='" + nome + '\'' +
                '}';
    }
}
