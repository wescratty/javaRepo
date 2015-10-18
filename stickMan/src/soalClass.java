import java.awt.Graphics;

public abstract class soalClass {

	protected int rotate = 0;
	protected int degrease = 0;
	protected double theta = 0;
	protected double rad = 0;
	protected int num = 300;
	

	protected int x = 0;
	protected int y = 0;
	protected int xs = 0;//
	
	protected int ys = 0;//
	

	protected int boneLength = 0;
	
	
	

	public soalClass() {

	}

	public void move() {

	}

	public void math() {
		theta = (((rad) * Math.PI) / 2);
		x = (int) ((rad) * Math.cos(theta));
		y = (int) ((rad) * Math.sin(theta));
	}

	public abstract void connectPart(int x, int y) ;
public int getnum() {
	return num;
}
public void setnum(int num) {
	this.num = num;
}
	public double getRad() {
		return rad;
	}

	public void setRad(double rad) {
		this.rad = rad;
	}
	public double getTheta() {
		return theta;
	}

	public void setTheta(double theta) {
		this.theta = theta;
	}
	public int getBoneLength() {
		return boneLength;
	}
	public void setBoneLength(int boneLength) {
		this.boneLength = boneLength;
	}

	public int getXs() {
		return xs;
	}

	public void setXs(int xs) {
		this.xs = xs;
	}

	public int getYs() {
		return ys;
	}

	public void setYs(int ys) {
		this.ys = ys;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
