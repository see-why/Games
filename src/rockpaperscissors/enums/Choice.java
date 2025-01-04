package rockpaperscissors.enums;

public enum Choice {
	ROCK, PAPER, SCISSORS;
	
	private Choice beats;
	
	static {
		ROCK.beats = SCISSORS;
		SCISSORS.beats = PAPER;
		PAPER.beats = ROCK;
	}

    public int beats(Choice other) {
    	if (this.beats == other) {
    		return 1;
    	}
    	
    	if (this == other) {
    		return 0;
    	}
    	
    	return -1;
    }
}
