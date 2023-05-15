package larchik.krestiki_noliki.components;

import larchik.krestiki_noliki.model.Cell;
import larchik.krestiki_noliki.model.GameTable;

import java.util.Scanner;

public class UserMove {

    private final CellNumberConverter cellNumberConverter;

    public UserMove(final CellNumberConverter cellNumberConverter) {
        this.cellNumberConverter = cellNumberConverter;
    }

    public void make(final GameTable gameTable) {
        while (true) {
            final Cell cell = makeUserInput();
            if (gameTable.isEmpty(cell)) {
                gameTable.setSign(cell, 'X');
                return;
            } else {
                System.out.println("Can't make a move, because the cell is not free! Try again!");
            }
        }

    }

    private Cell makeUserInput() {
        while (true) {
            System.out.println("Please type number between 1 and 9:");
            final String userInput = new Scanner(System.in).nextLine();
            if (userInput.length() == 1) {
                final char userInputChar = userInput.charAt(0);
                if (userInputChar >= '1' && userInputChar <= '9') {
                    return cellNumberConverter.toCell(userInputChar);
                }
            }
        }
    }
}
