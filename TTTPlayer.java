public enum TTTPlayer {
    PLAYER_X("X"),
    PLAYER_O("O");

    private final String symbol;

    TTTPlayer(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }
}
