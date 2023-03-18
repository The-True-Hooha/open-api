package com.github.thetruehoha.springGPT.Model.request;


import lombok.*;

import java.io.Serializable;
import java.util.List;

// base class for chatGPT REQUEST DTO
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ChatRequest implements Serializable {
    private String model;
    private List<Message> messages;
}
