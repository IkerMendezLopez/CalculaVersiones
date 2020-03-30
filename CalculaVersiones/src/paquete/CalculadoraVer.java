package paquete;

public class CalculadoraVer {
	private int parametro1;
	private int parametro2;
	
	public CalculadoraVer(int parametro1, int parametro2) {
		this.parametro1 = parametro1;
		this.parametro2 = parametro2;
	}
	
	public int sumar() {
		int resultado = parametro1 + parametro2;
		return resultado;
	}
}
