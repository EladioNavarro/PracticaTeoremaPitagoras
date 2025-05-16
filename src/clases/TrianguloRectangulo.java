package clases;

public class TrianguloRectangulo {
	
	private int a;
	private int b;
	private double c;
	
	//Metodo constructor
	
	public TrianguloRectangulo(int a, int b) {
		
		this.a= a;
		this.b=b;
	}
	
	public int triangulo(int a, int b) {
		
		if (a<=0 || b<=0) {
			//Aqui tiene que lanzar el IllegalArgumentException
			System.out.println("IllegalArgumentException");
		}
		return a;
		
	}
	
	public double area() {
		double area = ((a*b)/2);
		return area;
		
	}
	
	public double hipotenusa() {
		double c = Math.sqrt(a^2+b^2);
		return c;
	}
	
	public double perimetro() {
		double perimetroCalculado = a+b+c;
		return perimetroCalculado;
	}
	
	public void setA(int a) {
		this.a=a;
		System.out.println(a);
	}
	
	public void setB(int b) {
		this.b=b;
		System.out.println(b);
	}
	
	public int getValores() {
		System.out.println(this.a);
		System.out.println(this.b);
		return this.a;
	}
	
	@Override
	public String toString() {
		String res = "";
		res+= "Los lados del triangulo son:\n"+"a: "+this.a+"\n b= "+this.b+"\n c: "+this.c; 
		return res;
	}

}
