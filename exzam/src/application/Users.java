package application;

public class Users {
	String Login;
	String Password;
	public String getLogin() {
		return Login;
	}
	public void setLogin(String login) {
		Login = login;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public Users(String login, String password) {
		super();
		Login = login;
		Password = password;
	}

}
