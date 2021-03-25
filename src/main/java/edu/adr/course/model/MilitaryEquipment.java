package edu.adr.course.model;

import java.util.Objects;

/**
 * Created by IntelliJ IDEA.
 * course.MilitaryEquipment
 *
 * @Autor: Andrey
 * @DateTime: 03.03.2021|16:57
 * @Version: MilitaryEquipment: 1.0
 */
public class MilitaryEquipment {
    private String id;
    private String types;
    private int number;
    private Tanks tanks;
    private BMP bmp;
    private BTR btr;

    public MilitaryEquipment() {
    }

    public MilitaryEquipment(String id, String types, int number) {
        this.id = id;
        this.types = types;
        this.number = number;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MilitaryEquipment that = (MilitaryEquipment) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "MilitaryEquipment{" +
                "id='" + id + '\'' +
                ", types='" + types + '\'' +
                ", number=" + number +
                '}';
    }
}
    