package ovh.nowomlyny.apiary.model;

import java.util.ArrayList;

public class Apiary {
    private ArrayList<Hive> hivesList = new ArrayList<>();

    public ArrayList<Hive> getHivesList() {
        return hivesList;
    }

    public void setHivesList(ArrayList<Hive> hivesList) {
        this.hivesList = hivesList;
    }

    public void addHiveToList(Hive hive){
        hivesList.add(hive);
    }

    public void removeHiveFromList(Hive hive){
        hivesList.remove(hive);
    }
}
