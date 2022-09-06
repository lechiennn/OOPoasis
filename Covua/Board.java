import java.util.ArrayList;

public class Board {
    public static final int WIDTH = 8;
    public static final int HEIGHT = 8;
    private ArrayList<Piece> pieces = new ArrayList<>();

    /**
     * constructor.
     */
    public Board() {
    }

    /**
     * check validation.
     *
     * @param x .
     * @param y .
     * @return .
     */
    public boolean validate(int x, int y) {
        if (x < 1 || x > 8) {
            return false;
        }
        if (y < 1 || y > 8) {
            return false;
        }
        return true;
    }

    /**
     * add piece.
     *
     * @param piece .
     */
    public void addPiece(Piece piece) {
        int x1 = piece.getCoordinatesX();
        int y1 = piece.getCoordinatesY();
        if (!validate(x1, y1)) {
            return;
        }
        for (Piece p : pieces) {
            if (p.getCoordinatesX() == x1 && p.getCoordinatesY() == y1) {
                return;
            }
        }
        pieces.add(piece);
    }

    /**
     * get at.
     *
     * @param x .
     * @param y .
     * @return .
     */
    public Piece getAt(int x, int y) {
        for (Piece piece : pieces) {
            if (piece.getCoordinatesX() == x && piece.getCoordinatesY() == y) {
                return piece;
            }
        }
        return null;
    }

    /**
     * remove at.
     *
     * @param x .
     * @param y .
     */
    public void removeAt(int x, int y) {
        for (Piece piece : pieces) {
            if (piece.getCoordinatesX() == x && piece.getCoordinatesY() == y) {
                pieces.remove(piece);
                break;
            }
        }
    }

    public ArrayList<Piece> getPieces() {
        return pieces;
    }

    public void setPieces(ArrayList<Piece> pieces) {
        this.pieces = pieces;
    }
}
