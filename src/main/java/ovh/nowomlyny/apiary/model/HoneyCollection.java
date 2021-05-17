package ovh.nowomlyny.apiary.model;

import java.util.Date;

public class HoneyCollection {
    private Date collectionDate;
    private Double collectionQuantity;

    public Date getCollectionDate() {
        return collectionDate;
    }

    public void setCollectionDate(Date collectionDate) {
        this.collectionDate = collectionDate;
    }

    public Double getCollectionQuantity() {
        return collectionQuantity;
    }

    public void setCollectionQuantity(Double collectionQuantity) {
        this.collectionQuantity = collectionQuantity;
    }
}
