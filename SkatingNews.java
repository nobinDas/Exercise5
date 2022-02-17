public class SkatingNews extends NewsItem{
    NewsItemFactory newsFactory;
    String news;

    public SkatingNews(NewsItemFactory newsFactory, String news){
        this.newsFactory = newsFactory;
        this.news = news;
    }

    void prepareNews() {
        System.out.println("Preparing figure skating news");
        System.out.println("Editing this news item");
        System.out.println("Finalizing this new item");
        tg = newsFactory.createTitle(news);
        fg = newsFactory.createFederation(news);
        sg = newsFactory.createSummary(news);
    }
}
