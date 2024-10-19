package com.csse.api.controller;

import com.csse.api.dto.schedulerequest.ScheduleRequestDTO;
import com.csse.api.dto.schedulerequest.ScheduleResponseDTO;
import com.csse.api.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/schedules")
public class ScheduleController {

    @Autowired
    private ScheduleService service;

    @PostMapping
    public ResponseEntity<ScheduleResponseDTO> create(@RequestBody ScheduleRequestDTO dto) {
        return ResponseEntity.ok(service.create(dto));
    }

    @GetMapping
    public ResponseEntity<List<ScheduleResponseDTO>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ScheduleResponseDTO> getById(@PathVariable long id) {
        return ResponseEntity.ok(service.getById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ScheduleResponseDTO> update(@PathVariable long id, @RequestBody ScheduleRequestDTO dto) {
        return ResponseEntity.ok(service.update(id, dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

}
