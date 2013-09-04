package fr.xebia.tresboncoin;

import org.fest.assertions.Assertions;
import org.junit.Test;

import java.io.IOException;

import static org.fest.assertions.Assertions.assertThat;

public class MyResourceTest {
    @Test
    public void shouldGet35ResultsFromHome() throws IOException {
        // G
        MyResource resource = new MyResource();
        // W
        TbcResults results = resource.getIt("http://www.leboncoin.fr/annonces/offres/ile_de_france/");
        // T
        assertThat(results.getItems().size()).isEqualTo(35);
    }

    @Test
    public void shouldGetRegions() throws IOException {
        // G
        MyResource resource = new MyResource();
        // W
        TbcRegions regions = resource.getRegions();
        // T
        assertThat(regions.getItems().size()).isEqualTo(26);
        assertThat(regions.getItems()).contains(new TbcRegion("Aquitaine", "http://www.leboncoin.fr/annonces/offres/aquitaine/"));
        assertThat(regions.getItems()).contains(new TbcRegion("Ile-de-France", "http://www.leboncoin.fr/annonces/offres/ile_de_france/"));
    }
}
