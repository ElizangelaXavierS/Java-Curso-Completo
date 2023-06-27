package object_toString.exercicio01;

public class Calcular {

    public static double area(double largura, double altura ){
        return largura * altura;
    }
    public static double perimetro (double largura, double altura){
        return 2 * (largura + altura);

    }
    public static double diagonal( double largura, double altura){
        return Math.sqrt(Math.pow(largura,2) + Math.pow(altura,2));
    }
}
