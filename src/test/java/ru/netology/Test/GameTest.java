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
        game.register(player1);
        game.register(player2);
        game.register(player3);
        game.register(player4);
        game.register(player5);
    }


    @Test
    void FirstPlayerWin() {
        assertEquals(1, game.round("Name1", "Name3"));
    }

    @Test
    void SecondPlayerWin() {
        assertEquals(2, game.round("Name4", "name2"));
    }

    @Test
    void Draw() {
        assertEquals(0, game.round("name1", "nAME5"));
    }

    @Test
    void NotRegisteredExceptionOne() {
        assertThrows(NotRegisteredException.class, () -> {
            game.round("NaMe3", "Антон");
        });
    }

    @Test
    void NotRegisteredExceptionTwo() {
        assertThrows(NotRegisteredException.class, () -> {
            game.round("Name6", "Name2");
        });
    }

}
