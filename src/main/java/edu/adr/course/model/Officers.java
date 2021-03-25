package edu.adr.course.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 * Created by IntelliJ IDEA.
 * course.Officars
 *
 * @Autor: Andrey
 * @DateTime: 03.03.2021|16:53
 * @Version: Officars: 1.0
 */
public class Officers {
    private String id;
    private String name;
    private LocalDate bDay;
    private String speciality;
    private LocalDate dateOfAssignmentOfAnOfficerRank;
    private String awards;
    private OfficersRanks officersRanks;


    public Officers() {
    }

    public Officers(String id, String name, LocalDate bDay, String speciality, LocalDate dateOfAssignmentOfAnOfficerRank, String awards, OfficersRanks officersRanks) {
        this.id = id;
        this.name = name;
        this.bDay = bDay;
        this.speciality = speciality;
        this.dateOfAssignmentOfAnOfficerRank = dateOfAssignmentOfAnOfficerRank;
        this.awards = awards;
        this.officersRanks = officersRanks;
    }

    public Officers(String name, LocalDate bDay, String speciality, LocalDate dateOfAssignmentOfAnOfficerRank, String awards, OfficersRanks officersRanks) {
        this.name = name;
        this.bDay = bDay;
        this.speciality = speciality;
        this.dateOfAssignmentOfAnOfficerRank = dateOfAssignmentOfAnOfficerRank;
        this.awards = awards;
        this.officersRanks = officersRanks;
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

    public LocalDate getbDay() {
        return bDay;
    }

    public void setbDay(LocalDate bDay) {
        this.bDay = bDay;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public LocalDate getDateOfAssignmentOfAnOfficerRank() {
        return dateOfAssignmentOfAnOfficerRank;
    }

    public void setDateOfAssignmentOfAnOfficerRank(LocalDate dateOfAssignmentOfAnOfficerRank) {
        this.dateOfAssignmentOfAnOfficerRank = dateOfAssignmentOfAnOfficerRank;
    }

    public String getAwards() {
        return awards;
    }

    public void setAwards(String awards) {
        this.awards = awards;
    }

    public OfficersRanks getOfficersRanks() {
        return officersRanks;
    }

    public void setOfficersRanks(OfficersRanks officersRanks) {
        this.officersRanks = officersRanks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Officers officers = (Officers) o;
        return id.equals(officers.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Officers{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", bDay=" + bDay +
                ", speciality='" + speciality + '\'' +
                ", dateOfAssignmentOfAnOfficerRank=" + dateOfAssignmentOfAnOfficerRank +
                ", awards='" + awards + '\'' +
                ", officersRanks=" + officersRanks +
                '}';
    }
}
    