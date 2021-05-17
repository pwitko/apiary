package ovh.nowomlyny.apiary.model;

import java.util.ArrayList;

public class Hive {
    private Integer hiveNumber;
    private Mother mother;
    private ArrayList<Inspection> inspectionList = new ArrayList<>();
    private ArrayList<Feeding> feedingList = new ArrayList<>();
    private ArrayList<Notes> notesList = new ArrayList<>();
    private ArrayList<HoneyCollection> honeyCollectionsList = new ArrayList<>();

    public Integer getHiveNumber() {
        return hiveNumber;
    }

    public void setHiveNumber(Integer hiveNumber) {
        this.hiveNumber = hiveNumber;
    }

    public Mother getMother() {
        return mother;
    }

    public void setMother(Mother mother) {
        this.mother = mother;
    }

    public ArrayList<Inspection> getInspectionList() {
        return inspectionList;
    }

    public void setInspectionList(ArrayList<Inspection> inspectionList) {
        this.inspectionList = inspectionList;
    }

    public ArrayList<Feeding> getFeedingList() {
        return feedingList;
    }

    public void setFeedingList(ArrayList<Feeding> feedingList) {
        this.feedingList = feedingList;
    }

    public ArrayList<Notes> getNotesList() {
        return notesList;
    }

    public void setNotesList(ArrayList<Notes> notesList) {
        this.notesList = notesList;
    }

    public ArrayList<HoneyCollection> getHoneyCollectionsList() {
        return honeyCollectionsList;
    }

    public void setHoneyCollectionsList(ArrayList<HoneyCollection> honeyCollectionsList) {
        this.honeyCollectionsList = honeyCollectionsList;
    }
}
