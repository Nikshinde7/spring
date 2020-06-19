package com.demoreleations.crud.model;


import javax.persistence.*;

@Entity
@Table(name="instructor_detail")
public class InstructorDetailModel {


    @Id
    @GeneratedValue
    @Column(name="id")
    private Integer did;

    public Integer getdid() {
        return did;
    }

    public void setdid(Integer did) {
        this.did = did;
    }

    @Column(name="instructor_yt")

    private String instructorYt;


    public String getInstructorYt() {
        return instructorYt;
    }

    public void setInstructorYt(String instructorYt) {
        this.instructorYt = instructorYt;
    }
}
