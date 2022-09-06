public class Bishop extends Piece {
    /**
     * constructor.
     *
     * @param coordinatesX .
     * @param coordinatesY .
     */
    public Bishop(int coordinatesX, int coordinatesY) {
        super(coordinatesX, coordinatesY);
    }

    /**
     * constructor.
     *
     * @param coordinatesX .
     * @param coordinatesY .
     * @param color        .
     */
    public Bishop(int coordinatesX, int coordinatesY, String color) {
        super(coordinatesX, coordinatesY, color);
    }

    /**
     * get sb.
     *
     * @return .
     */
    @Override
    public String getSymbol() {
        return "B";
    }

    /**
     * can move.
     *
     * @param board .
     * @param x     .
     * @param y     .
     * @return .
     */
    @Override
    public boolean canMove(Board board, int x, int y) {
        if (!board.validate(x, y)) {
            return false;
        }

        int[][] move = new int[Board.WIDTH + 1][Board.HEIGHT + 1];

        for (int i = 0; i <= Board.WIDTH; i++) {
            for (int j = 0; j <= Board.HEIGHT; j++) {
                move[i][j] = 0;
            }
        }

        for (int x1 = getCoordinatesX() - 1, y1 = getCoordinatesY() - 1;
             x1 >= 1 && y1 >= 1; x1--, y1--) {
            move[x1][y1] = 1;
            if (board.getAt(x1, y1) != null) {
                if (getColor().equals(board.getAt(x1, y1).getColor())) {
                    move[x1][y1] = 0;
                }
                break;
            }
        }

        for (int x1 = getCoordinatesX() - 1, y1 = getCoordinatesY() + 1;
             x1 >= 1 && y1 <= Board.WIDTH; x1--, y1++) {
            move[x1][y1] = 1;
            if (board.getAt(x1, y1) != null) {
                if (getColor().equals(board.getAt(x1, y1).getColor())) {
                    move[x1][y1] = 0;
                }
                break;
            }
        }

        for (int x1 = getCoordinatesX() + 1, y1 = getCoordinatesY() - 1;
             y1 >= 1 && x1 <= Board.HEIGHT; y1--, x1++) {
            move[x1][y1] = 1;
            if (board.getAt(x1, y1) != null) {
                if (getColor().equals(board.getAt(x1, y1).getColor())) {
                    move[x1][y1] = 0;
                }
                break;
            }
        }

        for (int x1 = getCoordinatesX() + 1, y1 = getCoordinatesY() + 1;
             y1 <= Board.HEIGHT && x1 <= Board.HEIGHT; y1++, x1++) {
            move[x1][y1] = 1;
            if (board.getAt(x1, y1) != null) {
                if (getColor().equals(board.getAt(x1, y1).getColor())) {
                    move[x1][y1] = 0;
                }
                break;
            }
        }

        for (int i = 1; i <= Board.WIDTH; i++) {
            for (int j = 1; j <= Board.HEIGHT; j++) {
                System.out.print(move[i][j] + " ");
            }
            System.out.print("\n");
        }

        return 1 == move[x][y];
    }
}
