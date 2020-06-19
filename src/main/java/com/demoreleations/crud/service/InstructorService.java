package com.demoreleations.crud.service;

import com.demoreleations.crud.dto.InstructorDto;
import com.demoreleations.crud.model.InstructorModel;

import java.util.List;

public interface InstructorService {
    boolean insertController(InstructorDto instructorDto);

    Boolean deleteService(InstructorDto instructorDto);

    Boolean updateService(InstructorDto instructorDto);

    List<InstructorModel> getService(Integer instructorId);
}
