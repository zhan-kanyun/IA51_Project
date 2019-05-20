package Agent;

public enum Oldest_Household_Member_Age_Category {
	ac_OldestMemberIn_0_to_34(1),
	ac_OldestMemberIn_35_to_54(2),
	ac_OldestMemberIn_55_to_64(3),
	ac_OldestMemberIn_65_to_74(4),
	ac_OldestMemberOver_75(5);
	
	public final int order;
	Oldest_Household_Member_Age_Category(int o){
		this.order=o;
	}
	
}
