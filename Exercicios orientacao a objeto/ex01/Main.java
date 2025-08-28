package ex01;

/**
 *  Fazer um programa para ler os valores da largura e altura
 * de um retângulo. Em seguida, mostrar na tela o valor de
 * sua área, perímetro e diagonal. Usar uma classe como
 * mostrado no projeto ao lado.
 */


public class Main {
    public static void main (String args[]){
        Rectangle rectangle = new Rectangle();

        rectangle.height = 3;
        rectangle.width = 4;

        System.out.println("Area: " + rectangle.area());
        System.out.println("Perimetro: " + rectangle.perimeter());
        System.out.println("Diagonal: " + rectangle.diagonal());
    }
}
