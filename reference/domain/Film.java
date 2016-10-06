package reference.domain;

public class Film {
    
    private String name;
    
    public Film(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    @Override
    public String toString() {
        return name;
    }
    
    @Override
    public int hashCode() {
        int hash = 9;
        hash = 69 * hash + (name != null ? name.hashCode() : 0);
        return hash;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj.getClass() != this.getClass()) {
            return false;
        }
        final Film film = (Film) obj;
        if ((this.name == null ? film.name != null : !this.name.equals(film.name))) {
            return false;
        }
        return true;
    }
}
