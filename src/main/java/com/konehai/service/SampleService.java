package com.konehai.service;

import org.springframework.stereotype.Service;

/**
 * Created by HP on 13-02-2017.
 */
@Service
public class SampleService {
    public String getFromId(int id) {
        return "Your finger has id: " + id;
    }
}
