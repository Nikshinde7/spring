package com.demoreleations.crud.model;


import javax.persistence.*;

@Entity
@Table(name="instructor_model")
public class InstructorModel {


    @Id
    @GeneratedValue
    @Column(name="instructor_id")
    private Integer instructorId;

    @Column(name="instructor_name")
    private String instructorName;

    @OneToOne(cascade = CascadeType.ALL,fetch =  FetchType.LAZY)
    @JoinColumn(name="did")
    private InstructorDetailModel instructorDetailModel;

    public Integer getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(Integer instructorId) {
        this.instructorId = instructorId;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public InstructorDetailModel getInstructorDetailModel() {
        return instructorDetailModel;
    }

    public void setInstructorDetailModel(InstructorDetailModel instructorDetailModel) {
        this.instructorDetailModel = instructorDetailModel;
    }
}
