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
    private int capaciry;
    private String osoboviySklad;
    private String artSystem;
    private String armorPenetrationParameters;
    private String combatWeight;

    public BMP() {
    }

    public BMP(String id, String name, int capaciry, String osoboviySklad, String artSystem, String armorPenetrationParameters, String combatWeight) {
        this.id = id;
        this.name = name;
        this.capaciry = capaciry;
        this.osoboviySklad = osoboviySklad;
        this.artSystem = artSystem;
        this.armorPenetrationParameters = armorPenetrationParameters;
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

    public String getArtSystem() {
        return artSystem;
    }

    public void setArtSystem(String artSystem) {
        this.artSystem = artSystem;
    }

    public String getArmorPenetrationParameters() {
        return armorPenetrationParameters;
    }

    public void setArmorPenetrationParameters(String armorPenetrationParameters) {
        this.armorPenetrationParameters = armorPenetrationParameters;
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
                ", capaciry=" + capaciry +
                ", osoboviySklad='" + osoboviySklad + '\'' +
                ", artSystem='" + artSystem + '\'' +
                ", armorPenetrationParameters='" + armorPenetrationParameters + '\'' +
                ", combatWeight='" + combatWeight + '\'' +
                '}';
    }
}
    