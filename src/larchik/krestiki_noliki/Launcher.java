package larchik.krestiki_noliki;

import larchik.krestiki_noliki.components.*;

public class Launcher {
    public static void main(String[] args) {
        final CellNumberConverter cellNumberConverter = new CellNumberConverter();
        final Game game = new Game(new DataPrinter(cellNumberConverter),
                new ComputerMove(),
                new UserMove(cellNumberConverter),
                new WinnerVerifier(),
                new CellVerifier());
        game.play();
    }
}
