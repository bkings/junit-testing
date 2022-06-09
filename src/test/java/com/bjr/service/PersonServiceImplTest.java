package com.bjr.service;

import com.bjr.repo.PersonRepo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author bkings
 * @version 1.0.0
 * @since 2022-06-09 22:06
 */
@ExtendWith(MockitoExtension.class)
class PersonServiceImplTest {

    @Mock
    private PersonRepo personRepo;

    @InjectMocks
    private PersonServiceImpl personService;

    @Test
    void delete() {
        personService.delete();
    }
}