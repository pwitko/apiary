package ovh.nowomlyny.apiary.model;

import java.util.Date;

public class Notes {
    private Date noteDate;
    private String currentNote;

    public Date getNoteDate() {
        return noteDate;
    }

    public void setNoteDate(Date noteDate) {
        this.noteDate = noteDate;
    }

    public String getCurrentNote() {
        return currentNote;
    }

    public void setCurrentNote(String currentNote) {
        this.currentNote = currentNote;
    }
}
