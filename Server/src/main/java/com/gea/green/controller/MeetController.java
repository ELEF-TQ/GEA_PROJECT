package com.gea.green.controller;

import com.gea.green.model.Meet;
import com.gea.green.service.MeetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/meets")
public class MeetController {

    private final MeetService meetService;

    @Autowired
    public MeetController(MeetService meetService) {
        this.meetService = meetService;
    }

    @GetMapping
    public ResponseEntity<List<Meet>> getAllMeets() {
        List<Meet> meets = meetService.getAllMeets();
        return ResponseEntity.ok(meets);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Meet> getMeetById(@PathVariable Long id) {
        Optional<Meet> meet = meetService.getMeetById(id);
        return meet.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Meet> createMeet(@RequestBody Meet meet) {
        Meet createdMeet = meetService.saveMeet(meet);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdMeet);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMeet(@PathVariable Long id) {
        meetService.deleteMeet(id);
        return ResponseEntity.noContent().build();
    }
}
