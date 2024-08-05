package oops;

class Player{
    int playerId;
    String pName;
    int currentPos = 0;
    boolean isWinner=false;

    Player(String pName,int playerID){
        this.pName=pName;
        this.playerId=playerID;
    }
}

class Position{
    int head;
    int tail;
    Position(int head,int tail){
        this.head=head;
        this.tail=tail;
    }
}

class GameBoard{
     int[]gameBoard;
     Position[] snakes;
     Position[] ladder;

}
class Gamelogic{

}
public class Snacks_ladder {
    
}
