public class Conta {

	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	public static int getTotal() {
		return Conta.total;
	}

	public static void setTotal(int total) {
		Conta.total = total;
	}

	public Conta(int agencia, int numero) {
		
		Conta.total++;
		
		System.out.println("total de conta é "+ Conta.total);
		this.agencia = agencia;
		this.numero = numero;
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public boolean saca(double valor) {

		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else
			return false;

	}

	public boolean transfere(double valor, Conta destino) {

		if (this.saldo >= valor) {
			this.saldo -= valor;

			destino.deposita(valor);

			return true;
		}

		return false;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public int getAgencia() {

		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {

			System.out.println("não pode numero negativo ou zero");
			return;

		}
		this.agencia = agencia;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		if (agencia <= 0) {

			System.out.println("não pode numero negativo ou zero");
			return;
		}

		this.numero = numero;
	}

}
