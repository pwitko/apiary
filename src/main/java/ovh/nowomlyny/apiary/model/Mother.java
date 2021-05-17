package ovh.nowomlyny.apiary.model;

import java.util.Date;

public class Mother {
    private MotherMark motherMark;
    private Date insertDate;

    public MotherMark getMotherMark() {
        return motherMark;
    }

    public void setMotherMark(MotherMark motherMark) {
        this.motherMark = motherMark;
    }

    public Date getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(Date insertDate) {
        this.insertDate = insertDate;
    }
}
