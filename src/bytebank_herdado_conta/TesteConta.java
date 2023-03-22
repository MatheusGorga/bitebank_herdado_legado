package bytebank_herdado_conta;

public class TesteConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaCorrente cc = new ContaCorrente(111, 1112);
		cc.deposita(100);
		
		ContaPoupanca cp = new ContaPoupanca(100, 0120);
		cp.deposita(200);
		
		cc.transfere(10, cp);
		
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());
		
	}

}
