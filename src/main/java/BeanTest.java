import java.util.ArrayList;
import java.util.List;

public class BeanTest {
    public static void main(String[] args) {
        Album album1 = new Album("Biscuit", "Gravy", 2023, 100.50, "Delicious");
        System.out.println(album1.getArtist());
        System.out.println(album1.getName());

        Album emptyAlbum = new Album();

        Author author = new Author("Donald", "Twitty");
        Quote quote = new Quote("Get in there!", author);
        Quote quoteTwo = new Quote("Ow-Ah!", author);

        List<Quote> donaldQuotes = new ArrayList<>(List.of(quote, quoteTwo));

        for(Quote donaldQuote: donaldQuotes) {
            System.out.printf("\"%s\"  -%s %s%n", donaldQuote.getContent(), donaldQuote.getAuthor().getFirst_name(), donaldQuote.getAuthor().getLast_name());
        }

        
    }
}
