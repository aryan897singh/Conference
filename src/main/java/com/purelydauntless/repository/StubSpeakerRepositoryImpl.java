package com.purelydauntless.repository;

import com.purelydauntless.model.Speaker;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("speakerRepository")
public class StubSpeakerRepositoryImpl implements SpeakerRepository {

    @Override
    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<>();

        Speaker speaker = new Speaker();

        speaker.setFirstName("Aryan");
        speaker.setLastName("Singh");

        speakers.add(speaker);

        return speakers;
    }

}
