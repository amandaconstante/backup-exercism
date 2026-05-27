public class Blackjack {
    public int parseCard(String card) {
        switch(card) {
            case "two":
                return 2;
            case "three":
                return 3;
            case "four":
                return 4;
            case "five":
                return 5;
            case "six":
                return 6;
            case "seven":
                return 7;
            case "eight":
                return 8;
            case "nine":
                return 9;
            case "ten","jack","queen","king": 
                return 10;
            case "ace":
                return 11;
            default:
                return 0;
              
        }
    }
    public boolean isBlackjack(String card1, String card2) {
        return (parseCard(card1) + parseCard(card2) == 21);
    }
	public String largeHand(boolean isblackjack, int dealerScore) {
		if(isblackjack) {
			if(dealerScore < 10) {
				return "W";
			}else {
			return "S";		
			}
		}else{
			return "P";
		}
	}
	public String smallHand(int handScore, int dealerScore) {
		if(handScore >= 17) {
			return "S";
		}else if(handScore <= 11) {
			return "H";
		}else if(dealerScore >= 7) {
				return "H";
			}else {
				return "S";
			}
		}
    public String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);
        if (20 < handScore) {
            return largeHand(isBlackjack(card1, card2), dealerScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }
}
