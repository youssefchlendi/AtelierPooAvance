import java.util.Scanner;

public class Authentification {
    final String LoginCorrect="scott",PwdCorrect="tiger";
	private String login,pwd;

    public Authentification() {
		boolean success=false;
		while(!success) {
		try {
			this.getUserLogin();
			this.getUserPwd();
			success = true;
		} catch (wrongUserNameException|wrongPasswordException|wrongInputLength e) {
			System.out.println(e.getMessage());
		}
		}
		if (success) {
			System.out.println("Connecté");
		}else {
			System.out.println("Non connecté");
		}
	}

    public void getUserLogin() throws wrongUserNameException, wrongInputLength {
		Scanner clavier = new Scanner(System.in);
		System.out.println("Donner votre login");
		this.login = clavier.nextLine();
		if (this.login.length()>10) {
			throw new wrongInputLength();
		}
		if (!this.login.equals(this.LoginCorrect)) {
			throw new wrongUserNameException();
		}
        clavier.close();
	}
    
	public void getUserPwd() throws wrongInputLength, wrongPasswordException {
		Scanner clavier = new Scanner(System.in);
		System.out.println("Donner votre mot de passe");
		this.pwd = clavier.nextLine();
		if (this.pwd.length()>10) {
			throw new wrongInputLength();
		}
		if (!this.pwd.equals(this.PwdCorrect)) {
			throw new wrongPasswordException();
		}
        clavier.close();

	}


}
