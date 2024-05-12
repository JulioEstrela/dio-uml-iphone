package internet;

public class AbaNavegador {
    private static int staticId = 0;
    private final int ID;
    private String linkDaPagina;

    public AbaNavegador() {
        this.ID = staticId;
        staticId += 1;
    }

    public int getID() {
        return ID;
    }

    public String getLinkDaPagina() {
        return linkDaPagina;
    }

    public void setLinkDaPagina(String linkDaPagina) {
        this.linkDaPagina = linkDaPagina;
    }
}
