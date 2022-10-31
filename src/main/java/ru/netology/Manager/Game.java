package ru.netology.Manager;

import ru.netology.Data.Player;
import ru.netology.Exception.NotRegisteredException;

import java.util.ArrayList;
import java.util.List;

public class Game {

    List<Player> players = new ArrayList<>();

    public void register(Player player) {
        int i = players.size();
        players.add(i, player);
        players.size();
    }

    public List<Player> findAll() {
        return players;
    }


    public int round(String playerName1, String playerName2) {
        int indexOne = indexFound(playerName1);
        int indexTwo = indexFound(playerName2);
        if (indexOne == -1) {
            throw new NotRegisteredException("Игрок не зарегистрирован для участия в турнире!");
        } else if (indexTwo == -1) {
            throw new NotRegisteredException("Игрок не зарегистрирован для участия в турнире!");
        }
        if (players.get(indexOne).getStrength() > players.get(indexTwo).getStrength()) {
            return 1;
        } else if (players.get(indexOne).getStrength() < players.get(indexTwo).getStrength()) {
            return 2;
        } else {
            return 0;
        }
    }

    public int indexFound(String playerName) {
        for (Player player : players) {
            if (player.getName().equalsIgnoreCase(playerName)) {
                return players.indexOf(player);
            }
        }
        return -1;
    }


}
