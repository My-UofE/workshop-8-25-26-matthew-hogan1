package shape;


public class MovableCircle implements Shape { 
  private MovablePoint center;
  private int radius;
  
  // TASK: Add the constructor here
  public MovableCircle(int x,int y,int xSpeed,int ySpeed,int radius){
    
    
    this.center = new MovablePoint(x,y,xSpeed,ySpeed);
    this.radius = radius;
  }
  // TASK: Implement all abstract methods declared in the interface
  @Override
  public void moveUp() {
	 center.moveUp();
  }

  @Override
  public void moveDown() {
	 center.moveDown();
  }

  @Override
  public void moveLeft() {
	 center.moveLeft();
  }

  @Override
  public void moveRight() {
	 center.moveRight();
  }

  @Override
  public String toString(){
		int x = center.getx();
    int y = center.gety();
    
    String informationstring = "MovableCircle[center=MovablePoint[%d,%d],radius=%d]";
		return informationstring.format(informationstring,x,y,radius);
	}

  @Override
  public double area(){
    return Math.PI * radius * radius;
  }

  @Override
  public double perimeter(){
    return Math.PI * 2 * radius;
  }



}
