package edu.adr.course.model;

import java.util.Objects;

/**
 * Created by IntelliJ IDEA.
 * course.Grenades
 *
 * @Autor: Andrey
 * @DateTime: 03.03.2021|16:58
 * @Version: Grenades: 1.0
 */
public class Grenades {

    private String id;
    private String model;
    private String type;
    private String theRadiusOfTheScatteringOfFragments;

    public Grenades() {
    }

    public Grenades(String model, String type, String theRadiusOfTheScatteringOfFragments) {
        this.model = model;
        this.type = type;
        this.theRadiusOfTheScatteringOfFragments = theRadiusOfTheScatteringOfFragments;
    }

    public Grenades(String id, String model, String type, String theRadiusOfTheScatteringOfFragments) {
        this.id = id;
        this.model = model;
        this.type = type;
        this.theRadiusOfTheScatteringOfFragments = theRadiusOfTheScatteringOfFragments;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTheRadiusOfTheScatteringOfFragments() {
        return theRadiusOfTheScatteringOfFragments;
    }

    public void setTheRadiusOfTheScatteringOfFragments(String theRadiusOfTheScatteringOfFragments) {
        this.theRadiusOfTheScatteringOfFragments = theRadiusOfTheScatteringOfFragments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Grenades grenades = (Grenades) o;
        return getId().equals(grenades.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Grenades{" +
                "id='" + id + '\'' +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", theRadiusOfTheScatteringOfFragments='" + theRadiusOfTheScatteringOfFragments + '\'' +
                '}';
    }
}
    