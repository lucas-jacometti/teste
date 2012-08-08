package core;

public class version {
	
	private static final String VERSION = "1";
	private static final String DISTRIBUTION = "0";
	private static final String RELEASE = "0";
	private static final String BUILD = "0";
	
	public static String getVersion(){
		return VERSION + "." + DISTRIBUTION + "." + RELEASE + "." + BUILD;
	}

}
