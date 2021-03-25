package edu.adr.course.model;

import java.util.Objects;

/**
 * Created by IntelliJ IDEA.
 * course.Rota
 *
 * @Autor: Andrey
 * @DateTime: 03.03.2021|16:52
 * @Version: Rota: 1.0
 */
public class Rota {
    private String id;
    private String name;
    private String osoboviySklad;
    private Vzvods vzvods;
    private Armament armament;
    private Officers officers;
    private edu.adr.course.model.Objects objects;
    private Permanent_dislocation permanentDislocation;
    private Temporary_dislocation temporaryDislocation;

    public Rota() {
    }

    public Rota(String id, String name, String osoboviySklad) {
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
        Rota rota = (Rota) o;
        return id.equals(rota.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Rota{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", osoboviySklad='" + osoboviySklad + '\'' +
                '}';
    }
}
    