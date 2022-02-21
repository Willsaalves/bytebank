
public class TestaMetodo {

	public static void main(String[] args) {

		Cliente Cli = new Cliente();

		Cli.nome = "Willian de Sá";
		Cli.cpf = "47667890838";
		Cli.endereco = "rua dos alfaiates 2011";
		Cli.profissao = "programador";

		Conta contadoWillian = new Conta();

		contadoWillian.deposita(1000);
		
		contadoWillian.titular = Cli;
		System.out.println(contadoWillian.titular.nome);

		boolean retirar = contadoWillian.saca(250);

		if (retirar) {
			System.out.println(contadoWillian.saldo);
		} else {
			System.out.println("ta pobre po");
		}

	}
}
