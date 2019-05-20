package Schedule;

public enum Day_of_Week {
	Monday(1),
	Tuesday(2),
	Wednesday(3),
	Thursday(4),
	Friday(5),
	Saturday(6),
	Sunday(7);
	
	public final int order;
	
	Day_of_Week(int o){
		this.order=o;
	}

}
