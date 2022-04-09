import java.util.Scanner;

public class Authentification {
    final String LoginCorrect="scott",PwdCorrect="tiger";
	private String login,pwd;

    public Authentification() {
		
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
    


}
