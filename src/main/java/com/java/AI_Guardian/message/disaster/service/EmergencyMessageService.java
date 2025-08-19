package com.java.AI_Guardian.message.disaster.service;

import com.java.AI_Guardian.ApiCaller;
import com.java.AI_Guardian.message.HeatFilter;
import com.java.AI_Guardian.message.RainFilter;
import com.java.AI_Guardian.message.disaster.dto.EmergencyMassageDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class EmergencyMessageService {

    private final ApiCaller apiCaller;
    private final RainFilter rainFilter;
    private final HeatFilter heatFilter;
//🌧️🌨️🌩️⛈️
    public List<EmergencyMassageDto.Response> read(EmergencyMassageDto.Request request) {
        List<EmergencyMassageDto.Response> responses = apiCaller.callApi(request);
        for (EmergencyMassageDto.Response response : responses) {
            for (EmergencyMassageDto.Response.Body body : response.getBody()) {
                body.setEmoji(rainFilter.filter(body.getMstnBrneCn()));
                body.setEmoji(heatFilter.filter(body.getMstnBrneCn()));
            }
        }
        return responses;
    }
}
