package edu.adr.course.model;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 * Created by IntelliJ IDEA.
 * course.Serguants
 *
 * @Autor: Andrey
 * @DateTime: 03.03.2021|16:53
 * @Version: Serguants: 1.0
 */
public class Serguants {
    private String id;
    private String name;
    private LocalDateTime bDay;
    private String speciality;
    private LocalDateTime dateOfAssignmentOfAnOfficerRank;
    private String awards;
    private SerguantsRanks serguantsRanks;

    public Serguants() {
    }

    public Serguants(String id, String name, LocalDateTime bDay, String speciality, LocalDateTime dateOfAssignmentOfAnOfficerRank, String awards) {
        this.id = id;
        this.name = name;
        this.bDay = bDay;
        this.speciality = speciality;
        this.dateOfAssignmentOfAnOfficerRank = dateOfAssignmentOfAnOfficerRank;
        this.awards = awards;
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

    public LocalDateTime getbDay() {
        return bDay;
    }

    public void setbDay(LocalDateTime bDay) {
        this.bDay = bDay;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public LocalDateTime getDateOfAssignmentOfAnOfficerRank() {
        return dateOfAssignmentOfAnOfficerRank;
    }

    public void setDateOfAssignmentOfAnOfficerRank(LocalDateTime dateOfAssignmentOfAnOfficerRank) {
        this.dateOfAssignmentOfAnOfficerRank = dateOfAssignmentOfAnOfficerRank;
    }

    public String getAwards() {
        return awards;
    }

    public void setAwards(String awards) {
        this.awards = awards;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serguants serguants = (Serguants) o;
        return id.equals(serguants.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Serguants{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", bDay=" + bDay +
                ", speciality='" + speciality + '\'' +
                ", dateOfAssignmentOfAnOfficerRank=" + dateOfAssignmentOfAnOfficerRank +
                ", awards='" + awards + '\'' +
                '}';
    }
}
    