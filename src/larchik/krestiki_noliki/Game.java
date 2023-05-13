package larchik.krestiki_noliki;


import java.util.Random;

public class Game {
    private DataPrinter dataPrinter;
    private ComputerMove computerMove;
    private UserMove userMove;
    private WinnerVerifier winnerVerifier;
    private DrawVerifier drawVerifier;

    public Game(final DataPrinter dataPrinter,
                final ComputerMove computerMove,
                final UserMove userMove,
                final WinnerVerifier winnerVerifier,
                final DrawVerifier drawVerifier) {
        this.dataPrinter = dataPrinter;
        this.computerMove = computerMove;
        this.userMove = userMove;
        this.winnerVerifier = winnerVerifier;
        this.drawVerifier = drawVerifier;
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
