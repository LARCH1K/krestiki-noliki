package larchik.krestiki_noliki.model;

public class Cell {

    private final int row;

    private final int col;

    @Override
    public String toString() {
        return "Cell{" +
                "row=" + row +
                ", col=" + col +
                '}';
    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public Cell(final int row, final int col) {
        this.row = row;
        this.col = col;
    }
}
