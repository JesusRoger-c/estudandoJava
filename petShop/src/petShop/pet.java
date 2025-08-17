package petShop;

public class pet {
	
	private final String name;
	private boolean clean;
	
	
	public pet(String name) {
		this.name = name;
		this.clean = false;
	}


	public boolean isClean() {
		return clean;
	}


	public void setClean(boolean clean) {
		this.clean = clean;
	}


	public String getName() {
		return name;
	}
	
	
	
	
	
	

}
