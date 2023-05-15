package larchik.krestiki_noliki.components.keypads;

import larchik.krestiki_noliki.components.CellNumberConverter;
import larchik.krestiki_noliki.model.Cell;

public class DesktopNumericKeypadCellNumberConverter implements CellNumberConverter {
    private final char[][] mappingTable = {
            {'7', '8', '9'},
            {'4', '5', '6'},
            {'1', '2', '3'}
    };

    @Override
    public Cell toCell(char number) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (mappingTable[i][j] == number) {
                    return (new Cell(i, j));
                }
            }
        }
        return null;
    }

    @Override
    public char toNumber(final Cell cell) {
        return mappingTable[cell.getRow()][cell.getCol()];
    }
}
