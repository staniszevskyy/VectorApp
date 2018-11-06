package view;


import others.Vector2D;
import decorator.VectorDecorator;
import adapter.VectorAdapter;

public class App {
    public static void main(String [] args){
//            others.Vector2D vec = new others.Vector2D(-5,10);
//            others.Vector2D second = new others.Vector2D(-5, 30);
//            decorator.VectorDecorator vectorek = new decorator.VectorDecorator(vec);
//            decorator.VectorDecorator secondVectorek = new decorator.VectorDecorator(second, 1);
//            System.out.println(vectorek.vectorProduct(secondVectorek));
//
//            adapter.VectorAdapter vectorFactory = new adapter.VectorAdapter(new others.Vector2D(5, 7 ));
//            System.out.println(vectorFactory.getAngle());
        Vector2D v1 = new Vector2D(1,1);
        Vector2D v2 = new Vector2D(3,4);
        VectorDecorator calc = new VectorDecorator(v1);
        System.out.println(v1);
        System.out.println(v2);
        System.out.println("Iloczyn skalarny: " + calc.scalar(v2));
        System.out.println("Iloczyn wektorowy: " + calc.vectorProduct(v2));
        VectorAdapter v = new VectorAdapter(v1);
        System.out.println(v);
        VectorAdapter vv = new VectorAdapter(45.0,  1.41);
        System.out.println(vv);
    }
}
