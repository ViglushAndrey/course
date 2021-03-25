package edu.adr.course.model;

import java.util.Objects;

/**
 * Created by IntelliJ IDEA.
 * course.Vzvods
 *
 * @Autor: Andrey
 * @DateTime: 03.03.2021|16:52
 * @Version: Vzvods: 1.0
 */
public class Vzvods {
    private String id;
    private String name;
    private String osoboviySklad;
    private Viddilenia viddilenia;
    private Armament armament;
    private Serguants serguants;
    private edu.adr.course.model.Objects objects;
    private Permanent_dislocation permanentDislocation;
    private Temporary_dislocation temporaryDislocation;

    public Vzvods() {
    }

    public Vzvods(String id, String name, String osoboviySklad) {
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
        Vzvods vzvods = (Vzvods) o;
        return id.equals(vzvods.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Vzvods{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", osoboviySklad='" + osoboviySklad + '\'' +
                '}';
    }
}
    