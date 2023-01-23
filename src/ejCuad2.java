
public class ejCuad2 {
	public double l;
	
	public ejCuad2() {
		this(160808); //es como se autoplatica el programa, en este caso, el lado del cuadrardo. Primero, digo que mi variable es "l" y
					  // y luego le digo que crearé un objeto con el constructor y que luego luego es 160808 y luego le asigno a 
					  // otra variable el valor (creando otro objeto con el segundo construtor) de l que es 160808 a través del primer constructor
	}
	public ejCuad2(double id) {
		this.l = id;
	}
	////////////////////////////
	public double calcDiago()
	{
		return Math.sqrt(Math.pow(l, 2)+ Math.pow(l, 2));
	}
	public double calcArea()
	{
		return Math.pow(l, 2);
	}
	public double calcPeri()
	{
		return l*4;
	}
	public void ladoDife(double d) {
		l = d;
	}
}
