package ru.netology.Manager;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.netology.Data.Player;
import ru.netology.Exception.NotRegisteredException;

import java.util.HashMap;
import java.util.Map;


public class Game {


    private HashMap<String, Player> players = new HashMap();

    public void register(String name, Player player) {
        players.put(name, player);
    }
    

    public int round(String playerName1, String playerName2){
        Player playerOne = players.get(playerName1);
        Player playerTwo = players.get(playerName2);
        if (playerOne == null) {
            throw new NotRegisteredException("Игрок" + playerName1 + "не зарегистрирован для участия в турнире!");
        } else if (playerTwo == null) {
            throw new NotRegisteredException("Игрок" + playerName2 + "не зарегистрирован для участия в турнире!");
        }
        if (playerOne.getStrength() > playerTwo.getStrength()) {
            return 1;
        } else if (playerOne.getStrength() < playerTwo.getStrength()) {
            return 2;
        } else {
            return 0;
        }
    }

}
