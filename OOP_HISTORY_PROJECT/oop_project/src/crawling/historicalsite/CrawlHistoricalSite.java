package crawling.historicalsite;

import collection.EntityCollection;
import entity.HistoricalSite;
import collection.HistoricalSiteCollection;
import crawling.Crawler;
import java.io.IOException;
import java.util.List;

public abstract class CrawlHistoricalSite extends Crawler
{
    private EntityCollection<HistoricalSite> historicalSiteCollection = new HistoricalSiteCollection();

    public HistoricalSiteCollection getHistoricalSiteCollection() 
    {
        if (historicalSiteCollection instanceof HistoricalSiteCollection)
        {
            return (HistoricalSiteCollection) historicalSiteCollection;
        }
        return null;
    }

    public void setHistoricalSiteCollection(List<HistoricalSite> historicalSites)
    {
        this.historicalSiteCollection.setData(historicalSites);
    }

    public abstract void crawlHistoricalSite() throws IOException;
}
