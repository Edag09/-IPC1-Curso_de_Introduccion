package clase3;
import java.util.Scanner;
import java.lang.Math;

public class Clase3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		double M = in.nextDouble();
		double N = in.nextDouble();
		double resultado = 0.0;
		if(M<N){
                    System.out.println("No se puede generar la combinacion");
                }else{
                    if(N%2==0){
                        resultado = (factorial(M))/(factorial(M-N)*factorial(N));
                        System.out.println(resultado);
                    }else{
                        System.out.println("Debe de ser par");
                    }
                }
    }
    
    public static double factorial(double a){
        if(a == 0){
            return 1;
        }else{
            return a*factorial(a-1);
        }
    }
}

