package edu.adr.course.model;

import java.util.Objects;

/**
 * Created by IntelliJ IDEA.
 * course.TransportEquipment
 *
 * @Autor: Andrey
 * @DateTime: 03.03.2021|17:01
 * @Version: TransportEquipment: 1.0
 */
public class TransportEquipment {
    private String id;
    private FreightCar freightCar;
    private int numberOfFreightCar;
    private Tractor tractor;
    private int numberOfTractor;
    private int totalTransportEquipment;

    public TransportEquipment() {
    }

    public TransportEquipment(FreightCar freightCar, int numberOfFreightCar, Tractor tractor, int numberOfTractor, int totalTransportEquipment) {
        this.freightCar = freightCar;
        this.numberOfFreightCar = numberOfFreightCar;
        this.tractor = tractor;
        this.numberOfTractor = numberOfTractor;
        this.totalTransportEquipment = totalTransportEquipment;
    }

    public TransportEquipment(String id, FreightCar freightCar, int numberOfFreightCar, Tractor tractor, int numberOfTractor, int totalTransportEquipment) {
        this.id = id;
        this.freightCar = freightCar;
        this.numberOfFreightCar = numberOfFreightCar;
        this.tractor = tractor;
        this.numberOfTractor = numberOfTractor;
        this.totalTransportEquipment = totalTransportEquipment;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public FreightCar getFreightCar() {
        return freightCar;
    }

    public void setFreightCar(FreightCar freightCar) {
        this.freightCar = freightCar;
    }

    public int getNumberOfFreightCar() {
        return numberOfFreightCar;
    }

    public void setNumberOfFreightCar(int numberOfFreightCar) {
        this.numberOfFreightCar = numberOfFreightCar;
    }

    public Tractor getTractor() {
        return tractor;
    }

    public void setTractor(Tractor tractor) {
        this.tractor = tractor;
    }

    public int getNumberOfTractor() {
        return numberOfTractor;
    }

    public void setNumberOfTractor(int numberOfTractor) {
        this.numberOfTractor = numberOfTractor;
    }

    public int getTotalTransportEquipment() {
        return totalTransportEquipment;
    }

    public void setTotalTransportEquipment(int totalTransportEquipment) {
        this.totalTransportEquipment = totalTransportEquipment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TransportEquipment that = (TransportEquipment) o;
        return getId().equals(that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "TransportEquipment{" +
                "id='" + id + '\'' +
                ", freightCar=" + freightCar +
                ", numberOfFreightCar=" + numberOfFreightCar +
                ", tractor=" + tractor +
                ", numberOfTractor=" + numberOfTractor +
                ", totalTransportEquipment=" + totalTransportEquipment +
                '}';
    }
}
    