package Schedule;

import Schedule.Activity_Type;
import Schedule.Location;
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
public class Activity {
  /**
   * attributes
   */
  public int id;
  
  public int start_time;
  
  public int duration;
  
  public Location location;
  
  public Activity_Type type;
  
  /**
   * constructor
   */
  public Activity(final int id) {
    this.id = id;
    this.start_time = (-1);
    this.duration = (-1);
    this.location = null;
    this.type = null;
  }
  
  public Activity(final int id, final int st, final int d, final Location l, final Activity_Type type) {
    this.id = id;
    this.start_time = st;
    this.duration = d;
    this.location = l;
    this.type = type;
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
    Activity other = (Activity) obj;
    if (other.id != this.id)
      return false;
    if (other.start_time != this.start_time)
      return false;
    if (other.duration != this.duration)
      return false;
    return super.equals(obj);
  }
  
  @Override
  @Pure
  @SyntheticMember
  public int hashCode() {
    int result = super.hashCode();
    final int prime = 31;
    result = prime * result + this.id;
    result = prime * result + this.start_time;
    result = prime * result + this.duration;
    return result;
  }
}
