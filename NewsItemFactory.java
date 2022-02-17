public interface NewsItemFactory {
    public TitleGenerator createTitle(String news);
    public FederationGenerator createFederation(String news);
    public SummaryGenerator createSummary(String news);
}
