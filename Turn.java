class Turn {
    private int count;
    private String symbol;
    String changeTurn(){
        if (count%2 == 0){
            symbol = "x";
        }
        else{
            symbol = "0";
        }
        count++;
        return symbol;
    }
    String getTurn(){
        return symbol;
    }
}
