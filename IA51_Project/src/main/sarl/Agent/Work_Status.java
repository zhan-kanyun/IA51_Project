package Agent;

public enum Work_Status {
	ws_NoWork(0),
	ws_Work(2);
	
	public final int order;
	Work_Status(int o){
		this.order=o;
		
	}
}
