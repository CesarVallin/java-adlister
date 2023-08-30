public class Quote {
    /** Instance variables */
    private long id;
    private String content;
    private long author_id;


    /** Constructors */

    public Quote() {

    }

    public Quote(String content, long author_id) {
        this.content = content;
        this.author_id = author_id;
    }

    /** Getters and Setters */
    public long getId() {
        return id;
    }

//    public void setId(long id) {
//        this.id = id;
//    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(long author_id) {
        this.author_id = author_id;
    }
}
