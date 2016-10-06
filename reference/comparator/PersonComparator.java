package reference.comparator;
import java.util.*;
import reference.domain.*;

public class PersonComparator implements Comparator<Person>{
    
    private Map<Person, Integer> peopleIdentities;
    
    public PersonComparator(Map<Person, Integer> peopleIdentities) {
        this.peopleIdentities = peopleIdentities;
    }

    @Override
    public int compare(Person p1, Person p2) {
        int x1 = peopleIdentities.get(p1);
        int x2 = peopleIdentities.get(p2);
        if (x1 == x2) {
            return 0;
        }
        if (x1 > x2) {
            return -1;
        }
        return 1;
    }

}
