package FilterPattern;

import java.util.List;

/**
 * Created by ahmetatalay on 02/08/16.
 */
public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
