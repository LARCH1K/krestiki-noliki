package larchik.krestiki_noliki.components;

import larchik.krestiki_noliki.model.Cell;
import larchik.krestiki_noliki.model.GameTable;

import java.util.Random;

public class ComputerMove {
    public void make(final GameTable gameTable) {
        while (true) {
            int number_row = new Random().nextInt(3);
            int number_col = new Random().nextInt(3);
            final Cell randomCell = new Cell(number_row, number_col);
            if (gameTable.isEmpty(randomCell)) {
                gameTable.setSign(randomCell, 'O');
                break;
            }
        }
    }
}
