
public class calfClass extends femerClass{
	 int superX =0;
	 int superY =0;
	
	public calfClass()
	{
		rotate = 0;
//		 degrease = 0;
		 //theta = 3;
		 //rad = 3;
//		 x = 0;
//		 y = 0;
//		 xs = 0;
//		 ys = 0;
		 boneLength = 20;
//		 xs = �;
//		 ys = �;
		 max = 3;
		 min = 0;
	}

	public void move(double serc) {
		
		
		if (rad> parent_radian+3) {
			increment = false;

//			System.out.println("set false");
		}
		if (rad  < parent_radian) {
			increment = true;

//			System.out.println("set true");
//			System.out.println("increment: " + increment + min);
		}
		if (increment) {
			rad += serc;
		} else if(!increment) {
			rad -= serc;

		}
	}

	

	public void math() {
		
	
		theta = (((rad) * Math.PI)/12 );
		x = xs+(int) ((boneLength) * Math.cos(theta));
		y = ys+(int) ((boneLength) * Math.sin(theta));
//		System.out.println("did math");
	}
	public void connectPart()
	{
		
//		xs=super.getX();//can I get the current operating value from an instance here
//		ys=super.getY();
//		System.out.println("calf\nxs: "+xs+"\nys: "+ys+"\nx: "+x+"\ny :"+y);

	}

	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	 public void setSuperX(int superX) {
			this.superX = superX;
		}public void setSuperY(int superY) {
			this.superY = superY;
		}
	public double getRad() {
		return rad;
	}

	public void setRad(double rad) {
		
		
//		if (rad>max) {
//			increment =false;
//			
//
//		}else if(rad<min){
//			increment=true;
//		
//		}
//		if (increment) {
//			this.rad=this.rad +rad;
//		}else
//		{
//		this.rad=this.rad -rad;
//
//		}
		this.rad = rad;
		//min=this.rad-7;
		max=10;
	}
	public void setCurrent_radian(double current_radian) {
		this.parent_radian = current_radian;
	}
	public void setBoneLength(int boneLength) {
		this. boneLength=boneLength;
		
	}
	
	public int getBoneLength() {
		return boneLength;
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

	
//	public void connectPart(int x, int y) {
//		// TODO Auto-generated method stub
//		
//	}

}

