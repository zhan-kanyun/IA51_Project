package Road;

import Road.Point;
import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;

@SarlSpecification("0.8")
@SarlElementType(10)
@SuppressWarnings("all")
public class RoadTest {
  public static void main(final String[] args) {
    Point p1 = new Point(2, 4);
    Point p2 = new Point(6, 8);
    float distance = p1.distanceToOther(p2);
    float speed = 20;
    float time = (distance / speed);
    System.out.println(time);
  }
  
  @SyntheticMember
  public RoadTest() {
    super();
  }
}
