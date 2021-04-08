package edu.adr.course.model;

import java.util.Objects;

/**
 * Created by IntelliJ IDEA.
 * course.Viddilenia
 *
 * @Autor: Andrey
 * @DateTime: 03.03.2021|16:52
 * @Version: Viddilenia: 1.0
 */
public class Viddilenia {
    private String id;
    private String name;
    private int osoboviySklad;
    //private Serguants serguants;
    private Ordinarys ordinarys;
    private Obj obj;
    private Permanent_dislocation permanentDislocation;
    private Temporary_dislocation temporaryDislocation;

    public Viddilenia() {
    }

    public Viddilenia(String name, int osoboviySklad, Ordinarys ordinarys, Obj obj, Permanent_dislocation permanentDislocation, Temporary_dislocation temporaryDislocation) {
        this.name = name;
        this.osoboviySklad = osoboviySklad;

        this.ordinarys = ordinarys;
        this.obj = obj;
        this.permanentDislocation = permanentDislocation;
        this.temporaryDislocation = temporaryDislocation;
    }

    public Viddilenia(String id, String name, int osoboviySklad,  Ordinarys ordinarys, Obj obj, Permanent_dislocation permanentDislocation, Temporary_dislocation temporaryDislocation) {
        this.id = id;
        this.name = name;
        this.osoboviySklad = osoboviySklad;

        this.ordinarys = ordinarys;
        this.obj = obj;
        this.permanentDislocation = permanentDislocation;
        this.temporaryDislocation = temporaryDislocation;
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

    public int getOsoboviySklad() {
        return osoboviySklad;
    }

    public void setOsoboviySklad(int osoboviySklad) {
        this.osoboviySklad = osoboviySklad;
    }



    public Ordinarys getOrdinarys() {
        return ordinarys;
    }

    public void setOrdinarys(Ordinarys ordinarys) {
        this.ordinarys = ordinarys;
    }

    public Obj getObj() {
        return obj;
    }

    public void setObj(Obj obj) {
        this.obj = obj;
    }

    public Permanent_dislocation getPermanentDislocation() {
        return permanentDislocation;
    }

    public void setPermanentDislocation(Permanent_dislocation permanentDislocation) {
        this.permanentDislocation = permanentDislocation;
    }

    public Temporary_dislocation getTemporaryDislocation() {
        return temporaryDislocation;
    }

    public void setTemporaryDislocation(Temporary_dislocation temporaryDislocation) {
        this.temporaryDislocation = temporaryDislocation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Viddilenia that = (Viddilenia) o;
        return getId().equals(that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Viddilenia{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", osoboviySklad='" + osoboviySklad + '\'' +
                ", ordinarys=" + ordinarys +
                ", obj=" + obj +
                ", permanentDislocation=" + permanentDislocation +
                ", temporaryDislocation=" + temporaryDislocation +
                '}';
    }
}
    