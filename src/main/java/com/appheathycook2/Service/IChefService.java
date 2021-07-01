package com.appheathycook2.Service;

import com.appheathycook2.Entity.Chef;

import java.util.List;

public interface IChefService extends CrudService<Chef> {
    public Chef findByDni(String dni) throws Exception;
    public List<Chef> findByLastName(String lastname)throws Exception;
    public List<Chef> findByFirstName(String firstname)throws Exception;
    public List<Chef> findByFirstNameAndLastName(String firstname, String lastname)throws Exception;

}
