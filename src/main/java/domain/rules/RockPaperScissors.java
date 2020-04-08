package domain.rules;

import domain.Move;
import domain.Result;
import domain.Rules;

public class RockPaperScissors implements Rules {
    @Override
    public Result decide(Move mine, Move theirs) {
        if (mine != theirs) {
            if (player1Wins(mine, theirs) == true) {
                return Result.WIN;
            } else {
                return Result.LOSE;
            }
        } else {
            return Result.DRAW;
        }
    }

    public boolean player1Wins(Move mine, Move theirs) {
        switch(mine) {
            case ROCK:
                return theirs == Move.SCISSORS;
            case SCISSORS:
                return theirs == Move.PAPER;
            case PAPER:
                return theirs == Move.ROCK;
        }
        return false;
    }
}
