import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Circle implements Shape, ApplicationEventPublisherAware {
    private Point center;
    private ApplicationEventPublisher applicationEventPublisher;

    public Point getCenter() {
        return center;
    }

    @Resource
    public void setCenter(Point center) {
        this.center = center;
    }

    @Override
    public void draw() {
        System.out.println("Points of a Circle");
        System.out.println("Point is : (" + getCenter().getX() + ", " + getCenter().getY() + ")");
        DrawEvent drawEvent = new DrawEvent(this);
        applicationEventPublisher.publishEvent(drawEvent);
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }
}
