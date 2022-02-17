

public abstract class NewsItem {
    String name;
    String news;

    TitleGenerator tg;
    FederationGenerator fg;
    SummaryGenerator sg;

    abstract void prepareNews();

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append(name + " news item\n");
        if (tg != null) {
            result.append(tg);
            result.append("\n");
        }
        if (fg != null) {
            result.append(fg);
            result.append("\n");
        }
        if (sg != null) {
            result.append(sg);
            result.append("\n");
        }
        return result.toString();
    }
}

