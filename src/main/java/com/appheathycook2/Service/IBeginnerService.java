package com.appheathycook2.Service;

import com.appheathycook2.Entity.Beginner;

import java.util.List;

public interface IBeginnerService extends CrudService<Beginner> {
    public Beginner findByDni(String dni) throws Exception;
    public List<Beginner> findByLastName(String lastname)throws Exception;
    public List<Beginner> findByFirstName(String firstname)throws Exception;
    public List<Beginner> findByFirstNameAndLastName(String firstname, String lastname)throws Exception;

}
