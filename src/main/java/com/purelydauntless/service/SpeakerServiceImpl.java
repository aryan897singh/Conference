package com.purelydauntless.service;


import com.purelydauntless.model.Speaker;
import com.purelydauntless.repository.SpeakerRepository;
import com.purelydauntless.repository.StubSpeakerRepositoryImpl;

import java.util.*;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository = new StubSpeakerRepositoryImpl();

    @Override
    public List<Speaker> findAll(){
        return repository.findAll();
    }



}
