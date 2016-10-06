package reference;
import java.util.*;
import reference.domain.*;
import reference.comparator.*;

public class Reference {
    
    private RatingRegister reg;
    
    public Reference(RatingRegister reg) {
        this.reg = reg;
    }
    
    public Film recommendFilm(Person person) {
        
        List<Person> peepsList = reg.reviewers();                    ////list of all reviewers
        
        if (!peepsList.contains(person) || reg.getPersonalRatings(person).isEmpty()) {
            Map<Film, List<Rating>> filmsAndRatings = reg.filmRatings();      //// map of films to all ratings, no ppl
            List<Film> rated = new ArrayList<Film>();
            for (Film film : filmsAndRatings.keySet()) {
                rated.add(film); ///////////////////////////////////// list of all films that have been rated
                } 
            Collections.sort(rated, new FilmComparator(filmsAndRatings));
            return rated.get(0);
        }
        
        Map<Film, Rating> myRatings = reg.getPersonalRatings(person); //// map of my films to my ratings
        
        peepsList.remove(person);
        Map<Person, Integer> compatList = new HashMap<Person, Integer>(); ////// list of other reviewers
        
        for (Person peep : peepsList) {                                      ////////// iterate through each person
            compatList.put(peep, 0);
            Map<Film, Rating> theirRatings = reg.getPersonalRatings(peep);
            for (Film film : myRatings.keySet()) {                             /////// iterate through each of my ratings to compare to their ratings
                if (theirRatings.containsKey(film)) {
                    int compatNumber = compatList.get(peep);
                    compatNumber += theirRatings.get(film).getValue() * myRatings.get(film).getValue();
                    compatList.put(peep, compatNumber);
                }
            }
        }
        Collections.sort(peepsList, new PersonComparator(compatList));            // map of other reviewers to compatability number, sorted
        Person topBanana = peepsList.get(0);                         //////////////// number 1 person for compatability
        Map<Film, Rating> topBananasRatings = reg.getPersonalRatings(topBanana); //no1 peep's ratings
        List<Film> topMovieList = new ArrayList<Film>();                         //// list of his rated movies
        for (Film film : topBananasRatings.keySet()) { // and added
            topMovieList.add(film);
        }
        Collections.sort(topMovieList, new PersonalFilmComparator(topBananasRatings)); //sort top bananas films
        int topMovieIndex = 0;
        while (topMovieIndex < topMovieList.size()) {                                                    //////// finding the best movie not already watched
            Film topMovie = topMovieList.get(topMovieIndex);
            if (myRatings.containsKey(topMovie)) {                     ////// movie is watched
                topMovieIndex ++;
                continue;
            }
            if (topBananasRatings.get(topMovie).getValue() > 1) {    ///// best movie
                return topMovie;
            } else {
                break;
            }
        }

        // cannot be already watched [i.e. rated]
        // if num 1 is 1 or less than 1 return null
        // if num suitable film is found return null
        return null;
    }
}
