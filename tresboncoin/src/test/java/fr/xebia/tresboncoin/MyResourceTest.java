package fr.xebia.tresboncoin;

import org.fest.assertions.Assertions;
import org.junit.Test;

import java.io.IOException;

public class MyResourceTest {
    @Test
    public void shouldGet35ResultsFromHome() throws IOException {
        // G
        MyResource resource = new MyResource();
        // W
        TbcResults results = resource.getIt("ile_de_france");
        // T
        Assertions.assertThat(results.getItems().size()).isEqualTo(35);
    }
}
