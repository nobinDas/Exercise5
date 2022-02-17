public class shortTitle implements TitleGenerator{
    String news;

    public shortTitle(String news){
        this.news = news;
    }

    public String toString(){
        return "short title generated for " + news;
    }
}
