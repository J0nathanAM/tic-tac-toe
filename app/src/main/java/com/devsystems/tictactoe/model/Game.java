package com.devsystems.tictactoe.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Game {

    private String playerOneId;
    private String playerTwoId;
    private List<Integer> selectedCell;
    private Boolean playerOneTurn;
    private String winnerId;
    private Date gameDateCreated;
    private String IdDNF;

    public Game() {
    }

    public Game(String playerOneId) {
        this.playerOneId = playerOneId;
        this.playerTwoId = "";
        this.selectedCell = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            this.selectedCell.add(0);
        }
        this.playerOneTurn = true;
        this.winnerId = "";
        this.gameDateCreated = new Date();
        this.IdDNF = "";
    }

    public String getPlayerOneId() {
        return playerOneId;
    }

    public void setPlayerOneId(String playerOneId) {
        this.playerOneId = playerOneId;
    }

    public String getPlayerTwoId() {
        return playerTwoId;
    }

    public void setPlayerTwoId(String playerTwoId) {
        this.playerTwoId = playerTwoId;
    }

    public List<Integer> getSelectedCell() {
        return selectedCell;
    }

    public void setSelectedCell(List<Integer> selectedCell) {
        this.selectedCell = selectedCell;
    }

    public Boolean getPlayerOneTurn() {
        return playerOneTurn;
    }

    public void setPlayerOneTurn(Boolean playerOneTurn) {
        this.playerOneTurn = playerOneTurn;
    }

    public String getWinnerId() {
        return winnerId;
    }

    public void setWinnerId(String winnerId) {
        this.winnerId = winnerId;
    }

    public Date getGameDateCreated() {
        return gameDateCreated;
    }

    public void setGameDateCreated(Date gameDateCreated) {
        this.gameDateCreated = gameDateCreated;
    }

    public String getIdDNF() {
        return IdDNF;
    }

    public void setIdDNF(String idDNF) {
        IdDNF = idDNF;
    }
}
