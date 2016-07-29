package hello;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "brokers")
public class Broker {

    private String scid;

    private String name;

    private String searchAddress;

    private String droolsAddress;

    private String shieldUser;

    private String clusterName;

    private String searchIndex;

    private Integer searchClientTimeout;

    private Integer searchClientPort;

    private Integer maxSearchResults;

    private List<String> searchFields;

    private Map<String, String> searchKeys;

    public Broker() {
    };

    public String getScid() {
        return scid;
    }

    public void setScid(String scid) {
        this.scid = scid;
    }

    public Broker withScid(final String scid) {
        this.scid = scid;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getSearchAddress() {
        return searchAddress;
    }

    public void setSearchAddress(final String searchAddress) {
        this.searchAddress = searchAddress;
    }

    public Integer getSearchClientTimeout() {
        return searchClientTimeout;
    }

    public void setSearchClientTimeout(Integer searchClientTimeout) {
        this.searchClientTimeout = searchClientTimeout;
    }

    public Integer getSearchClientPort() {
        return searchClientPort;
    }

    public void setSearchClientPort(Integer searchClientPort) {
        this.searchClientPort = searchClientPort;
    }

    public Integer getMaxSearchResults() {
        return maxSearchResults;
    }

    public void setMaxSearchResults(Integer maxSearchResults) {
        this.maxSearchResults = maxSearchResults;
    }

    public String getDroolsAddress() {
        return droolsAddress;
    }

    public void setDroolsAddress(final String droolsAddress) {
        this.droolsAddress = droolsAddress;
    }

    public String getShieldUser() {
        return shieldUser;
    }

    public void setShieldUser(final String shieldUser) {
        this.shieldUser = shieldUser;
    }

    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(final String clusterName) {
        this.clusterName = clusterName;
    }

    public String getSearchIndex() {
        return searchIndex;
    }

    public void setSearchIndex(String searchIndex) {
        this.searchIndex = searchIndex;
    }

    public Broker withSearchIndex(final String six) {
        this.searchIndex = six;
        return this;
    }

    public List<String> getSearchFields() {
        return searchFields;
    }

    public void setSearchFields(final List<String> searchFields) {
        this.searchFields = searchFields;
    }

    public Map<String, String> getSearchKeys() {
        return searchKeys;
    }

    public void setSearchKeys(Map<String, String> searchKeys) {
        this.searchKeys = searchKeys;
    }

    public Broker withSearchKeys(Map<String, String> searchKeys) {
        this.searchKeys = searchKeys;
        return this;
    }

    public static String createWebString(Broker broker) {
        final StringBuilder sb = new StringBuilder(1000);
        sb.append("<BR>");
        sb.append("Scid:");
        sb.append(broker.getScid());
        sb.append("<BR>");
        sb.append("Search Fields:");
        sb.append(broker.getSearchFields());
        return sb.toString();
    }

    @Override
    public String toString() {
        return "Broker [scid=" + scid + ", name=" + name + ", searchAddress=" + searchAddress + ", droolsAddress=" + droolsAddress + ", shieldUser="
                + shieldUser + ", clusterName=" + clusterName + ", searchIndex=" + searchIndex + ", searchClientTimeout=" + searchClientTimeout
                + ", searchClientPort=" + searchClientPort + ", maxSearchResults=" + maxSearchResults + ", searchFields=" + searchFields + ", searchKeys="
                + searchKeys + "]";
    }

}
