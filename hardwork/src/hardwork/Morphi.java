package hardwork;

import hardwork.Poli.Helper;

public class Morphi {
	class Helper2 {
		 
	    // Method with 2 integer parameters
	    static int Multiply(int a, int b)
	    {
	 
	        // Returns product of integer numbers
	        return a + b;
	    }
	 
	    // Method 2
	    // With same name but with 2 double parameters
	    static double Multiply(double a, double b)
	    {
	 
	        // Returns product of double numbers
	        return a * b;
	    }
	}
	 
	// Class 2
	// Main class
	class GFG {
	 
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.out.println(Helper.Multiply(2, 4));
	        System.out.println(Helper.Multiply(5.5, 6.3));
	        System.out.println(Helper.Multiply(2, 8));
	}

}
