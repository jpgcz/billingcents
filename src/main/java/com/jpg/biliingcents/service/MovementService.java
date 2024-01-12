package com.jpg.biliingcents.service;

import com.jpg.biliingcents.dto.MovementDto;
import com.jpg.biliingcents.model.Movement;
import com.jpg.biliingcents.repository.MovementRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovementService {
    @Autowired
    private MovementRepository movementRepository;

    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private AccountService accountService;

    public List<MovementDto> getAllMovements () {
        return movementRepository.findAll()
                .stream()
                .map(movement -> modelMapper.map(movement, MovementDto.class))
                .toList();
    }

    public MovementDto saveMovement (MovementDto movementDto) {
        Movement movement = modelMapper.map(movementDto, Movement.class);
        /*if (movement.getMovType().equals(MovementType.INCOME)) {

        } else {

        }*/
        return modelMapper.map(movementRepository.save(movement), MovementDto.class);
    }

    public MovementDto getMovementById (Long id) {
        return movementRepository.findById(id)
                .map(movement -> modelMapper.map(movement, MovementDto.class))
                .orElse(null);
    }

    public void deleteMovement (Long id) {
        movementRepository.deleteById(id);
    }
}
