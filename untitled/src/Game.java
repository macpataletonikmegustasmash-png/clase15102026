import java.util.Objects;

public class Game {
    private final String juego;
    private final String empresa;

    public Game(String juego, String empresa) {
        this.juego = juego;
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return juego + " by " + empresa;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return Objects.equals(juego, game.juego) && Objects.equals(empresa, game.empresa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(juego, empresa);
    }
}
