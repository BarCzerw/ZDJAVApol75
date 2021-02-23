package wstepoop.homework.inheritance.zadanie1;

public class Point3D extends Point2D {

    protected float z;

    Point3D() {
        this(0, 0, 0);
    }

    Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        return new float[]{x, y, z};
    }

    public void setXYZ(float x, float y, float z) {
        setXY(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "( " + x + " , " + y + " , " + z + " )";
    }
}
