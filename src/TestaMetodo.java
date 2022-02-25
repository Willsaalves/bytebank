
public class TestaMetodo {

	public static void main(String[] args) {

		Conta contadoWillian = new Conta( 1337, 24255);
		Conta contadoWillian1 = new Conta( 1337, 123);
		Conta contadoWillian2 = new Conta( 1337, 1423);

		Cliente Cli = new Cliente();

		Cli.setNome("Willian de Sá");
		Cli.setCpf("47667890838");
		Cli.setEndereco("rua dos alfaiates 2011");
		Cli.setProfissao("programador");

		
		contadoWillian.deposita(1000);

		contadoWillian.setTitular(Cli);
		System.out.println(contadoWillian.getTitular().getNome());

		boolean retirar = contadoWillian.saca(250);

		if (retirar) {
			System.out.println(contadoWillian.getSaldo());
		} else {
			System.out.println("ta pobre po");
		}
		
		System.out.println(Conta.getTotal());
		
		contadoWillian.setAgencia(30);
		contadoWillian.setNumero(30);
		
	}
}
