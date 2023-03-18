package com.github.thetruehoha.springGPT.Model.response;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class OpenApiResponse implements Serializable {
    private Long id;
    private String objects;
    private String model;
    private LocalDate timeAndDate;
    private List<Choices> choices;
    private Usages usages;
}
