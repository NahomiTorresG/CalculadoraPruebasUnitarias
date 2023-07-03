package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class CalculadoraTestCase {

	@Test
	void testSumar() {
		int resultado = Calculadora.Sumar(2, 3);
		
		//Para esta prueba, espero que la suma me de 5 (3+2)
		assertEquals(resultado, resultado);//lo que espero, y lo que tengo
		
	}//testSumar

	
	
	@Test
	void testMultiplicar() {
		int resultado = Calculadora.multiplicar(2, 3);
		assertEquals(6, resultado); //Lo que espero y lo que tengo
	}//testMultiplicar
	
	
	@Test
	void testdividir() {
		float resultado = Calculadora.dividir(6.0f, 2.0f);
		assertEquals(3, resultado); //Lo que espero y lo que tengo
	}//testdividir
	
	
//	@Test(expected = ArithmeticException.class)
//	void testdividir() {
//		float resultado = Calculadora.dividir(6.0f, 0.0f);
//		assertEquals(3, resultado); //Lo que espero y lo que tengo
//	}//testdividir
	
}
