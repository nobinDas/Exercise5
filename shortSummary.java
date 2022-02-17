public class shortSummary implements SummaryGenerator{
    String news;

    public shortSummary(String news){
        this.news = news;
    }

    public String toString(){
        return "short summary generated for " + news;
    }
}
