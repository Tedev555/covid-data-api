package me.thanongsine.coviddataapi;

import lombok.Data;

@Data
public class News {
    private String title;
    private String link;

    News(String title, String link) {
        this.title = title;
        this.link = link;
    }
}
