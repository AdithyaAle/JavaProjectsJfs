package sample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import tester.Arithmetic;
 
class TestArithmetic {
   Arithmetic ath=new Arithmetic();
	@Test
	void test() {
		assertEquals(10, ath.add(20,3));
	}

}
