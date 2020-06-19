package com.demoreleations.crud.dao;

import com.demoreleations.crud.model.InstructorModel;

import java.util.List;

public interface InstructorDao {
    boolean insertDao(InstructorModel instructorModel);

    Boolean deleteDao(InstructorModel instructorModel);

    boolean updateDao(InstructorModel instructorModel);

    List<InstructorModel> getDao(Integer instructorId);
}
