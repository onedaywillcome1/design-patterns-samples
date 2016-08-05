package FilterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ahmetatalay on 02/08/16.
 */
public class CriteriaFemale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> femalePersons = new ArrayList<Person>();

        for ( Person person : personList){
            if (person.getGender().equalsIgnoreCase("female"))
                femalePersons.add(person);
        }
        return femalePersons;
    }
}
