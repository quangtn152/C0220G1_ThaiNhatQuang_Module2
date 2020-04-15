package P4_TinhChatOPP.KeThua.BaiTap;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D(float x, float y, float z) {
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
        return new float[]{getX(), getY(), getZ()};
    }

    public void setXYZ(float z) {
        super.x = getX();
        super.y = getY();
        this.z = z;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                " x= " + getX() +
                " y= " + getY() +
                " z= " + this.z +
                '}';
    }
}
