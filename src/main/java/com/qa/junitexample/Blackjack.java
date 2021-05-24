package com.qa.junitexample;

public class Blackjack {
    
    public static int play(int dealer, int player) {
        if (dealer > 21 && player > 21) {
            return 0;
        } else if (dealer > 21) {
            return player;
        } else if (player > 21) {
            return dealer;
        }
        return Math.max(dealer, player);
    }
    
}

// possible outcomes:
// both above 21 assert result 0
// dealer > 21 assert player
// player > 21 assert dealer 
// neither > 21 assert result = greater of the two