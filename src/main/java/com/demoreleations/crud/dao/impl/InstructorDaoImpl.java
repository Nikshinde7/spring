package com.demoreleations.crud.dao.impl;

import com.demoreleations.crud.dao.InstructorDao;
import com.demoreleations.crud.dto.InstructorDto;
import com.demoreleations.crud.model.InstructorModel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class InstructorDaoImpl implements InstructorDao {


    @Autowired
   private SessionFactory sessionFactory;


    @Override
    public boolean insertDao(InstructorModel instructorModel) {
        System.out.println("SDSDSDSCDACXCDSC");
        Session session = null;

        try{

            session = sessionFactory.openSession();
            Transaction tr = session.beginTransaction();

           // System.out.println(instructorModel.getInstructorDetailModel().getId()+"Hello Mf im here ");
            session.save(instructorModel);

            tr.commit();
            return true;

        }catch(Exception e){

            System.out.println(e);
            return false;

        }finally{

            session.close();
        }



    }

    @Override
    public Boolean deleteDao(InstructorModel instructorModel) {

        Session session = null;

        try{

            session = sessionFactory.openSession();
            Transaction tr = session.beginTransaction();

            InstructorModel instructorModel12 = (InstructorModel) session.load(InstructorModel.class,instructorModel.getInstructorId());

            session.delete(instructorModel12);

            tr.commit();
            return true;

        }catch(Exception e){


            System.out.println(e);
            return false;

        }finally{

            session.close();
        }


    }

    @Override
    public boolean updateDao(InstructorModel instructorModel) {

          Session session = null;

          try{

              session = sessionFactory.openSession();
              Transaction tr = session.beginTransaction();

              System.out.println(instructorModel.getInstructorId());
              session.update(instructorModel);
              tr.commit();

              return true;

          }catch(Exception e){

              System.out.println(e);
              return false;
          }finally {

              session.close();
          }

    }

    @Override
    public List<InstructorModel> getDao(Integer instructorId) {

        Session session = null;
        List<InstructorModel> list = null;

        try{

            session = sessionFactory.openSession();
            Transaction tr = session.beginTransaction();

            InstructorModel instructorModel1 = session.load(InstructorModel.class,instructorId);

            System.out.println(instructorModel1.getInstructorName()+"The Name is "+instructorModel1.getInstructorDetailModel().getInstructorYt());

            return list;
        }catch(Exception e){

            System.out.println(e);
            return list;

        }finally{


            session.close();
        }



    }


}
