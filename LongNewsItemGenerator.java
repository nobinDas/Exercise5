public class LongNewsItemGenerator extends NewsItemGenerator{

    protected NewsItem createNews(String type, String news){
        NewsItem newsItem = null;
        NewsItemFactory newsFactory = new LongNewsItemFactory();

        if(type.equals("skating")){
            newsItem = new SkatingNews(newsFactory, news);
            newsItem.setName("long figure skating");
        }else if(type.equals("ski")){
            newsItem = new SkiNews(newsFactory, news);
            newsItem.setName("long ski");
        }else if(type.equals("hockey")){
            newsItem = new HockeyNews(newsFactory, news);
            newsItem.setName("long hockey");
        }else if(type.equals("bobsleigh")){
            newsItem = new BobsleighNews(newsFactory, news);
            newsItem.setName("long bobsleigh");
        }
        return newsItem;
    }

}
