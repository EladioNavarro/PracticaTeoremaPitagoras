package app;

public class Principal {
	
	private int a;
	private int b;
	private double c;
	
	//Metodo constructor
	
	public Principal(int a, int b) {
		
		this.setA(a);
		this.setB(b);
	}
	
	public Principal (Principal triangulo) {
		this.a=4;
		this.b=5;
	}
	
	public double area() {
		double area = ((a*b)/2);
		return area;
		
	}
	
	public double perimetro() {
		double perimetroCalculado = a+b+c;
		return perimetroCalculado;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

}
