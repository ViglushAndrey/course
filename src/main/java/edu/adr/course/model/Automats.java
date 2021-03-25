package edu.adr.course.model;

import java.util.Objects;

/**
 * Created by IntelliJ IDEA.
 * course.Automats
 *
 * @Autor: Andrey
 * @DateTime: 03.03.2021|16:55
 * @Version: Automats: 1.0
 */
public class Automats {
    private String id;
    private String model;
    private String caliber;
    private int numberOfCartridgesInMagazine;

    public Automats() {
    }

    public Automats(String id, String model, String caliber, int numberOfCartridgesInMagazine) {
        this.id = id;
        this.model = model;
        this.caliber = caliber;
        this.numberOfCartridgesInMagazine = numberOfCartridgesInMagazine;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCaliber() {
        return caliber;
    }

    public void setCaliber(String caliber) {
        this.caliber = caliber;
    }

    public int getNumberOfCartridgesInMagazine() {
        return numberOfCartridgesInMagazine;
    }

    public void setNumberOfCartridgesInMagazine(int numberOfCartridgesInMagazine) {
        this.numberOfCartridgesInMagazine = numberOfCartridgesInMagazine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Automats automats = (Automats) o;
        return id.equals(automats.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Automats{" +
                "id='" + id + '\'' +
                ", model='" + model + '\'' +
                ", caliber='" + caliber + '\'' +
                ", numberOfCartridgesInMagazine=" + numberOfCartridgesInMagazine +
                '}';
    }
}
    