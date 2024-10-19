package com.csse.api.service;

import com.csse.api.dto.schedulerequest.ScheduleRequestDTO;
import com.csse.api.dto.schedulerequest.ScheduleResponseDTO;
import com.csse.api.model.Schedule;
import com.csse.api.repository.ScheduleRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScheduleService {

    @Autowired
    private ScheduleRepository repository;

    @Autowired
    private ModelMapper modelMapper;

    public ScheduleResponseDTO create(ScheduleRequestDTO dto) {
        Schedule entity = modelMapper.map(dto, Schedule.class);
        return modelMapper.map(repository.save(entity), ScheduleResponseDTO.class);
    }

    public List<ScheduleResponseDTO> getAll() {
        return repository.findAll().stream()
                .map(entity -> modelMapper.map(entity, ScheduleResponseDTO.class))
                .toList();
    }

    public ScheduleResponseDTO getById(long id) {
        return repository.findById(id)
                .map(entity -> modelMapper.map(entity, ScheduleResponseDTO.class))
                .orElse(null);
    }

    public ScheduleResponseDTO update(long id, ScheduleRequestDTO dto) {
        Schedule entity = repository.findById(id).orElseThrow();
        modelMapper.map(dto, entity);
        return modelMapper.map(repository.save(entity), ScheduleResponseDTO.class);
    }

    public void delete(long id) {
        repository.deleteById(id);
    }
}

