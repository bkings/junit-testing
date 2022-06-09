package com.bjr.service;

import com.bjr.repo.PersonRepo;

/**
 * @author bkings
 * @version 1.0.0
 * @since 2022-06-09 22:03
 */

public class PersonServiceImpl implements PersonService {

    private final PersonRepo personRepo;

    public PersonServiceImpl(PersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    @Override
    public void delete() {
        personRepo.delete();
    }
}
