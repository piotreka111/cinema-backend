package com.cinema.cinema.services;

import com.cinema.cinema.model.Sit;
import com.cinema.cinema.model.SitCache;
import com.cinema.cinema.model.SitStatus;
import com.cinema.cinema.dtos.UpdateSitsDTO;
import org.springframework.stereotype.Service;

@Service
public class CinemaService {
    public void updateSits(UpdateSitsDTO updateSitsDTO) {
        if (updateSitsDTO.getSits().isEmpty()) {
            return;
        }
        for (Sit sit : updateSitsDTO.getSits()) {
            if (sit.getSitStatus().equals(SitStatus.SELECTED)) {
                SitCache.updateSit(sit.getId(), SitStatus.TAKEN);
            }
        }
    }
}
