package Schedule;

import Schedule.Day_of_Week;
import Schedule.Episode;
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
public class Schedule {
  private Day_of_Week day;
  
  private Episode[] list;
  
  public Schedule(final Episode[] l, final Day_of_Week day) {
    this.list = l;
    this.day = day;
  }
  
  @Override
  @Pure
  @SyntheticMember
  public boolean equals(final Object obj) {
    return super.equals(obj);
  }
  
  @Override
  @Pure
  @SyntheticMember
  public int hashCode() {
    int result = super.hashCode();
    return result;
  }
}
