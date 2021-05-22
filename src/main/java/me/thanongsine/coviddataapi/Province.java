package me.thanongsine.coviddataapi;

import lombok.Data;

@Data
public class Province {
    private String name;
    private int totalCases;
    private int newCases;

    Province(String name, int totalCases, int newCases) {
        this.name = name;
        this.totalCases = totalCases;
        this.newCases = newCases;
    }

}
