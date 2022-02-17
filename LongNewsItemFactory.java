public class LongNewsItemFactory implements NewsItemFactory{
    public TitleGenerator createTitle(String news) {
        return new longTitle(news);
    }

    public FederationGenerator createFederation(String news) {
        return new longFederation(news);
    }

    public SummaryGenerator createSummary(String news) {
        return new longSummary(news);
    }
}
