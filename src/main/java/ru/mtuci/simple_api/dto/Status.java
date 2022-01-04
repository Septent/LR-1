package ru.mtuci.simple_api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Objects;

@Data
@AllArgsConstructor
public class Status {
    private String hostName;
}
