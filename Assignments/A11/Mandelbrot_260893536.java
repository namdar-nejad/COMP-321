import java.lang.*;
import java.util.*;

public class Mandelbrot {
	public static void main(String[] args) {
		int casenum = 1;
		double a = 0.0 ; double b = 0.0; int c = 0;
		Complex start; Complex end; boolean wrong;
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextLine()) {
			a = sc.nextDouble();
			b = sc.nextDouble();
			c = sc.nextInt();
			sc.nextLine();

			start = new Complex(0.0,0.0);
			end = new Complex(a,b);
			wrong = true;

			for(int i=0; i<=c; i++){
				if(Complex.abs(start) > 2) wrong = false;
				start = Complex.add(Complex.square(start),end);
			}
			
			if(wrong) System.out.printf("Case %d: IN\n", casenum);
			else System.out.printf("Case %d: OUT\n", casenum);
			
			casenum++;
		}
	}
}


// Took some parts of the complex class from the internet
class Complex {
	double a;
	double b;
	
	public Complex(double a, double b) {
		this.a = a;
		this.b = b;
	}

	public static Complex square(Complex a) {
		return new Complex(a.a*a.a-a.b*a.b,2*a.a*a.b);
	}
	
	public static double abs(Complex a) {
		return Math.sqrt(a.a*a.a+a.b*a.b);
	}
	
	public static Complex add(Complex a, Complex b) {
		return new Complex(a.a+b.a,a.b+b.b);
	}
}

