package ru.netology.Test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.Data.Player;
import ru.netology.Exception.NotRegisteredException;
import ru.netology.Manager.Game;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GameTest {

    Game game = new Game();


    Player player1 = new Player(1, "Name1", 5);
    Player player2 = new Player(2, "Name2", 3);
    Player player3 = new Player(3, "Name3", 4);
    Player player4 = new Player(4, "Name4", 2);
    Player player5 = new Player(5, "Name5", 5);

    @BeforeEach
    void setup() {
        game.register("Name1", player1);
        game.register("Name2", player2);
        game.register("Name3", player3);
        game.register("Name4", player4);
        game.register("Name5", player5);
    }


    @Test
    void FirstPlayerWin() {
        assertEquals(1, game.round("Name1", "Name3"));
    }

    @Test
    void SecondPlayerWin() {
        assertEquals(2, game.round("Name4", "Name2"));
    }

    @Test
    void Draw() {
        assertEquals(0, game.round("Name1", "Name5"));
    }

    @Test
    void NotRegisteredExceptionOne() {
        assertThrows(NotRegisteredException.class, () -> {
            game.round("Name3", "Антон");
        });
    }

    @Test
    void NotRegisteredExceptionTwo() {
        assertThrows(NotRegisteredException.class, () -> {
            game.round("Name6", "Name2");
        });
    }

}
