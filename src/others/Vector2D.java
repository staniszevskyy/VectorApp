package others;

public class Vector2D implements Algebra {
    private double x;
    private double y;

    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }



    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }


    public double scalar(Vector2D secondVec) {
        return x*secondVec.getX()+ y*secondVec.getY();
    }

    @Override
    public double ab() {
        return Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
    }

    @Override
    public String toString() {
        return "["+x+", "+y+"]";
    }


}
