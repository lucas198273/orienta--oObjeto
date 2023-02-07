package orientaçãoobjeto.interfacepratica;

public class Calculadora implements OperacoesMatematicas{
//  A classse deve implementar todos os metodos de Opereçõesmatematicas
@Override
public void soma(double operador1, double operador2){
    System.out.println("soma: "+(operador1 + operador2));
}

@Override
public void subtracao(double operador1, double operador2){
    System.out.println("Subtração" +(operador1 - operador2));
}

@Override
public void divisao(double operador1, double operador2){
    System.out.println("Divisao: "+ (operador1 / operador2));
}

@Override
public void multiplicacao(double operador1, double operador2){
    System.out.println("multiplicacao: "+ (operador1 * operador2));
}
}
