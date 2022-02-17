public class longFederation implements FederationGenerator{
    String news;

    public longFederation(String news){
        this.news = news;
    }

    public String toString(){
        return "long federation name generated for " + news;
    }
}
