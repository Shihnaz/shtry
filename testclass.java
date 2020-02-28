
package gettingstart;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class testcalc {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	
	public void positive() {
		int a = 10;
		int b = 20;
		Calculater calc = new Calculater();
		int result = calc.add(a, b);
		assertTrue(result>0);
	}
	@Test
	  public void negative() {
		int a = -10;
		int b = -20;
		Calculater calc = new Calculater();
		int result = calc.add(a, b);
		assertTrue(result==-30);}
	@Test
	 public  void diffrent() {
		int a = -10;
		int b = 20;
	Calculater calc = new Calculater();
		int result = calc.add(a, b);
		assertTrue(result==10);
	}

	
	
	
	
	
}
