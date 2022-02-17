public class abbreviation implements FederationGenerator{
    String news;

    public abbreviation(String news){
        this.news = news;
    }

    public String toString(){
        return "federation abbreviation generated for " + news;
    }
}
