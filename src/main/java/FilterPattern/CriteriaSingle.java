package FilterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ahmetatalay on 02/08/16.
 */
public class CriteriaSingle implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> singlePersons = new ArrayList<Person>();

        for ( Person person : personList){
            if (person.getMaritalStatus().equalsIgnoreCase("single"))
                singlePersons.add(person);
        }
        return singlePersons;
    }
}
