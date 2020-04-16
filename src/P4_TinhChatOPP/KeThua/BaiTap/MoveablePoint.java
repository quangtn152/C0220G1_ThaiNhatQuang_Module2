package P4_TinhChatOPP.KeThua.BaiTap;

public class MoveablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;
    private float x;
    private float y;

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        return new float[]{getxSpeed(), getySpeed()};
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        setxSpeed(xSpeed);
        setySpeed(ySpeed);
    }

    public MoveablePoint move() {
        setX(getX() + getxSpeed());
        setY(getY() + getySpeed());

        return this;
    }

    @Override
    public String toString() {
        return "Point(" + getX() + ", " + getY() + ") has speed : (" + getxSpeed() + ", " + getySpeed() + ")";
    }
}
