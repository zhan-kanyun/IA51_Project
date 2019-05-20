package Road;

import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import org.eclipse.xtext.xbase.lib.Pure;

/**
 * @author 15800
 */
@SarlSpecification("0.8")
@SarlElementType(10)
@SuppressWarnings("all")
public class Point {
  private float x;
  
  private float y;
  
  public Point(final float x, final float y) {
    this.x = x;
    this.y = y;
  }
  
  @Pure
  public float getX() {
    return this.x;
  }
  
  @Pure
  public float getY() {
    return this.y;
  }
  
  public void setX(final float x) {
    this.x = x;
  }
  
  public void setY(final float y) {
    this.y = y;
  }
  
  @Pure
  public float distanceToOrigine() {
    double _pow = Math.pow(this.x, 2);
    double _pow_1 = Math.pow(this.y, 2);
    double _sqrt = Math.sqrt((_pow + _pow_1));
    return ((float) _sqrt);
  }
  
  @Pure
  public float distanceToOther(final Point point) {
    double _pow = Math.pow((this.x - point.x), 2);
    double _pow_1 = Math.pow((this.y - point.y), 2);
    double _sqrt = Math.sqrt((_pow + _pow_1));
    return ((float) _sqrt);
  }
  
  @Override
  @Pure
  @SyntheticMember
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Point other = (Point) obj;
    if (Float.floatToIntBits(other.x) != Float.floatToIntBits(this.x))
      return false;
    if (Float.floatToIntBits(other.y) != Float.floatToIntBits(this.y))
      return false;
    return super.equals(obj);
  }
  
  @Override
  @Pure
  @SyntheticMember
  public int hashCode() {
    int result = super.hashCode();
    final int prime = 31;
    result = prime * result + Float.floatToIntBits(this.x);
    result = prime * result + Float.floatToIntBits(this.y);
    return result;
  }
}
