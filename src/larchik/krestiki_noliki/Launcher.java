package larchik.krestiki_noliki;

import larchik.krestiki_noliki.components.*;
import larchik.krestiki_noliki.components.keypads.TerminalNumericKeypadCellNumberConverter;

public class Launcher {
    public static void main(String[] args) {
        final CellNumberConverter cellNumberConverter = new TerminalNumericKeypadCellNumberConverter();
        final Game game = new Game(
                new DataPrinter(cellNumberConverter),
                new ComputerMove(),
                new UserMove(cellNumberConverter),
                new WinnerVerifier(),
                new CellVerifier());
        game.play();
    }
}
