package rockpaperscissors;

public class Object implements Comparable<Object> {
    private  int id;
    private String name;
    
    private final int[][] comparisons = {
    			// 		rock 	paper 	scissors
    	/*rock*/ 	{	0,		-1, 		1	},
    	/*paper*/ 	{	1,		 0, 		-1	},
    	/*scissors*/{	-1,		 1, 		0	}
    	// Win -> 1, Draw -> 0, Loss -> -1
    };
    
    protected String getName() {
		return name;
	}

    protected void setName(String name) {
		this.name = name;
	}

	protected int getId() {
        return id;
    }

    protected void setId(int id) {
        this.id = id;
    }
    
	@Override
	public String toString() {
		return "Object [id=" + id + ", name=" + getName() + "]";
	}

	@Override
	public int compareTo(Object other) {
    	return comparisons[this.id][other.id];
    }
}
