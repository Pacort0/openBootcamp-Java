package ejercicio;

public class Ejercicio02 {
	final static double IVA = 0.21;

	public static void main(String[] args) {
		double precioInicial = 10.5;
		double precioFinal;
		
		precioFinal = precioConIVA(precioInicial);
		
		System.out.println(precioFinal);
	}
	
	static double precioConIVA(double precioInicial) {
		double precioFinal;
		
		precioFinal = precioInicial + precioInicial*IVA;
		
		return precioFinal;
	}

}
