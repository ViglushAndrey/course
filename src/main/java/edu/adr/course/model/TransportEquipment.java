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
    private int number;
    private FreightCar freightCar;
    private Tractor tractor;

    public TransportEquipment() {
    }

    public TransportEquipment(String id, int number) {
        this.id = id;
        this.number = number;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
        TransportEquipment that = (TransportEquipment) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "TransportEquipment{" +
                "id='" + id + '\'' +
                ", number=" + number +
                '}';
    }
}
    