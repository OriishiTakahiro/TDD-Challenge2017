package enshuritu;

import java.math.*;

public class Calculater {	
	public double Calucurate(double radius){
		
		double area = radius * radius * Math.PI;
		return area;
	}
	
	public int round(double val) {
		return (int) (val+0.5);
	}
	
	public double StringToDouble(String st){
		return Double.parseDouble(st);
	}
	
	public double[] castStringsToDoubles(String[] val_str_list) {
		double[] val_list = new double[val_str_list.length];
		for(int i = 0; i < val_str_list.length; i++) {
			val_list[i] = Double.parseDouble(val_str_list[i]);
		}
		return val_list;
	}
	

	
	public int[] RadiusDoubleArraytoAreaIntRoundedArray(double[] arg){
		int[] out = new int[arg.length];
		for(int i=0;i < arg.length;i++){
			out[i] = round(Calucurate(arg[i]));
		}
		return out;
	}
	
}
