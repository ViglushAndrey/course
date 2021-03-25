package edu.adr.course.model;

import java.util.Objects;

/**
 * Created by IntelliJ IDEA.
 * course.FreightCar
 *
 * @Autor: Andrey
 * @DateTime: 03.03.2021|16:56
 * @Version: FreightCar: 1.0
 */
public class FreightCar {

    private String id;
    private String name;
    private String bodyType;
    private String weight;
    private String liftingCapacity;
    private int maximumSpeed;

    public FreightCar() {
    }

    public FreightCar(String id, String name, String bodyType, String weight, String liftingCapacity, int maximumSpeed) {
        this.id = id;
        this.name = name;
        this.bodyType = bodyType;
        this.weight = weight;
        this.liftingCapacity = liftingCapacity;
        this.maximumSpeed = maximumSpeed;
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

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getLiftingCapacity() {
        return liftingCapacity;
    }

    public void setLiftingCapacity(String liftingCapacity) {
        this.liftingCapacity = liftingCapacity;
    }

    public int getMaximumSpeed() {
        return maximumSpeed;
    }

    public void setMaximumSpeed(int maximumSpeed) {
        this.maximumSpeed = maximumSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FreightCar that = (FreightCar) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "FreightCar{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", weight='" + weight + '\'' +
                ", liftingCapacity='" + liftingCapacity + '\'' +
                ", maximumSpeed=" + maximumSpeed +
                '}';
    }
}
    