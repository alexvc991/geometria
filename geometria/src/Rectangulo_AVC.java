/**
 * 
 * @author Alejandro Vicente Carpena
 * @version version 1.2
 *
 */
public class Rectangulo_AVC extends FiguraGeometrica_AVC {
	private double l1;
	private double l2;
	
	
	/**
	 * El constructor
	 * @param tipoFigura circulo, rectangulo o triangulo
	 * @param lG l1
	 * @param lP l2
	 */
	public Rectangulo_AVC(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}
	
	/**
	 * Devuelve el area, multiplicando l1*l2
	 */
	@Override
	public double area() {
		return l1 * l2;
	}
	
	/**
	 * Calcula el perimetro
	 */
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
