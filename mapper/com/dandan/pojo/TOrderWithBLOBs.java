package com.dandan.pojo;

public class TOrderWithBLOBs extends TOrder {
    private String note;

    private String employeeNote;

    private String innerLabelNote;

    private String artisanEnvCheckNote;

    private String artisanAcceptanceNote;

    private String artisanAcceptanceJson;

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public String getEmployeeNote() {
        return employeeNote;
    }

    public void setEmployeeNote(String employeeNote) {
        this.employeeNote = employeeNote == null ? null : employeeNote.trim();
    }

    public String getInnerLabelNote() {
        return innerLabelNote;
    }

    public void setInnerLabelNote(String innerLabelNote) {
        this.innerLabelNote = innerLabelNote == null ? null : innerLabelNote.trim();
    }

    public String getArtisanEnvCheckNote() {
        return artisanEnvCheckNote;
    }

    public void setArtisanEnvCheckNote(String artisanEnvCheckNote) {
        this.artisanEnvCheckNote = artisanEnvCheckNote == null ? null : artisanEnvCheckNote.trim();
    }

    public String getArtisanAcceptanceNote() {
        return artisanAcceptanceNote;
    }

    public void setArtisanAcceptanceNote(String artisanAcceptanceNote) {
        this.artisanAcceptanceNote = artisanAcceptanceNote == null ? null : artisanAcceptanceNote.trim();
    }

    public String getArtisanAcceptanceJson() {
        return artisanAcceptanceJson;
    }

    public void setArtisanAcceptanceJson(String artisanAcceptanceJson) {
        this.artisanAcceptanceJson = artisanAcceptanceJson == null ? null : artisanAcceptanceJson.trim();
    }
}