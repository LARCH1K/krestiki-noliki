package larchik.krestiki_noliki.components;

import larchik.krestiki_noliki.model.Cell;

public interface CellNumberConverter {

    Cell toCell(char number);

    char toNumber(Cell cell);
}
