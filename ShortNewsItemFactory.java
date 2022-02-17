public class ShortNewsItemFactory implements NewsItemFactory{

    public TitleGenerator createTitle(String news) {
        return new shortTitle(news);
    }

    public FederationGenerator createFederation(String news) {

        return new abbreviation(news);
    }

    public SummaryGenerator createSummary(String news) {

        return new shortSummary(news);
    }
}
