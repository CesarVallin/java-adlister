import java.util.List;

public class Author {
    /** Instance variables */
    private long id;
    private String first_name;
    private String last_name;
    private List<Quote> quotes;


    /** Constructors */
    public Author() {

    }

    public Author(String first_name, String last_name) {
        this.first_name = first_name;
        this.last_name = last_name;
    }

    public Author (String first_name, String last_name, List<Quote> quotes) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.quotes = quotes;
    }

    public long getId() {
        return id;
    }

//    public void setId(long id) {
//        this.id = id;
//    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public List<Quote> getQuotes() {
        return quotes;
    }

    public void setQuotes(List<Quote> quotes) {
        this.quotes = quotes;
    }

    /** Method to add quotes */
    public void addQuote(Quote quote) {
        this.quotes.add(quote);
    }
}
