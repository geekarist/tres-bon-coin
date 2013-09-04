package fr.xebia.tresboncoin;

/**
 * Created with IntelliJ IDEA.
 * User: cp
 * Date: 04/09/13
 * Time: 11:57
 * To change this template use File | Settings | File Templates.
 */
public class TbcRegion {
    private String url;
    private String name;

    public TbcRegion() {
    }

    public TbcRegion(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "TbcRegion{" +
                "url='" + url + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbcRegion tbcRegion = (TbcRegion) o;

        if (name != null ? !name.equals(tbcRegion.name) : tbcRegion.name != null) return false;
        if (url != null ? !url.equals(tbcRegion.url) : tbcRegion.url != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = url != null ? url.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
