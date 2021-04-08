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
    private Grenades grenades;
    private Pistols pistols;
    private SniperRifles sniperRifles;
    private MachinesGuns machinesGuns;
    private Automats automats;
    private MilitaryEquipment militaryEquipment;
    private TransportEquipment transportEquipment;

    public Armament() {
    }

    public Armament (Grenades grenades, Pistols pistols, SniperRifles sniperRifles, MachinesGuns machinesGuns, Automats automats, MilitaryEquipment militaryEquipment, TransportEquipment transportEquipment) {

        this.grenades = grenades;
        this.pistols = pistols;
        this.sniperRifles = sniperRifles;
        this.machinesGuns = machinesGuns;
        this.automats = automats;
        this.militaryEquipment = militaryEquipment;
        this.transportEquipment = transportEquipment;
    }

    public Armament(String id, Grenades grenades, Pistols pistols, SniperRifles sniperRifles, MachinesGuns machinesGuns, Automats automats, MilitaryEquipment militaryEquipment, TransportEquipment transportEquipment) {
        this.id = id;

        this.grenades = grenades;
        this.pistols = pistols;
        this.sniperRifles = sniperRifles;
        this.machinesGuns = machinesGuns;
        this.automats = automats;
        this.militaryEquipment = militaryEquipment;
        this.transportEquipment = transportEquipment;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public Grenades getGrenades() {
        return grenades;
    }

    public void setGrenades(Grenades grenades) {
        this.grenades = grenades;
    }

    public Pistols getPistols() {
        return pistols;
    }

    public void setPistols(Pistols pistols) {
        this.pistols = pistols;
    }

    public SniperRifles getSniperRifles() {
        return sniperRifles;
    }

    public void setSniperRifles(SniperRifles sniperRifles) {
        this.sniperRifles = sniperRifles;
    }

    public MachinesGuns getMachinesGuns() {
        return machinesGuns;
    }

    public void setMachinesGuns(MachinesGuns machinesGuns) {
        this.machinesGuns = machinesGuns;
    }

    public Automats getAutomats() {
        return automats;
    }

    public void setAutomats(Automats automats) {
        this.automats = automats;
    }

    public MilitaryEquipment getMilitaryEquipment() {
        return militaryEquipment;
    }

    public void setMilitaryEquipment(MilitaryEquipment militaryEquipment) {
        this.militaryEquipment = militaryEquipment;
    }

    public TransportEquipment getTransportEquipment() {
        return transportEquipment;
    }

    public void setTransportEquipment(TransportEquipment transportEquipment) {
        this.transportEquipment = transportEquipment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Armament armament = (Armament) o;
        return getId().equals(armament.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Armament{" +
                "id='" + id + '\'' +
                ", grenades=" + grenades +
                ", pistols=" + pistols +
                ", sniperRifles=" + sniperRifles +
                ", machinesGuns=" + machinesGuns +
                ", automats=" + automats +
                ", militaryEquipment=" + militaryEquipment +
                ", transportEquipment=" + transportEquipment +
                '}';
    }
}
    