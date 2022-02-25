

public class TesteContas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ContaCorrente cc = new ContaCorrente(111, 111);
			cc.deposita(100.0);
			
			ContaPoupanca cp = new ContaPoupanca(222, 222);
			
			cp.deposita(200.0);
			
			cc.transfere(10, cp);
			
			System.out.println(cc.saca(3000.0));
			
			System.out.println("Saldo Conta Poupança "+ cp.getSaldo());
			System.out.println("Saldo C"
					+ "onta Corrente "+ cc.getSaldo());
	}

}
