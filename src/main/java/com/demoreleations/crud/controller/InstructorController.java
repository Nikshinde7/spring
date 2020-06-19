package com.demoreleations.crud.controller;


import com.demoreleations.crud.dto.InstructorDto;
import com.demoreleations.crud.dto.ResponseVO;
import com.demoreleations.crud.model.InstructorModel;
import com.demoreleations.crud.service.InstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(value="*")
public class InstructorController {


    @Autowired
    private InstructorService instructorService;

    @RequestMapping(value="insertrecord",method = RequestMethod.POST)
    public ResponseVO insertInstructor(@RequestBody InstructorDto instructorDto){

        ResponseVO responseVO = new ResponseVO();

        boolean flag = instructorService.insertController(instructorDto);

        if(flag){

            responseVO.setStatusCode(String.valueOf(HttpStatus.OK));
            responseVO.setMessage("insert Successfully");
            responseVO.setResult(flag);

        }else{

            responseVO.setStatusCode(String.valueOf(org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR));
            responseVO.setMessage("failed");
            responseVO.setResult(flag);

        }


           return responseVO;
    }

    @RequestMapping(value="deleterecord",method = RequestMethod.DELETE)
    public ResponseVO deleteInstructor(@RequestBody InstructorDto instructorDto){

        ResponseVO responseVO = new ResponseVO();

        Boolean flag = instructorService.deleteService(instructorDto);

        if(flag){

            responseVO.setStatusCode(String.valueOf(HttpStatus.OK));
            responseVO.setMessage("Eurekaa !!!!");
            responseVO.setResult(flag);

        }else{

            responseVO.setStatusCode(String.valueOf(org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR));
            responseVO.setMessage("failed");
            responseVO.setResult(flag);

        }

        return responseVO;
    }

    @RequestMapping(value="updaterecord",method = RequestMethod.POST)
    public ResponseVO updateInstructor(@RequestBody InstructorDto instructorDto){

        ResponseVO responseVO = new ResponseVO();

        Boolean flag= instructorService.updateService(instructorDto);

        if(flag){

            responseVO.setStatusCode(String.valueOf(HttpStatus.OK));
            responseVO.setMessage("Eurekaa !!!!");
            responseVO.setResult(flag);

        }else{

            responseVO.setStatusCode(String.valueOf(org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR));
            responseVO.setMessage("failed");
            responseVO.setResult(flag);

        }

        return responseVO;
    }


    @RequestMapping(value="getrecord/{instructorId}",method = RequestMethod.GET)
    public ResponseVO getInstructor(@PathVariable Integer instructorId){

        ResponseVO responseVO = new ResponseVO();

        List<InstructorModel> list1 = instructorService.getService(instructorId);

        if(list1!=null){

            responseVO.setStatusCode(String.valueOf(HttpStatus.OK));
            responseVO.setMessage("Eurekaa !!!!");
            responseVO.setResult(true);

        }else{

            responseVO.setStatusCode(String.valueOf(HttpStatus.OK));
            responseVO.setMessage("Failed Boi ");
            responseVO.setResult(false);

        }

        return responseVO;
    }
}
