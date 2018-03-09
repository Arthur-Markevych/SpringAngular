package com.union.angular.repositories;

import com.union.angular.models.Contact;
import org.springframework.data.repository.CrudRepository;

public interface ContactRepository extends CrudRepository<Contact, String> {

    @Override
    Contact findOne(String s);

    @Override
    void delete(Contact entity);
}
