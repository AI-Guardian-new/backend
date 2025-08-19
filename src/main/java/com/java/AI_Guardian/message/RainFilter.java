package com.java.AI_Guardian.message;

import org.springframework.stereotype.Component;

@Component
public class RainFilter {

//🌧️🌨️🌩️⛈️

    public String filter(String message) {
        if (message.contains("호우")) {
            return "\uD83C\uDF27";
        }

        if (message.contains("폭우")) {
            return "\uD83C\uDF27";
        }

        if (message.contains("강우")) {
            return "\uD83C\uDF27";
        }

        if (message.contains("침수")) {
            return "\uD83C\uDF27";
        }
        return "";
    }
}
