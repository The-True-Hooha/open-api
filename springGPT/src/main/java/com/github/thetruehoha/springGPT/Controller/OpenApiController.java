package com.github.thetruehoha.springGPT.Controller;

import com.github.thetruehoha.springGPT.Model.request.ChatQuestion;
import com.github.thetruehoha.springGPT.Model.request.ChatRequest;
import com.github.thetruehoha.springGPT.Model.response.OpenApiResponse;
import com.github.thetruehoha.springGPT.Service.OpenApiService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/")
public class OpenApiController {

    @Autowired
    private final OpenApiService openApiService;

    @PostMapping(value = "/chat", consumes = MediaType.APPLICATION_JSON_VALUE)
    public OpenApiResponse chat(@RequestBody ChatQuestion chatQuestion){
        return openApiService.openApiResponse(chatQuestion);
    }

}
