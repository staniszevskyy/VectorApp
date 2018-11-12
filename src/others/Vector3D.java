package others;

public abstract class Vector3D implements Algebra {
    public Vector2D vector2d;
    public double z;

    public Vector3D(Vector2D vector2d) {
        this.vector2d = vector2d;
        this.z = 0;
    }

    public Vector3D(Vector2D vector2d, double z) {
        this.vector2d = vector2d;
        this.z = z;
    }

    public abstract double scalar(Vector3D vec);
    public abstract Vector3D vectorProduct(Vector3D secondVec);

    @Override
    public double ab() {
        return vector2d.ab();
    }

    @Override
    public String toString() {

        return "["+vector2d.getX()+", "+vector2d.getY()+", "+z+"]";
    }
}
