package testng;

public class DataObject {

	private String userName;
	private String password;

	public DataObject(String userName, String password) {

		this.userName = userName;
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

}
