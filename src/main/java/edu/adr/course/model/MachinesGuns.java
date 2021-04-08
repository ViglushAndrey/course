package edu.adr.course.model;

import java.util.Objects;

/**
 * Created by IntelliJ IDEA.
 * course.MachinesGuns
 *
 * @Autor: Andrey
 * @DateTime: 03.03.2021|16:57
 * @Version: MachinesGuns: 1.0
 */
public class MachinesGuns {
    private String id;
    private String model;
    private String caliber;
    private int numberOfCartridgesInMagazine;

    public MachinesGuns() {
    }

    public MachinesGuns(String model, String caliber, int numberOfCartridgesInMagazine) {
        this.model = model;
        this.caliber = caliber;
        this.numberOfCartridgesInMagazine = numberOfCartridgesInMagazine;
    }

    public MachinesGuns(String id, String model, String caliber, int numberOfCartridgesInMagazine) {
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
        MachinesGuns that = (MachinesGuns) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "MachinesGuns{" +
                "id='" + id + '\'' +
                ", model='" + model + '\'' +
                ", calibr='" + caliber + '\'' +
                ", numberOfCartridgesInMagazine=" + numberOfCartridgesInMagazine +
                '}';
    }
}
    