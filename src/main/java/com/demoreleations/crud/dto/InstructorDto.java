package com.demoreleations.crud.dto;

import com.demoreleations.crud.model.InstructorDetailModel;

public class InstructorDto {


    private Integer instructorId;
    private String instructorName;
    private Integer dId;

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

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }


    private String instructorYt;
    private InstructorDetailModel instructorDetailModel;


    public InstructorDetailModel getInstructorDetailModel() {
        return instructorDetailModel;
    }

    public void setInstructorDetailModel(InstructorDetailModel instructorDetailModel) {
        this.instructorDetailModel = instructorDetailModel;
    }

    public String getInstructorYt() {
        return instructorYt;
    }

    public void setInstructorYt(String instructorYt) {
        this.instructorYt = instructorYt;
    }
}
