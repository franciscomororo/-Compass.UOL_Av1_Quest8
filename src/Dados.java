
public class Dados {
	private String[] nome = { "abc", "def", "ghi" };
	private String[] senha = { "123", "456", "789" };

	public Boolean logar(String login, String password) {
		for (int i = 0; i < 3; i++) {
			if(login.equalsIgnoreCase(nome[i]) && password.equals(senha[i])) {
				return true;
			}
		}
		return false;
	}
}
