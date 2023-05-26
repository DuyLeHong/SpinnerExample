package com.duyle.spinnerexample;

public class NhanVienModel {

    private String name;
    private String sId;
    private String sBoPhan;

    public NhanVienModel(String name, String sId, String sBoPhan) {
        this.name = name;
        this.sId = sId;
        this.sBoPhan = sBoPhan;
    }

    public NhanVienModel() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public String getsBoPhan() {
        return sBoPhan;
    }

    public void setsBoPhan(String sBoPhan) {
        this.sBoPhan = sBoPhan;
    }
}
