package bytebank_herdado_conta;

public class TesteTributaveis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaCorrente cc = new ContaCorrente(111, 1123);
		cc.deposita(200);
		
		SeguroDeVida sv = new SeguroDeVida();
		
		CalculadorImposto calc = new CalculadorImposto();
		calc.registra(cc);
		
		System.out.println(calc.getValorImposto());
	
	}

}
