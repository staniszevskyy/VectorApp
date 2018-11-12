package adapter;
import others.Algebra;
import others.Vector2D;

public class VectorAdapter implements Algebra {
    //TO JEST ADAPTER DWUKIERUNKOWY
    private Vector2D vector2D;

    public VectorAdapter(double angle, double length) {
        double x = Math.cos(Math.toRadians(angle))*length;
        double y = Math.sin(Math.toRadians(angle))*length;
        vector2D = new Vector2D(x, y);
    }

    public VectorAdapter(Vector2D vector2D) {
        this.vector2D = vector2D;
    }

    public Vector2D getVector2D() {
        return vector2D;
    }

    public double getAngle(){
        double angle = vector2D.getY() / vector2D.getX();
        return Math.toDegrees(Math.atan(angle));
    }


    public double ab(){
        return Math.sqrt(Math.pow(vector2D.getX(), 2) + Math.pow(vector2D.getY(),2));
    }


    @Override
    public String toString() {
        return vector2D+ " Angle: " + getAngle() + " , length: " + ab();
    }
}
