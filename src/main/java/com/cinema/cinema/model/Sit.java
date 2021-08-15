package com.cinema.cinema.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Sit {
    private long id;
    private int row;
    @JsonProperty("status")
    private SitStatus sitStatus;

    public Sit(long id, int row, SitStatus status){
        this.id = id;
        this.row = row;
        this.sitStatus = status;
    }
}
