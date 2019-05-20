package Agent;

public enum Income_Category {
	ic_0000_1249(1),
	ic_1250_2249(2),
	ic_2250_3249(3),
	ic_over_3250(4);
	
	public final int order;
	Income_Category(int o){
		this.order=o;
	}
	
}
