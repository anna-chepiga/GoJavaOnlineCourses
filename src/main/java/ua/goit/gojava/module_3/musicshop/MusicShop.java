package ua.goit.gojava.module_3.musicshop;

import java.util.List;

public class MusicShop {
    private List<Instrument> instruments;
    private String location = "Kharkiv";
    private int employeeNumber = 5;

    public List<Instrument> getInstruments() { return instruments;  }

    public void setInstruments(List<Instrument> instruments) {
        this.instruments = instruments;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }
}
