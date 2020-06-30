package mapfre.automationTestsMcc.utils.config;

public enum BrowserOptions {

	IE(1, "webdriver.ie.driver"),FIREFOX(2, ""),EDGE(3, "webdriver.edge.driver"),CHROME(4, "webdriver.chrome.driver"), SAFARI(5, "");
	 
	private int option;
	private String driver;
	
	BrowserOptions(int option, String driver){
		this.option = option;
		this.driver = driver;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public int getOption() {
		return this.option;
	}

	public void setOption(int option) {
		this.option = option;
	}
}
