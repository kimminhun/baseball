package baseball;

import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {
        Game game = new Game();
        do {
            game.game();
        } while (game.getReplay());
        }

}
