package pl.rudyy.videoapp;

import java.time.LocalDate;

public class VideoCassette {
    private long id;

    private String title;

    private LocalDate productionYear;

    public VideoCassette() {
    }

    public VideoCassette(long id, String title, LocalDate productionYear) {
        this.id = id;
        this.title = title;
        this.productionYear = productionYear;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(LocalDate productionYear) {
        this.productionYear = productionYear;
    }
}
