
package fr.xebia.tresboncoin;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/** Example resource class hosted at the URI path "/myresource"
 */
@Path("/myresource")
public class MyResource {

    public static final String USER_AGENT = "Mozilla/5.0 (Windows; U; WindowsNT 5.1; en-US; rv1.8.1.6) Gecko/20070725 Firefox/2.0.0.6";
    public static final String REFERRER = "http://www.google.com";

    /** Method processing HTTP GET requests, producing "text/plain" MIME media
     * type.
     * @return String that will be send back as a response of type "text/plain".
     */
    @GET 
    @Produces("application/json")
    @Path("/results")
    public TbcResults getIt(@QueryParam("region") String region) throws IOException {
        Document document = Jsoup.connect(region)
                .userAgent(USER_AGENT)
                .referrer(REFERRER).get();
        Elements titles = document.select(".list-lbc .title");
        List<String> results = new ArrayList<String>();
        for (Element title : titles) {
            results.add(title.text());
        }
        return new TbcResults(results);
    }

    @GET
    @Produces("application/json")
    @Path("/regions")
    public TbcRegions getRegions() throws IOException {
        Document document = Jsoup.connect("http://www.leboncoin.fr")
                .userAgent(USER_AGENT)
                .referrer(REFERRER).get();
        Elements counties = document.select(".CountyList a");
        List<TbcRegion> results = new ArrayList<TbcRegion>();
        for (Element county : counties) {
            results.add(new TbcRegion(county.text(), county.attr("href")));
        }
        return new TbcRegions(results);
    }

}
