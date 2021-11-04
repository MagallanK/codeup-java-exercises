package movies;

public class Movie {
    private String name;
    private String category;

    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public String getMovieName() {
        return name;
    }
    public String getMovieCat(){
        return category;
    }

    public void setMovieName(String movieName) {
        this.name = movieName;
    }

    public void setMovieCat(String movieCategory){
        this.category = movieCategory;
    }
}
