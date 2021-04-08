package edu.adr.course.model;

import java.util.Objects;

/**
 * Created by IntelliJ IDEA.
 * course.BMP
 *
 * @Autor: Andrey
 * @DateTime: 03.03.2021|16:55
 * @Version: BMP: 1.0
 */
public class BMP {
    private String id;
    private String name;
    private int osoboviySklad;
    private String armament;
    private String combatWeight;

    public BMP() {
    }

    public BMP(String name, int osoboviySklad, String armament, String combatWeight) {
        this.name = name;
        this.osoboviySklad = osoboviySklad;
        this.armament = armament;
        this.combatWeight = combatWeight;
    }

    public BMP(String id, String name, int osoboviySklad, String armament, String combatWeight) {
        this.id = id;
        this.name = name;
        this.osoboviySklad = osoboviySklad;
        this.armament = armament;
        this.combatWeight = combatWeight;
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

    public int getOsoboviySklad() {
        return osoboviySklad;
    }

    public void setOsoboviySklad(int osoboviySklad) {
        this.osoboviySklad = osoboviySklad;
    }

    public String getArmament() {
        return armament;
    }

    public void setArmament(String armament) {
        this.armament = armament;
    }

    public String getCombatWeight() {
        return combatWeight;
    }

    public void setCombatWeight(String combatWeight) {
        this.combatWeight = combatWeight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BMP bmp = (BMP) o;
        return id.equals(bmp.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "BMP{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", osoboviySklad='" + osoboviySklad + '\'' +
                ", artSystem='" + armament + '\'' +
                ", combatWeight='" + combatWeight + '\'' +
                '}';
    }
}
    