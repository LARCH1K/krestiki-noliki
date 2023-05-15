package larchik.krestiki_noliki.components;

import larchik.krestiki_noliki.model.Cell;
import larchik.krestiki_noliki.model.GameTable;

public class CellVerifier {

    public boolean allCellsField(final GameTable gameTable) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                final Cell cell = new Cell(i, j);
                if (gameTable.isEmpty(cell)) {
                    return false;
                }
            }
        }
        return true;
    }
}
