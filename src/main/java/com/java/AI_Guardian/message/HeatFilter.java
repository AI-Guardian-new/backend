package com.java.AI_Guardian.message;


import org.springframework.stereotype.Component;

@Component
public class HeatFilter {
//🌞☀️🔆
    public String filter(String message) {
        if (message.contains("폭염")) {
            return "\uD83D\uDD06";
        }

        if (message.contains("폭서")) {
            return "\uD83D\uDD06";
        }

        if (message.contains("더위")) {
            return "\uD83D\uDD06";
        }

        if (message.contains("열대")) {
            return "\uD83D\uDD06";
        }
        return "";
    }

}
