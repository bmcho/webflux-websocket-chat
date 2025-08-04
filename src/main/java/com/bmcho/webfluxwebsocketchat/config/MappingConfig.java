package com.bmcho.webfluxwebsocketchat.config;

import com.bmcho.webfluxwebsocketchat.handler.ChatWebSocketHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.handler.SimpleUrlHandlerMapping;
import org.springframework.web.reactive.socket.WebSocketHandler;

import java.util.Map;

@Configuration
public class MappingConfig {

    @Bean
    SimpleUrlHandlerMapping simpleUrlHandlerMapping(ChatWebSocketHandler chatWebSocketHandler) {
        Map<String, WebSocketHandler> urlMap = Map.of("/chat", chatWebSocketHandler);

        SimpleUrlHandlerMapping mapping = new SimpleUrlHandlerMapping();
        mapping.setOrder(1);
        mapping.setUrlMap(urlMap);

        return mapping;
    }
}
