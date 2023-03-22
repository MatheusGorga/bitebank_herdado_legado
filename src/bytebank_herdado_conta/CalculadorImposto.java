package bytebank_herdado_conta;

public class CalculadorImposto {
	private double imposto;
	
	public void registra(Tributavel t) {
		double valor = t.getValorImposto();
		this.imposto += valor;
	}
	
	public double getValorImposto() {
		return imposto;
	}
}
