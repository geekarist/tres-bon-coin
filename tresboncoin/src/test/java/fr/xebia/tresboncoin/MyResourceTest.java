package fr.xebia.tresboncoin;

import org.fest.assertions.Assertions;
import org.junit.Test;
import sun.jvm.hotspot.utilities.Assert;

import java.io.IOException;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: cp
 * Date: 04/09/13
 * Time: 10:51
 * To change this template use File | Settings | File Templates.
 */
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
