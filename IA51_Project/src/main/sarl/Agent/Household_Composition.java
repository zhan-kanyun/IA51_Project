package Agent;

public enum Household_Composition {
	hhc_SingleNoWorker(1),
	hhc_SingleOneWorker(2),
	hhc_DoubleOneWorker(3),
	hhc_DoubleTwoWorker(4),
	hhc_DoubleNoWorker(5);
	
	public final int order;
	Household_Composition(int o){
		this.order =o;
	}

}
