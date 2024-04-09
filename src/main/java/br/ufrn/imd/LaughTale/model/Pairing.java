package br.ufrn.imd.LaughTale.model;

import br.ufrn.imd.LaughTale.model.Player;

public class Pairing {
    private Player player1;
    private Player player2;
    private int result;

    public Pairing(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.result = -1;
    }

    // Getters and setters
    public Player getPlayer1() {
        return player1;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }

    public int getResult() {
        return result;
    }

    // Methods
    public void player1Win() {
        result = 0;
        player1.setEventPoints(player1.getEventPoints() + 1); // Increment eventPoints for player1
    }

    public void player2Win() {
        result = 1;
        player2.setEventPoints(player2.getEventPoints() + 1); // Increment eventPoints for player2
    }
}

