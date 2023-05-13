package larchik.krestiki_noliki;

import java.util.Random;

public class game {
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
            if (drawVerifier.isDraw(gameTable)) {
                System.out.println("DRAW!");
                break;
            }
            computerMove.make(gameTable);
            dataPrinter.printMappingTable(gameTable);
            if (winnerVerifier.isComputerWin(gameTable)) {
                System.out.println("COMPUTER WIN!!!");
                break;
            }
            if (drawVerifier.isDraw(gameTable)) {
                System.out.println("DRAW!");
                break;
            }
        }
        System.out.println("GAME OVER");
    }
}
