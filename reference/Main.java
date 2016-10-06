package reference;
import reference.domain.*;
import java.util.*;
import reference.comparator.*;

public class Main {

    public static void main(String[] args) {
        // Test your code here
        /////////////////// test person comparator ////////////////////////////
        /*Person matti = new Person("Matti");
    Person pekka = new Person("Pekka");
    Person mikke = new Person("Mikke");
    Person thomas = new Person("Thomas");

    Map<Person, Integer> peopleIdentities = new HashMap<Person, Integer>();
    peopleIdentities.put(matti, 42);
    peopleIdentities.put(pekka, 134);
    peopleIdentities.put(mikke, 8);
    peopleIdentities.put(thomas, 82);

    List<Person> ppl = Arrays.asList(matti, pekka, mikke, thomas);
    System.out.println("People before sorting: ");
    for (Person p : ppl) {
        System.out.println(p.getName());
    }

    Collections.sort(ppl, new PersonComparator(peopleIdentities));
    System.out.println("People after sorting: " + ppl);
    Iterator<Person> p = ppl.iterator();
    while (p.hasNext()) {
        System.out.println(p.next().getName());
    }
    */
    /* /////////////////////// test film comparator /////////////////////////
    RatingRegister rEG = new RatingRegister();

    Film goneWithTheWind = new Film("Gone with the Wind");
    Film theBridgesOfMadisonCounty = new Film("The Bridges of Madison County");
    Film eraserhead = new Film("Eraserhead");

    Person matti = new Person("Matti");
    Person pekka = new Person("Pekka");
    Person mikke = new Person("Mikke");

    rEG.addRating(matti, goneWithTheWind, Rating.BAD);
    rEG.addRating(matti, theBridgesOfMadisonCounty, Rating.GOOD);
    rEG.addRating(matti, eraserhead, Rating.FINE);

    rEG.addRating(pekka, goneWithTheWind, Rating.FINE);
    rEG.addRating(pekka, theBridgesOfMadisonCounty, Rating.BAD);
    rEG.addRating(pekka, eraserhead, Rating.MEDIOCRE);

    rEG.addRating(mikke, eraserhead, Rating.BAD);

    Map<Film, List<Rating>> filmRatings = rEG.filmRatings();

    List<Film> films = Arrays.asList(goneWithTheWind, theBridgesOfMadisonCounty, eraserhead);
    System.out.println("The films before sorting: " + films);

    Collections.sort(films, new FilmComparator(filmRatings));
    System.out.println("The films after sorting: " + films);
    */
        /////////////////////// test personal film comparator ////////////////////////
    /*    RatingRegister rEG = new RatingRegister();

    Film goneWithTheWind = new Film("Gone with the Wind");
    Film theBridgesOfMadisonCounty = new Film("The Bridges of Madison County");
    Film eraserhead = new Film("Eraserhead");

    Person matti = new Person("Matti");
    Person pekka = new Person("Pekka");
    Person mikke = new Person("Mikke");

    rEG.addRating(matti, goneWithTheWind, Rating.BAD);
    rEG.addRating(matti, theBridgesOfMadisonCounty, Rating.GOOD);
    rEG.addRating(matti, eraserhead, Rating.FINE);

    rEG.addRating(pekka, goneWithTheWind, Rating.FINE);
    rEG.addRating(pekka, theBridgesOfMadisonCounty, Rating.BAD);
    rEG.addRating(pekka, eraserhead, Rating.MEDIOCRE);

    rEG.addRating(mikke, eraserhead, Rating.BAD);

    Map<Film, Rating> pekkasRatings = rEG.getPersonalRatings(pekka);

    List<Film> films = Arrays.asList(goneWithTheWind, theBridgesOfMadisonCounty, eraserhead);
    System.out.println("The films before sorting: " + films);

    Collections.sort(films, new PersonalFilmComparator(pekkasRatings));
    System.out.println("The films after sorting: " + films);
        
        */
        
        /*    //////////////// test neutral recommendation /////////////////////////
        RatingRegister ratings = new RatingRegister();

    Film goneWithTheWind = new Film("Gone with the Wind");
    Film theBridgesOfMadisonCounty = new Film("The Bridges of Madison County");
    Film eraserhead = new Film("Eraserhead");

    Person matti = new Person("Matti");
    Person pekka = new Person("Pekka");
    Person mikke = new Person("Mikke");

    ratings.addRating(matti, goneWithTheWind, Rating.BAD);
    ratings.addRating(matti, theBridgesOfMadisonCounty, Rating.GOOD);
    ratings.addRating(matti, eraserhead, Rating.FINE);

    ratings.addRating(pekka, goneWithTheWind, Rating.FINE);
    ratings.addRating(pekka, theBridgesOfMadisonCounty, Rating.BAD);
    ratings.addRating(pekka, eraserhead, Rating.MEDIOCRE);

    Reference ref = new Reference(ratings);
    Film recommended = ref.recommendFilm(mikke);
    System.out.println("The film recommended to Michael is: " + recommended);
    */
        /////////////////// test recommendation based on taste similarity ////////////////////
    /*    RatingRegister ratings = new RatingRegister();

    Film goneWithTheWind = new Film("Gone with the Wind");
    Film theBridgesOfMadisonCounty = new Film("The Bridges of Madison County");
    Film eraserhead = new Film("Eraserhead");
    Film bluesBrothers = new Film("Blues Brothers");

    Person matti = new Person("Matti");
    Person pekka = new Person("Pekka");
    Person mikke = new Person("Mikael");
    Person thomas = new Person("Thomas");
    Person arto = new Person("Arto");

    ratings.addRating(matti, goneWithTheWind, Rating.BAD);
    ratings.addRating(matti, theBridgesOfMadisonCounty, Rating.GOOD);
    ratings.addRating(matti, eraserhead, Rating.FINE);

    ratings.addRating(pekka, goneWithTheWind, Rating.FINE);
    ratings.addRating(pekka, eraserhead, Rating.BAD);
    ratings.addRating(pekka, bluesBrothers, Rating.MEDIOCRE);

    ratings.addRating(mikke, eraserhead, Rating.BAD);

    ratings.addRating(thomas, bluesBrothers, Rating.GOOD);
    ratings.addRating(thomas, theBridgesOfMadisonCounty, Rating.GOOD);

    Reference ref = new Reference(ratings);
    System.out.println(thomas + " recommendation: " + ref.recommendFilm(thomas));
    System.out.println(mikke + " recommendation: " + ref.recommendFilm(mikke));
    System.out.println(matti + " recommendation: " + ref.recommendFilm(matti));
    System.out.println(arto + " recommendation: " + ref.recommendFilm(arto));
    System.out.println(pekka + " recommendation: " + ref.recommendFilm(pekka));
    */
    RatingRegister reg = new RatingRegister();
Person pek = new Person("Pekka");
Person artie = new Person("Arto");
reg.addRating(pek, new Film("Pulp fiction"), Rating.FINE);
reg.addRating(pek, new Film("Eraserhead"), Rating.GOOD);
reg.addRating(artie, new Film("Eraserhead"), Rating.BAD);
reg.addRating(artie, new Film("Pulp fiction"), Rating.NEUTRAL);
reg.addRating(artie, new Film("Rambo"), Rating.GOOD);
reg.getRating(pek, new Film("Rambo") );
Map<Film,Rating> ratings = reg.getPersonalRatings(new Person("Jukka"));
    }
}
