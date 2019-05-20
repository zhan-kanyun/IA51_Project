package Agent;

public enum Children_Category {
	cc_NoChildren(1),
	cc_OldestChildYoungerThan_6(2),
	cc_OldestChildBetween_6_And_12(3),
	cc_OldestChildOlderThan_12(4);
	
	public final int order;

	Children_Category(int o){
		this.order=o;
	}

}


