package ovh.nowomlyny.apiary.model;

import java.util.Date;

public class Feeding {
    private Date feedingDate;
    private String syrupVolume;
    private String surupDensity;

    public Date getFeedingDate() {
        return feedingDate;
    }

    public void setFeedingDate(Date feedingDate) {
        this.feedingDate = feedingDate;
    }

    public String getSyrupVolume() {
        return syrupVolume;
    }

    public void setSyrupVolume(String syrupVolume) {
        this.syrupVolume = syrupVolume;
    }

    public String getSurupDensity() {
        return surupDensity;
    }

    public void setSurupDensity(String surupDensity) {
        this.surupDensity = surupDensity;
    }
}
