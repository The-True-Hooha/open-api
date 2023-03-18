package com.github.thetruehoha.springGPT.Model.response;

import com.github.thetruehoha.springGPT.Model.request.Message;

import java.io.Serializable;

public class Choices implements Serializable {
    private Integer index;
    private Message message;
    private String finish_reason;
}
