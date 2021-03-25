package edu.adr.course.model;

/**
 * Created by IntelliJ IDEA.
 * course.Objects
 *
 * @Autor: Andrey
 * @DateTime: 03.03.2021|16:57
 * @Version: Objects: 1.0
 */
public class Objects {
    private String id;
    private String vudObject;
    private float areaObject;

    public Objects() {
    }

    public Objects(String id, String vudObject, float areaObject) {
        this.id = id;
        this.vudObject = vudObject;
        this.areaObject = areaObject;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVudObject() {
        return vudObject;
    }

    public void setVudObject(String vudObject) {
        this.vudObject = vudObject;
    }

    public float getAreaObject() {
        return areaObject;
    }

    public void setAreaObject(float areaObject) {
        this.areaObject = areaObject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Objects objects = (Objects) o;
        return id.equals(objects.id);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Objects{" +
                "id='" + id + '\'' +
                ", vudObject='" + vudObject + '\'' +
                ", areaObject=" + areaObject +
                '}';
    }
}
    