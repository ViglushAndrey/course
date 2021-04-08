package edu.adr.course.model;

import java.util.ArrayList;
import java.util.List;
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
   // private String types;

    private Tanks tanks;
    private int numberOfTanks;
    private BMP bmp;
    private int numberOfBmp;
    private BTR btr;
    private int numberOfBtr;
    private int totalMilitaryEquipment;

    public MilitaryEquipment() {
    }

    public MilitaryEquipment(Tanks tanks, int numberOfTanks, BMP bmp, int numberOfBmp, BTR btr, int numberOfBtr, int totalMilitaryEquipment) {
        this.tanks = tanks;
        this.numberOfTanks = numberOfTanks;
        this.bmp = bmp;
        this.numberOfBmp = numberOfBmp;
        this.btr = btr;
        this.numberOfBtr = numberOfBtr;
        this.totalMilitaryEquipment = totalMilitaryEquipment;
    }

    public MilitaryEquipment(String id, Tanks tanks, int numberOfTanks, BMP bmp, int numberOfBmp, BTR btr, int numberOfBtr, int totalMilitaryEquipment) {
        this.id = id;
        this.tanks = tanks;
        this.numberOfTanks = numberOfTanks;
        this.bmp = bmp;
        this.numberOfBmp = numberOfBmp;
        this.btr = btr;
        this.numberOfBtr = numberOfBtr;
        this.totalMilitaryEquipment = totalMilitaryEquipment;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Tanks getTanks() {
        return tanks;
    }

    public void setTanks(Tanks tanks) {
        this.tanks = tanks;
    }

    public int getNumberOfTanks() {
        return numberOfTanks;
    }

    public void setNumberOfTanks(int numberOfTanks) {
        this.numberOfTanks = numberOfTanks;
    }

    public BMP getBmp() {
        return bmp;
    }

    public void setBmp(BMP bmp) {
        this.bmp = bmp;
    }

    public int getNumberOfBmp() {
        return numberOfBmp;
    }

    public void setNumberOfBmp(int numberOfBmp) {
        this.numberOfBmp = numberOfBmp;
    }

    public BTR getBtr() {
        return btr;
    }

    public void setBtr(BTR btr) {
        this.btr = btr;
    }

    public int getNumberOfBtr() {
        return numberOfBtr;
    }

    public void setNumberOfBtr(int numberOfBtr) {
        this.numberOfBtr = numberOfBtr;
    }

    public int getTotalMilitaryEquipment() {
        return totalMilitaryEquipment;
    }

    public void setTotalMilitaryEquipment(int totalMilitaryEquipment) {
        this.totalMilitaryEquipment = totalMilitaryEquipment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MilitaryEquipment that = (MilitaryEquipment) o;
        return getId().equals(that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "MilitaryEquipment{" +
                "id='" + id + '\'' +
                ", tanks=" + tanks +
                ", numberOfTanks=" + numberOfTanks +
                ", bmp=" + bmp +
                ", numberOfBmp=" + numberOfBmp +
                ", btr=" + btr +
                ", numberOfBtr=" + numberOfBtr +
                ", totalMilitaryEquipment=" + totalMilitaryEquipment +
                '}';
    }
}
    