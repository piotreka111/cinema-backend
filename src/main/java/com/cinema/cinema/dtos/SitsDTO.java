package com.cinema.cinema.dtos;

import com.cinema.cinema.model.Sit;
import lombok.Data;
import lombok.AllArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
public class SitsDTO {
    private List<Sit> sits;
}
