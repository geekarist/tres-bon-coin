package fr.xebia.tresboncoin;

import sun.jvm.hotspot.opto.Block_List;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
public class TbcResults {
    private List<String> items;

    public TbcResults() {
    }

    public TbcResults(List<String> results) {
        this.items = results;
    }

    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }
}
