package Schedule;

public enum Transport_Mode {
	tm_car(1),
	tm_slow(3),
	tm_public(4),
	tm_carPassenger(5);
	
	public final int order;
	Transport_Mode(int o){
		this.order =o;
	}

}
