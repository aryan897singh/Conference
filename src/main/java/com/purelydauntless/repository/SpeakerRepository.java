package com.purelydauntless.repository;

import com.purelydauntless.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();
}
