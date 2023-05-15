package larchik.krestiki_noliki.components.keypads;

import larchik.krestiki_noliki.components.CellNumberConverter;
import larchik.krestiki_noliki.model.Cell;

public class TerminalNumericKeypadCellNumberConverter implements CellNumberConverter {


    @Override
    public Cell toCell(char number) {
        final int val = number - '0' - 1;
        return new Cell(val / 3, val % 3);
    }

    @Override
    public char toNumber(final Cell cell) {
        return (char) ('0' + (cell.getRow() * 3 + cell.getCol() + 1));
    }
}

