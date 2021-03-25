package edu.adr.course.model;

import java.util.Objects;
import java.util.UUID;

/**
 * Created by IntelliJ IDEA.
 * course.Armament
 *
 * @Autor: Andrey
 * @DateTime: 03.03.2021|16:55
 * @Version: Armament: 1.0
 */
public class Armament {

    private String id;
    private String type;
    private int number;
    private Grenades grenades;
    private Pistols pistols;
    private SniperRifles sniperRifles;
    private MachinesGuns machinesGuns;
    private Automats automats;
    private MilitaryEquipment militaryEquipment;
    private TransportEquipment transportEquipment;

    public Armament() {
    }

    public Armament(String id, String type, int number) {
        this.id = id;
        this.type = type;
        this.number = number;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
        Armament armament = (Armament) o;
        return id.equals(armament.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Armament{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                ", number=" + number +
                '}';
    }
}
    