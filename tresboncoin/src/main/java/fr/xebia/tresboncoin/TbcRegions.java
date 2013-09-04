package fr.xebia.tresboncoin;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: cp
 * Date: 04/09/13
 * Time: 11:54
 * To change this template use File | Settings | File Templates.
 */
@XmlRootElement
public class TbcRegions {
    private List<TbcRegion> items;

    public TbcRegions() {}

    public TbcRegions(List<TbcRegion> results) {
        this.items = results;
    }

    public List<TbcRegion> getItems() {
        return items;
    }

    public void setItems(List<TbcRegion> regions) {
        this.items = regions;
    }

    @Override
    public String toString() {
        return "TbcRegions{" +
                "items=" + items +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbcRegions that = (TbcRegions) o;

        if (items != null ? !items.equals(that.items) : that.items != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return items != null ? items.hashCode() : 0;
    }
}
