package larchik.krestiki_noliki.components;


import larchik.krestiki_noliki.model.GameTable;

import java.util.Random;

public class Game {
    private final DataPrinter dataPrinter;
    private final ComputerMove computerMove;
    private final UserMove userMove;
    private final WinnerVerifier winnerVerifier;
    private final CellVerifier cellVerifier;

    public Game(final DataPrinter dataPrinter,
                final ComputerMove computerMove,
                final UserMove userMove,
                final WinnerVerifier winnerVerifier,
                final CellVerifier cellVerifier) {
        this.dataPrinter = dataPrinter;
        this.computerMove = computerMove;
        this.userMove = userMove;
        this.winnerVerifier = winnerVerifier;
        this.cellVerifier = cellVerifier;
    }


    public void play() {
        System.out.println("Use the following mapping table to specify a cell using numbers from 1 to 9:");
        dataPrinter.printMappingTable();
        final GameTable gameTable = new GameTable();
        if (new Random().nextBoolean()) {
            computerMove.make(gameTable);
            dataPrinter.printMappingTable(gameTable);
        }
        while (true) {
            userMove.make(gameTable);
            dataPrinter.printMappingTable(gameTable);
            if (winnerVerifier.isUserWin(gameTable)) {
                System.out.println("YOU WIN!!!");
                break;
            }
            if (cellVerifier.allCellsField(gameTable)) {
                System.out.println("DRAW!");
                break;
            }
            computerMove.make(gameTable);
            dataPrinter.printMappingTable(gameTable);
            if (winnerVerifier.isComputerWin(gameTable)) {
                System.out.println("COMPUTER WIN!!!");
                break;
            }
            if (cellVerifier.allCellsField(gameTable)) {
                System.out.println("DRAW!");
                break;
            }
        }
        System.out.println("GAME OVER");
    }
}

