package enshuritu;

import static org.junit.Assert.*;
import java.math.*;
import org.junit.Test;

import junit.framework.TestCase;

import java.util.*;
public class MainClassTest extends TestCase {

	
	Calculater calculater;
	Stub stub;
	
	
	public void setUp() {
		calculater = new Calculater();
		stub = new Stub();
	}
	
	@Test
	public void testCalucuration() {
		double radius = 1.0;
		double area = calculater.Calucurate(radius);
		int intArea = (int)(area *100); 
		
		assertEquals(314,intArea);

	}
	
	@Test
	public void testRoundCutCase() {
		assertEquals(2, calculater.round(2.49) );
	}
	
	@Test
	public void testRoundUpCase() {
		assertEquals(3, calculater.round(2.50) );
	}
	
	@Test public void testStringToDouble(){
		double d = calculater.StringToDouble("0.333222");
		assertEquals(0.333222, d );
		
		double d2 = calculater.StringToDouble("0.3");
		assertEquals(0.3, d2 );
		
		double d3 = calculater.StringToDouble("0.30000");
		assertEquals(0.3, d3 );
		
		double d4 = calculater.StringToDouble("999.235");
		assertEquals(999.235, d4 );
	}
	
	@Test
	public void testSplitStringToStingArray(){
		
		String line = "10\n20\n30";
		
		String[] stringAttay = stub.split(line);		
		String[] testCase = {"10", "20", "30"};
		
		assertEquals(stringAttay.length,testCase.length);
		
		for(int i = 0; i < testCase.length; i++){
			assertEquals(stringAttay[i],testCase[i]);
		}		
	}
	
	@Test
	public void testCastStringsToDoubles() {
		String[] val_strs = {"1.55", "20", "30.45"};
		int[] val_test_case = {155, 2000, 3045};
		double[] tmp_vals = calculater.castStringsToDoubles(val_strs);
		for(int i = 0; i < tmp_vals.length; i++) {
			assertEquals(val_test_case[i], (int)(tmp_vals[i]*100) );
		}
	}
	
	/*
	@Test
	public void testRadiusDoubleArraytoAreaDoubleArray(){
		double[] testCase1 = {10,20,30,10.3,0.5};
		double[] soutei1 = {10*10* Math.PI,20*20*Math.PI,30*30* Math.PI,10.3*10.3* Math.PI,0.5*0.5* Math.PI};
		
		double[] kekka = calculater.RadiusDoubleArraytoAreaDoubleArray(testCase1);
		
		assertEquals(kekka.length,soutei1.length);
		for(int i = 0; i < testCase1.length; i++) {
			assertEquals(soutei1[i], kekka[i] );
		}
	}
	*/
	@Test
	public void testRadiusDoubleArraytoAreaIntRoundedArray(){
		double[] testCase1 = {10,20,30,10.3,0.5};
		int[] soutei1 = {314,1257,2827,333,1};
		int[] kekka = calculater.RadiusDoubleArraytoAreaIntRoundedArray(testCase1);
		
		assertEquals(kekka.length,soutei1.length);
		for(int i = 0; i < testCase1.length; i++) {
			assertEquals(soutei1[i], kekka[i] );
		}
	}

}
