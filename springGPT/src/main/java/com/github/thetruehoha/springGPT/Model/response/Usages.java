package com.github.thetruehoha.springGPT.Model.response;

import java.io.Serializable;

public class Usages implements Serializable {
    private int prompt_tokens;
    private int completion_tokens;
    private int total_tokens;
}
