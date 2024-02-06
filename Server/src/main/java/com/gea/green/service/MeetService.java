package com.gea.green.service;

import com.gea.green.model.Meet;
import com.gea.green.repository.MeetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class MeetService {

    private final MeetRepository meetRepository;

    @Autowired
    public MeetService(MeetRepository meetRepository) {
        this.meetRepository = meetRepository;
    }

    public Meet saveMeet(Meet meet) {
        return meetRepository.save(meet);
    }

    public List<Meet> getAllMeets() {
        return meetRepository.findAll();
    }

    public Optional<Meet> getMeetById(Long id) {
        return meetRepository.findById(id);
    }

    public void deleteMeet(Long id) {
        meetRepository.deleteById(id);
    }
}
