package com.birthday.surprise.service;

import com.birthday.surprise.model.Gift;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

@Service
public class GiftService {

    @Value("${gift.message}")
    private String giftMessage;

    @Value("${gift.from}")
    private String from;

    @Value("${gift.to}")
    private String to;

    public Gift getTheGift() {
        return Gift.builder()
                .from(decodeBase64Message(from))
                .to(decodeBase64Message(to))
                .message(decodeBase64Message(giftMessage))
                .build();
    }

    private String decodeBase64Message(String encoded) {
        return new String(Base64.getDecoder().decode(encoded), StandardCharsets.UTF_8);
    }
}
