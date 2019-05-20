package Agent;

public enum Gender {
	g_Male(1),
	g_Female(2);
	
	public final int order;
	Gender(int o){
		this.order=o;
	}

}
