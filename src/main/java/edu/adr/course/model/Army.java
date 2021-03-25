package edu.adr.course.model;

import java.util.Objects;
import java.util.PrimitiveIterator;

/**
 * Created by IntelliJ IDEA.
 * course.Army
 *
 * @Autor: Andrey
 * @DateTime: 03.03.2021|16:52
 * @Version: Army: 1.0
 */
public class Army {
    private String id;
    private String name;
    private String osoboviySklad;
    private Battalion battalion;
    private Armament armament;
    private Generals generals;
    private Permanent_dislocation permanentDislocation;
    private Temporary_dislocation temporaryDislocation;
    private edu.adr.course.model.Objects objects;

    public Army() {
    }

    public Army(String id, String name, String osoboviySklad) {
        this.id = id;
        this.name = name;
        this.osoboviySklad = osoboviySklad;
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

    public String getOsoboviySklad() {
        return osoboviySklad;
    }

    public void setOsoboviySklad(String osoboviySklad) {
        this.osoboviySklad = osoboviySklad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Army army = (Army) o;
        return id.equals(army.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Army{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", osoboviySklad='" + osoboviySklad + '\'' +
                '}';
    }
}
    