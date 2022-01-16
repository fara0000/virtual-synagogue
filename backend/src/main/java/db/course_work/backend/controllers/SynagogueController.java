package db.course_work.backend.controllers;

import db.course_work.backend.entities.Synagogue;
import db.course_work.backend.services.SynagogueService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SynagogueController {
    private final SynagogueService synagogueService;

    public SynagogueController(SynagogueService synagogueService) {
        this.synagogueService = synagogueService;
    }

    @GetMapping("/synagogues")
    public List<Synagogue> getAllSynagogues () {
       return this.synagogueService.getAllSynagogues();
    }
}
