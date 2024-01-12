package com.jpg.biliingcents.controller;

import com.jpg.biliingcents.dto.MovementDto;
import com.jpg.biliingcents.service.MovementService;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@OpenAPIDefinition(info = @Info(
        title = "BillingCents",
        description = "Is a open project in progress for your own money management " +
                "where you can add your own card accounts, saving founds, debts, etc."))
@Tag(name = "Movements", description = "Movements API")
@RestController
@RequestMapping("/api/")
public class MovementController {
    @Autowired
    private MovementService movementService;

    @GetMapping("/movements")
    public List<MovementDto> getAllMovements() {
        return movementService.getAllMovements();
    }

    @PostMapping("/movements")
    public ResponseEntity<?> saveMovement(@RequestBody MovementDto movementDto) {
        MovementDto response = movementService.saveMovement(movementDto);
        return ResponseEntity.ok().body(response);
    }

    @GetMapping("/movements/{id}")
    public ResponseEntity<MovementDto> getMovementById(@PathVariable Long id) {
        MovementDto movementDto = movementService.getMovementById(id);
        if (null == movementDto) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok().body(movementDto);
    }

    @DeleteMapping("/movements/{id}")
    public ResponseEntity<?> deleteMovement(@PathVariable Long id) {
        movementService.deleteMovement(id);
        return ResponseEntity.ok().build();
    }
}

