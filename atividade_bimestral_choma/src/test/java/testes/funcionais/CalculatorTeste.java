package testes.funcionais;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

public class CalculatorTeste {
	
	//classe de equivalencia positivo
	@Test
	public void resultadoSomaPositivo(){
		Calculator calculator = new Calculator();
		assertEquals(50, calculator.add(17,33));
	}
	
	@Test
	public void resultadoSubtracaoPositivo(){
		Calculator calculator = new Calculator();
		int a = 50;
		int b = 38;
		int esperado = 12;
		int resultado = calculator.subtract(a, b);
		
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void resultadoMultiplicacaoPositivo(){
		Calculator calculator = new Calculator();
		int a = 7;
		int b = 7;
		int esperado = 49;
		int resultado = calculator.multiply(a, b);
		
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void resultadoDivisaoPositivo(){
		Calculator calculator = new Calculator();
		int a = 25;
		int b = 5;
		int esperado = 5;
		int resultado = calculator.divide(a, b);
		
		assertEquals(esperado, resultado);
	}
	
	//classe de equivalencia negativo
	@Test
	public void resultadoSomaNegativo(){
		Calculator calculator = new Calculator();
		int a = -60;
		int b = -33;
		int esperado = -93;
		int resultado = calculator.add(a, b);
		
		assertEquals(esperado, resultado);
	}

	@Test
	public void resultadoSubstracaoNegativo(){
		Calculator calculator = new Calculator();
		int a = 10;
		int b = 13;
		int esperado = -3;
		int resultado = calculator.subtract(a, b);
		
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void resultadoMultiplicacaoNegativo(){
		Calculator calculator = new Calculator();
		int a = 7;
		int b = -7;
		int esperado = -49;
		int resultado = calculator.multiply(a, b);
		
		assertEquals(esperado, resultado);
	}

	@Test
	public void resultadoDivisaoNegativo(){
		Calculator calculator = new Calculator();
		int a = 6;
		int b = -3;
		int esperado = -2;
		int resultado = calculator.divide(a, b);
		
		assertEquals(esperado, resultado);
	}
	
	//classe de equivalencia por zero
	@Test
	public void resultadoDivisaoZero(){
		Calculator calculator = new Calculator();
		int a = 43;
		int b = 0;
		
		Exception resultado = assertThrows(IllegalArgumentException.class,
				() -> calculator.divide(a,b));
		assertEquals("Cannot divide by zero",resultado.getMessage());
	
	}
}
