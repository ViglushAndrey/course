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
    private int osoboviySklad;
    private String type;
    private String armament;
    private String combatWeight;

    public BTR() {
    }

    public BTR(String name, int osoboviySklad, String type, String armament, String combatWeight) {
        this.name = name;
        this.osoboviySklad = osoboviySklad;
        this.type = type;
        this.armament = armament;
        this.combatWeight = combatWeight;
    }

    public BTR(String id, String name, int osoboviySklad, String type, String armament, String combatWeight) {
        this.id = id;
        this.name = name;
        this.osoboviySklad = osoboviySklad;
        this.type = type;
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
        BTR btr = (BTR) o;
        return getId().equals(btr.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "BTR{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", osoboviySklad=" + osoboviySklad +
                ", type='" + type + '\'' +
                ", armament='" + armament + '\'' +
                ", additionalWeapons='" + combatWeight + '\'' +
                '}';
    }
}
    