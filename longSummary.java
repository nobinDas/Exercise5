public class longSummary implements SummaryGenerator{
    String news;

    public longSummary(String news){
        this.news = news;
    }

    public String toString(){
        return "long summary generated for " + news;
    }
}
