public class ShortNewsItemGenerator extends NewsItemGenerator{
    protected NewsItem createNews(String type, String news){
        NewsItem newsItem = null;
        NewsItemFactory newsFactory = new ShortNewsItemFactory();

        if(type.equals("skating")){
            newsItem = new SkatingNews(newsFactory, news);
            newsItem.setName("short figure skating");
        }else if(type.equals("ski")){
            newsItem = new SkiNews(newsFactory, news);
            newsItem.setName("short ski");
        }else if(type.equals("hockey")){
            newsItem = new HockeyNews(newsFactory, news);
            newsItem.setName("short hockey");
        }else if(type.equals("bobsleigh")){
            newsItem = new BobsleighNews(newsFactory, news);
            newsItem.setName("short bobsleigh");
        }
        return newsItem;
    }
}
