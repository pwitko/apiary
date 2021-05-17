package ovh.nowomlyny.apiary.model;

import java.util.Date;

public class Inspection {
    private Date inspectionDate;
    private Weather weather;
    private HiveCondition hiveCondition;
    private Double hiveWeight;
    private SwarmCell swarmCell;
    private Notes notes;
    private boolean mother;
    private boolean maggots;
    private boolean eggs;
    private boolean larvae;
    private boolean swarmCells;

    public Date getInspectionDate() {
        return inspectionDate;
    }

    public void setInspectionDate(Date inspectionDate) {
        this.inspectionDate = inspectionDate;
    }

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    public HiveCondition getHiveCondition() {
        return hiveCondition;
    }

    public void setHiveCondition(HiveCondition hiveCondition) {
        this.hiveCondition = hiveCondition;
    }

    public Double getHiveWeight() {
        return hiveWeight;
    }

    public void setHiveWeight(Double hiveWeight) {
        this.hiveWeight = hiveWeight;
    }

    public SwarmCell getSwarmCell() {
        return swarmCell;
    }

    public void setSwarmCell(SwarmCell swarmCell) {
        this.swarmCell = swarmCell;
    }

    public Notes getNotes() {
        return notes;
    }

    public void setNotes(Notes notes) {
        this.notes = notes;
    }

    public boolean isMother() {
        return mother;
    }

    public void setMother(boolean mother) {
        this.mother = mother;
    }

    public boolean isMaggots() {
        return maggots;
    }

    public void setMaggots(boolean maggots) {
        this.maggots = maggots;
    }

    public boolean isEggs() {
        return eggs;
    }

    public void setEggs(boolean eggs) {
        this.eggs = eggs;
    }

    public boolean isLarvae() {
        return larvae;
    }

    public void setLarvae(boolean larvae) {
        this.larvae = larvae;
    }

    public boolean isSwarmCells() {
        return swarmCells;
    }

    public void setSwarmCells(boolean swarmCells) {
        this.swarmCells = swarmCells;
    }
}
