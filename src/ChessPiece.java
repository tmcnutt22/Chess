public abstract class ChessPiece {
    private boolean isCaptured = false;
    private boolean isWhite = true;

    public ChessPiece(boolean isWhite) {
        this.isWhite = isWhite;
    }

    public void setIsWhite(boolean isWhite) {
        this.isWhite = isWhite;
    }

    public void setIsCaptured(boolean isCaptured) {
        this.isCaptured = isCaptured;
    }

    // need to create the rest of the required methods for a piece
    // moves, captures, castling, en croissant
}
