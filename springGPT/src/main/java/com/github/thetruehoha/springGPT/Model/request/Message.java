package com.github.thetruehoha.springGPT.Model.request;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Builder
public class Message implements Serializable {
    private String role;
    private String content;
}
