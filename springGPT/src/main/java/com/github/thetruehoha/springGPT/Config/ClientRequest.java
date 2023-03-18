package com.github.thetruehoha.springGPT.Config;

import com.github.thetruehoha.springGPT.Model.request.ChatRequest;
import com.github.thetruehoha.springGPT.Model.response.OpenApiResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(
        name = "openai-service",
        url = "${openai-service.urls.base-url}",
        configuration = OpenApiConfig.class
)
public interface ClientRequest {
    @PostMapping(value = "${openai-service.urls.chat-url}", headers = {"Content-Type=application/json"})
    OpenApiResponse response(@RequestBody ChatRequest chatRequest);

}
