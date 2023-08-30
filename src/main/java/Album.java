public class Album {
    /** instance variables */
    private long id;
    private String artist;
    private String name;
    private int release_date;
    private double sales;
    private String genre;

    /** Constructors */
    public Album() {
    }

    public Album(String artist, String name, int release_date, double sales, String genre) {
        this.artist = artist;
        this.name = name;
        this.release_date = release_date;
        this.sales = sales;
        this.genre = genre;
    }

    /** Getters and Setters */

    public long getId() {
        return id;
    }

//    public void setId(int id) {
//        this.id = id;
//    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRelease_date() {
        return release_date;
    }

    public void setRelease_date(int release_date) {
        this.release_date = release_date;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
