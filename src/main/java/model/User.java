package model;

public class User {

	private String Uname;
	private String Pword;

	public String getUname() {
		return Uname;
	}

	public User() {
	}

	public void setUname(String uname) {
		Uname = uname;
	}

	public String getPword() {
		return Pword;
	}

	public void setPword(String pword) {
		Pword = pword;
	}

	public User(String uname, String pword) {
		super();
		Uname = uname;
		Pword = pword;
	}

}
