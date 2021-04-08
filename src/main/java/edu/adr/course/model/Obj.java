package edu.adr.course.model;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * course.Objects
 *
 * @Autor: Andrey
 * @DateTime: 03.03.2021|16:57
 * @Version: Objects: 1.0
 */
public class Obj {
    private String id;
    private List<String> typesOfBuildings;


    public Obj() {
    }

    public Obj(String id, List<String> typesOfBuildings) {
        this.id = id;
        this.typesOfBuildings = typesOfBuildings;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getTypesOfBuildings() {
        return typesOfBuildings;
    }

    public void setTypesOfBuildings(List<String> typesOfBuildings) {
        this.typesOfBuildings = typesOfBuildings;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Obj obj = (Obj) o;
        return id.equals(obj.id);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Objects{" +
                "id='" + id + '\'' +
                ", vudObject='" + typesOfBuildings + '\'' +
                '}';
    }
}
    