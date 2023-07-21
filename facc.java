package factorial;

import java.util.Scanner;

import findFibonacci.Fibona1;

public class facc {
	int factoralla(int n) {
		if(n==0) {
			return 1;
		}
		return factoralla(n-1)*n;
	}

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		int n=Sc.nextInt();
		facc factoral=new facc();
		System.out.println(factoral.factoralla(n));;

	}

}
