package ejemplos;

public class Funcion {

    double resultado (int a, int b, int c, int d){
    double resultado = 0.0;
    int suma, multiplicacion;
    suma = a+b;
    multiplicacion = c*d;
    if (c == 0 || d == 0) {
        System.out.println("No se puede realizar una division dentro de 0, por favor ingresa nuevamente los numeros correctos");
    }else{
        resultado = (double) suma/multiplicacion;
        System.out.println("El resultado es de " + resultado);
    }
    return resultado;
    }
}
