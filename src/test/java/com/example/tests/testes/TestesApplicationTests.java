package com.example.tests.testes;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class TestesApplicationTests {
	Calculadora calculadora;
	@Test
	void contextLoads() {
	}

	@BeforeEach
	public void init(){
		calculadora = new Calculadora();
	}
	@Test
	public void testSoma() {
		assertEquals(3, calculadora.soma(1, 2));
	}

	@Test
	public void testSubtracao() {
		assertEquals(1, calculadora.subtracao(3, 2));

	}

	@Test
	public void testDivisao() {
		assertEquals(5, calculadora.divisao(10, 2));
	}

	@Test
	public void testMultiplicacao() {
		assertEquals(10, calculadora.multiplicacao(5, 2));
	}
}
