import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Validar {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("HH");
		Integer hora = Integer.parseInt(sdf.format(new Date()));
		Usuario usuario = new Usuario();
		Dados validar = new Dados();

		System.out.println("Digite seu usu�rio: ");
		usuario.setNome(entrada.nextLine());

		System.out.println("Digite seu senha: ");
		usuario.setSenha(entrada.nextLine());

		if (validar.logar(usuario.getNome(), usuario.getSenha())) {
			if (hora >= 6 && hora < 12) {
				System.out.println("Bom dia, voc� se logou ao nosso sistema.");
			} else if (hora >= 12 && hora < 18) {
				System.out.println("Boa tarde, voc� se logou ao nosso sistema.");
			} else if (hora >= 18 && hora < 24) {
				System.out.println("Boa noite, voc� se logou ao nosso sistema.");
			} else {
				System.out.println("Boa madrugada, voc� se logou ao nosso sistema.");

			}

		} else {
			System.out.println("Usu�rio e senha incorretos!!!");
		}

	}

}
