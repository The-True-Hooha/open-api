package com.github.thetruehoha.springGPT.Model.request;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

// base class for chatGPT REQUEST DTO
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OpenApiRequest implements Serializable {
    private String model;
    private List<Message> messages;
}
