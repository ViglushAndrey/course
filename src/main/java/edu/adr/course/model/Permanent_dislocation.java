package edu.adr.course.model;

import java.util.Objects;

/**
 * Created by IntelliJ IDEA.
 * course.Permanent_dislocation
 *
 * @Autor: Andrey
 * @DateTime: 03.03.2021|17:00
 * @Version: Permanent_dislocation: 1.0
 */
public class Permanent_dislocation {
    private String id;
    private String permanentDislocation;
    private String city;
    private String address;

    public Permanent_dislocation() {
    }

    public Permanent_dislocation(String permanentDislocation, String city, String address) {
        this.permanentDislocation = permanentDislocation;
        this.city = city;
        this.address = address;
    }

    public Permanent_dislocation(String id, String permanentDislocation, String city, String address) {
        this.id = id;
        this.permanentDislocation = permanentDislocation;
        this.city = city;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPermanentDislocation() {
        return permanentDislocation;
    }

    public void setPermanentDislocation(String permanentDislocation) {
        this.permanentDislocation = permanentDislocation;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Permanent_dislocation that = (Permanent_dislocation) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Permanent_dislocation{" +
                "id='" + id + '\'' +
                ", permanentDislocation='" + permanentDislocation + '\'' +
                ", city='" + city + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
    