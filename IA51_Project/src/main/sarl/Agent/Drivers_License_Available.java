package Agent;

public enum Drivers_License_Available {
	dl_HasDriversLicense(1),
	dl_HasNoDriversLicense(0);
	
	public final int order;

	Drivers_License_Available(int o){
		this.order=o;
	}

}
