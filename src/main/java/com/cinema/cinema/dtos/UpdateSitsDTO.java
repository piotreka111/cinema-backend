package com.cinema.cinema.dtos;

import com.cinema.cinema.model.Sit;
import lombok.Data;

import java.util.List;

@Data
public class UpdateSitsDTO {
    private List<Sit> sits;
}
