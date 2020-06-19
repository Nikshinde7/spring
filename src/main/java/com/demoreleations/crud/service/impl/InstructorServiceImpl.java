package com.demoreleations.crud.service.impl;

import com.demoreleations.crud.dao.InstructorDao;
import com.demoreleations.crud.dto.InstructorDto;
import com.demoreleations.crud.model.InstructorDetailModel;
import com.demoreleations.crud.model.InstructorModel;
import com.demoreleations.crud.service.InstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstructorServiceImpl implements InstructorService {

    @Autowired
    private InstructorDao instructorDao;


    @Override
    public boolean insertController(InstructorDto instructorDto) {


        InstructorModel instructorModel = new InstructorModel();


        instructorModel.setInstructorName(instructorDto.getInstructorName());

        InstructorDetailModel instructorDetailModel = new InstructorDetailModel();


        instructorDetailModel.setInstructorYt(instructorDto.getInstructorYt());


        instructorModel.setInstructorDetailModel(instructorDetailModel);

        boolean flag = instructorDao.insertDao(instructorModel);

        return flag;
    }

    @Override
    public Boolean deleteService(InstructorDto instructorDto) {

        InstructorModel instructorModel = new InstructorModel();

        instructorModel.setInstructorId(instructorDto.getInstructorId());


        boolean flag = instructorDao.deleteDao(instructorModel);

        return flag;

    }

    @Override
    public Boolean updateService(InstructorDto instructorDto) {

        InstructorModel instructorModel = new InstructorModel();

        instructorModel.setInstructorId(instructorDto.getInstructorId());
        instructorModel.setInstructorName(instructorDto.getInstructorName());

        InstructorDetailModel instructorDetailModel = new InstructorDetailModel();


        instructorDetailModel.setInstructorYt(instructorDto.getInstructorYt());
        instructorDetailModel.setdid(instructorModel.getInstructorId());

        instructorModel.setInstructorDetailModel(instructorDetailModel);


        boolean flag = instructorDao.updateDao(instructorModel);
        return flag;
    }

    @Override
    public List<InstructorModel> getService(Integer instructorId) {

        List<InstructorModel> list1 = instructorDao.getDao(instructorId);

        return list1;


    }


}
