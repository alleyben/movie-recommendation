package reference.comparator;
import java.util.*;
import reference.domain.*;

public class FilmComparator implements Comparator<Film> {
    
    private Map<Film, List<Rating>> ratings;
    
    public FilmComparator(Map<Film, List<Rating>> ratings) {
        this.ratings = ratings;
    }

    @Override
    public int compare(Film f1, Film f2) {
        int total1 = 0;
        int total2 = 0;
        
        Iterator<Rating> scores1 = ratings.get(f1).iterator();
        while (scores1.hasNext()) {
            total1 += scores1.next().getValue();
        }
        
        Iterator<Rating> scores2 = ratings.get(f2).iterator();
        while (scores2.hasNext()) {
            total2 += scores2.next().getValue();
        }
        
        double avg1 = (double) total1/ratings.get(f1).size();
        double avg2 = (double) total2/ratings.get(f2).size();
        
        if (avg1 == avg2) {
            return 0;
        }
        if (avg1 > avg2) {
            return -1;
        }
        return 1;
    }
}
