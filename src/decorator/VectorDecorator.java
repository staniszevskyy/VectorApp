package decorator;


import others.*;

public class VectorDecorator extends Vector3D {

    //TO JEST DEKORATOR ALE JEST DZIEDZICZENIE TYLKO DLATEGO ZE VECTOR3D JEST ABSTRAKCYJNY

    public VectorDecorator(Vector2D v2d) {
        super(v2d);
    }

    public VectorDecorator(Vector2D vector2d, double z) {
        super(vector2d, z);
    }

    public double scalar(Vector3D secondVec) {
        return this.vector2d.scalar(secondVec.vector2d);

    }

    public double scalar(Vector2D secondVec){
        return this.vector2d.scalar(secondVec);
    }


    public Vector3D vectorProduct(Vector3D secondVec) {
        double x = vector2d.getY()*secondVec.z-z*secondVec.vector2d.getY()+0.0;
        double y = z*secondVec.vector2d.getX()-vector2d.getX()*secondVec.z+0.0;
        double z = vector2d.getX()*secondVec.vector2d.getY()-vector2d.getY()*secondVec.vector2d.getX()+0.0;
        return new VectorDecorator(new Vector2D(x,y), z);
    }

    public Vector3D vectorProduct(Vector2D secondVec){
        VectorDecorator temp = new VectorDecorator(secondVec);
        return this.vectorProduct(temp);
    }


}
