public abstract class NewsItemGenerator {

    protected abstract NewsItem createNews(String type, String news);

    public NewsItem publish(String type, String news){
        NewsItem newsItem = createNews(type, news);
        System.out.println("--- Preparing a " + newsItem.getName()+" news item ---");
        newsItem.prepareNews();
        return newsItem;
    }

}
