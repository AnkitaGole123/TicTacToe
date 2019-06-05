public class Turn {
    public int count;
    public String symbol;
    public String changeTurn(){
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
