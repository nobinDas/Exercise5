public class longTitle implements TitleGenerator{
    String news;

    public longTitle(String news){
        this.news = news;
    }

    public String toString(){
        return "long title generated for " + news;
    }
}
