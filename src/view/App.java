package view;


import others.Vector2D;
import decorator.VectorDecorator;
import adapter.VectorAdapter;

public class App {
    public static void main(String [] args){

        Vector2D v1 = new Vector2D(1,1);
        Vector2D v2 = new Vector2D(3,4);
        VectorDecorator calc = new VectorDecorator(v1);
        System.out.println(v1);
        System.out.println(v2);
        System.out.println("Iloczyn skalarny: " + calc.scalar(v2));
        System.out.println("Iloczyn wektorowy: " + calc.vectorProduct(v2));
        VectorAdapter v = new VectorAdapter(v1);
        System.out.println(v);
        System.out.println("Tworzymy wektor na podstawie kąta 45 stopni i dlugosci ~=1.41");
        VectorAdapter vv = new VectorAdapter(45.0,  1.41);
        System.out.println(vv);
    }
}
