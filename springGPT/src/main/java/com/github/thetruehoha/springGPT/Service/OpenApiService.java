package com.github.thetruehoha.springGPT.Service;

import com.github.thetruehoha.springGPT.Config.ClientRequest;
import com.github.thetruehoha.springGPT.Config.OpenApiConfig;
import com.github.thetruehoha.springGPT.Model.request.ChatQuestion;
import com.github.thetruehoha.springGPT.Model.request.ChatRequest;
import com.github.thetruehoha.springGPT.Model.request.Message;
import com.github.thetruehoha.springGPT.Model.response.OpenApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
@RequiredArgsConstructor
public class OpenApiService {
    @Autowired
    private final ClientRequest clientRequest;
    @Autowired
    private final OpenApiConfig openApiConfig;

    public OpenApiResponse openApiResponse(ChatQuestion chatQuestion){
        Message message = Message.builder()
                .role("user")
                .content(chatQuestion.getQuestion())
                .build();

        ChatRequest chatRequest = ChatRequest.builder()
                .model(openApiConfig.getModel())
                .messages(Collections.singletonList(message))
                .build();
        return clientRequest.response(chatRequest);
    }
}
