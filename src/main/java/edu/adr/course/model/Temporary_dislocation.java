package edu.adr.course.model;

import java.util.Objects;

/**
 * Created by IntelliJ IDEA.
 * course.Temporary_dislocation
 *
 * @Autor: Andrey
 * @DateTime: 03.03.2021|17:01
 * @Version: Temporary_dislocation: 1.0
 */
public class Temporary_dislocation {
    private String id;
    private String temporaryDislocation;
    private String city;
    private String address;

    public Temporary_dislocation() {
    }

    public Temporary_dislocation(String temporaryDislocation, String city, String address) {
        this.temporaryDislocation = temporaryDislocation;
        this.city = city;
        this.address = address;
    }

    public Temporary_dislocation(String id, String temporaryDislocation, String city, String address) {
        this.id = id;
        this.temporaryDislocation = temporaryDislocation;
        this.city = city;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTemporaryDislocation() {
        return temporaryDislocation;
    }

    public void setTemporaryDislocation(String temporaryDislocation) {
        this.temporaryDislocation = temporaryDislocation;
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
        Temporary_dislocation that = (Temporary_dislocation) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Temporary_dislocation{" +
                "id='" + id + '\'' +
                ", temporaryDislocation='" + temporaryDislocation + '\'' +
                ", city='" + city + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
    