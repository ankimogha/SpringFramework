import org.springframework.context.ApplicationContext;

public class Triangle implements Shape{
  //private String type;
  //private int height;
  // Constructor Injection Example
  /*public Triangle(String type, int height) {
    this.type = type;
    this.height = height;
  }*/
  /*public Triangle(String type) {
    this.type = type;
  }*/
  /*public int getHeight() {
    return height;
  }*/

  // SETTER Injection Example
//  public void setType(String type) {
//    this.type = type;
//  }
  /*public String getType() {
    return type;
  }*/
  /*public void draw() {
    System.out.println(getType() + " Triangle drawn Height " + getHeight());
  }*/

//  //Object Injection Example
//  Point pointA;
//  Point pointB;
//  Point pointC;
//  public Triangle(Point pointA, Point pointB, Point pointC) {
//    this.pointA=pointA;
//    this.pointB=pointB;
//    this.pointC=pointC;
//  }
//  public Point getPointA() {
//    return pointA;
//  }
//
//  /*public void setPointA(Point pointA) {
//    this.pointA = pointA;
//  }*/
//  public Point getPointB() {
//    return pointB;
//  }
//
//  /*public void setPointB(Point pointB) {
//    this.pointB = pointB;
//  }*/
//  public Point getPointC() {
//    return pointC;
//  }
//
//  /*public void setPointC(Point pointC) {
//    this.pointC = pointC;
//  }*/

  //List (Collection) Example
  /*private List<Point> points;

  public List<Point> getPoints() {
    return points;
  }

  public void setPoints(List<Point> points) {
    this.points = points;
  }

  public void draw() {
    for (Point point : points) {
      System.out.println("Point  = (" + point.getX() + ", " + point.getY() + ")");
    }
  }*/

    //Bean Autowiring Example
    private Point pointA;
    private Point pointB;
    private Point pointC;

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public void draw () {
        System.out.println("Points of a Triangle");
        System.out.println("Point A = (" + getPointA().getX() + ", " + getPointA().getY() + ")");
        System.out.println("Point B = (" + getPointB().getX() + ", " + getPointB().getY() + ")");
        System.out.println("Point C = (" + getPointC().getX() + ", " + getPointC().getY() + ")");
    }
}
