package larchik.krestiki_noliki;

import larchik.krestiki_noliki.components.*;

public class Launcher {
    public static void main(String[] args) {
        final Game game = new Game(new DataPrinter(), new ComputerMove(), new UserMove(), new WinnerVerifier(), new DrawVerifier());
        game.play();
    }
}
