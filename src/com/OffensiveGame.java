package com;

/**
 * Created by Ricardo on 20/05/2016.
 */
public class OffensiveGame extends Game {

    public OffensiveGame(Board b) {
        super(b);
    }

    @Override
    Move calculateNextMove(Board b) {
        int size=b.getSize();
        for(int i = size-1; i>=0;i--) {
            for (int j=size-1; j>=0; --j) {
                if (b.get(i,j) == Board.FREE) {
                    return new Move(i, j);
                }
            }
        }
        return null;
    }
}
