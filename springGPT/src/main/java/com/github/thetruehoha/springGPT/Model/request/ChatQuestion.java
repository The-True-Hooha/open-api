package com.github.thetruehoha.springGPT.Model.request;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
@Getter
@Setter
public class ChatQuestion implements Serializable {
    private String question;
}
