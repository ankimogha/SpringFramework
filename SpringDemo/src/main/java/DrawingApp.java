import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
  public static void main(String[] args) {
    ApplicationContext context =
        new ClassPathXmlApplicationContext("file:spring1.xml");

    Shape shape = (Shape) context.getBean("circle");
    shape.draw();

//    Alias Example
//    Triangle triangle1 = (Triangle) context.getBean("triangle-alias");
//    triangle1.draw();
  }
}
