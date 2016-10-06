package reference;
import reference.domain.*;
import java.util.*;

public class RatingRegister {
    
    private Map<Film, List<Rating>> allrs = new HashMap<Film, List<Rating>>();
    private Map<Person, Map<Film, Rating>> prs = new HashMap<Person, Map<Film, Rating>>();
    
    public void addRating(Film film, Rating rating) {
        if (!allrs.containsKey(film)) {
            allrs.put(film, new ArrayList<Rating>());
        }
        //reg.get(film).add(rating); ////instead
        getRatings(film).add(rating); ///////////////using class method
    }
    
    public List<Rating> getRatings(Film film) {
        return allrs.get(film);
    }
    
    public Map<Film, List<Rating>> filmRatings() {
        return allrs;
    }
    
    public void addRating(Person person, Film film, Rating rating) {
        if (!prs.containsKey(person)) {
            prs.put(person, new HashMap<Film, Rating>());
        }
        prs.get(person).put(film, rating);
        addRating(film, rating); ///////////////////puting it in allrs
    }
    
    public Rating getRating(Person person, Film film) {
        Rating rating = prs.get(person).get(film);
        if (rating == null) {
            return rating.NOT_WATCHED;
        }
        return rating;
    }
    
    public Map<Film, Rating> getPersonalRatings(Person person) {
        if (!prs.containsKey(person)) {
            prs.put(person, new HashMap<Film, Rating>());
        }
        return prs.get(person);
    }
    
    public List<Person> reviewers() {
        List<Person> ppl = new ArrayList<Person>();
        Iterator<Person> peeps = prs.keySet().iterator();
        while (peeps.hasNext()) {
            ppl.add(peeps.next());
        }
        return ppl;
    }
}
