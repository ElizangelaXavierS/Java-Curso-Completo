package object_toString.exercicio02;
public class Funcionario {
    String name;
    double salarioBruto;

    double imposto;

    public double salarioLiquido() {
        return salarioBruto - imposto;
    }

    public void aumentoSalario(double pocentagem) {
        double aumento = (salarioBruto * pocentagem) / 100;
        this.salarioBruto = aumento + salarioBruto;
    }

}
