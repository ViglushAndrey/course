package edu.adr.course.model;

import java.util.Objects;

/**
 * Created by IntelliJ IDEA.
 * course.Tanks
 *
 * @Autor: Andrey
 * @DateTime: 03.03.2021|17:02
 * @Version: Tanks: 1.0
 */
public class Tanks {
    private String id;
    private String name;
    private double combatWeight;
    private String enginePower;
    private String engineType;
    private int caliberOfGun;
    private String gunModel;

    public Tanks() {
    }

    public Tanks(String id, String name, double combatWeight, String enginePower, String engineType, int caliberOfGun, String gunModel) {
        this.id = id;
        this.name = name;
        this.combatWeight = combatWeight;
        this.enginePower = enginePower;
        this.engineType = engineType;
        this.caliberOfGun = caliberOfGun;
        this.gunModel = gunModel;
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

    public double getCombatWeight() {
        return combatWeight;
    }

    public void setCombatWeight(double combatWeight) {
        this.combatWeight = combatWeight;
    }

    public String getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(String enginePower) {
        this.enginePower = enginePower;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public int getCaliberOfGun() {
        return caliberOfGun;
    }

    public void setCaliberOfGun(int caliberOfGun) {
        this.caliberOfGun = caliberOfGun;
    }

    public String getGunModel() {
        return gunModel;
    }

    public void setGunModel(String gunModel) {
        this.gunModel = gunModel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tanks tanks = (Tanks) o;
        return id.equals(tanks.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Tanks{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", combatWeight='" + combatWeight + '\'' +
                ", enginePower='" + enginePower + '\'' +
                ", engineType='" + engineType + '\'' +
                ", caliberOfGun=" + caliberOfGun +
                ", gunModel='" + gunModel + '\'' +
                '}';
    }
}
    