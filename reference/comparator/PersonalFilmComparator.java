package reference.comparator;
import java.util.*;
import reference.domain.*;

public class PersonalFilmComparator implements Comparator<Film> {
    
    private Map<Film, Rating> personalRatings;
    
    public PersonalFilmComparator(Map<Film, Rating> personalRatings) {
        this.personalRatings = personalRatings;
    }
    
    @Override
    public int compare(Film f1, Film f2) {
        int rating1 = personalRatings.get(f1).getValue();
        int rating2 = personalRatings.get(f2).getValue();
        
        if (rating1 == rating2) {
            return 0;
        } else if (rating1 > rating2) {
            return -1;
        } else {
            return 1;
        }
    }
}
