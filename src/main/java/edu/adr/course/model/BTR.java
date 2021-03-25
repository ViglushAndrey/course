package edu.adr.course.model;

import java.util.Objects;

/**
 * Created by IntelliJ IDEA.
 * course.BTR
 *
 * @Autor: Andrey
 * @DateTime: 03.03.2021|16:56
 * @Version: BTR: 1.0
 */
public class BTR {
    private String id;
    private String name;
    private int capaciry;
    private String osoboviySklad;
    private String type;
    private String armament;
    private int nubmerOfWheels;

    public BTR() {
    }

    public BTR(String id, String name, int capaciry, String osoboviySklad, String type, String armament, int nubmerOfWheels) {
        this.id = id;
        this.name = name;
        this.capaciry = capaciry;
        this.osoboviySklad = osoboviySklad;
        this.type = type;
        this.armament = armament;
        this.nubmerOfWheels = nubmerOfWheels;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapaciry() {
        return capaciry;
    }

    public void setCapaciry(int capaciry) {
        this.capaciry = capaciry;
    }

    public String getOsoboviySklad() {
        return osoboviySklad;
    }

    public void setOsoboviySklad(String osoboviySklad) {
        this.osoboviySklad = osoboviySklad;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getArmament() {
        return armament;
    }

    public void setArmament(String armament) {
        this.armament = armament;
    }

    public int getNubmerOfWheels() {
        return nubmerOfWheels;
    }

    public void setNubmerOfWheels(int nubmerOfWheels) {
        this.nubmerOfWheels = nubmerOfWheels;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BTR btr = (BTR) o;
        return id.equals(btr.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "BTR{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", capaciry=" + capaciry +
                ", osoboviySklad='" + osoboviySklad + '\'' +
                ", type='" + type + '\'' +
                ", armament='" + armament + '\'' +
                ", nubmerOfWheels=" + nubmerOfWheels +
                '}';
    }
}
    