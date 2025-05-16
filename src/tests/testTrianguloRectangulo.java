package tests;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

class testTrianguloRectangulo {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	private int a;
	private int b;
	private double c;
	
	
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

}
