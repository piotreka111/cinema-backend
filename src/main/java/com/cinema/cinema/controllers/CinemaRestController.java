package com.cinema.cinema.controllers;

import com.cinema.cinema.dtos.SitsDTO;
import com.cinema.cinema.dtos.UpdateSitsDTO;
import com.cinema.cinema.model.SitCache;
import com.cinema.cinema.services.CinemaService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("cinema")
public class CinemaRestController {
    private final CinemaService cinemaService;

    public CinemaRestController(CinemaService cinemaService) {
        this.cinemaService = cinemaService;
    }

    @GetMapping
    public SitsDTO getSits(){
        return new SitsDTO(SitCache.getSits());
    }

    @PutMapping
    public void updateSits(@RequestBody UpdateSitsDTO sitsDTO){
        cinemaService.updateSits(sitsDTO);
    }
}
