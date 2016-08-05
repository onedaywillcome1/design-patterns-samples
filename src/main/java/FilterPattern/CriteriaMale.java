package FilterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ahmetatalay on 02/08/16.
 */
public class CriteriaMale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> malePersons = new ArrayList<Person>();

        for ( Person person : personList){
            if (person.getGender().equalsIgnoreCase("male"))
                malePersons.add(person);
        }
        return malePersons;
    }
}
