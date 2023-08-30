public class Album {
    /** instance variables */
    private long id;
    private String artist;
    private String name;
    private int releaseDate;
    private double sales;
    private String genre;

    /** Constructors */
    public Album() {
    }

    public Album(String artist, String name, int releaseDate, double sales, String genre) {
        this.artist = artist;
        this.name = name;
        this.releaseDate = releaseDate;
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

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int release_date) {
        this.releaseDate = release_date;
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
