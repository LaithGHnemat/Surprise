package com.birthday.surprise.controller;


import com.birthday.surprise.service.GiftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GiftController {

    @Autowired
    private GiftService giftService;

    @GetMapping(value = "/yourGift", produces = MediaType.TEXT_HTML_VALUE)
    public ResponseEntity<String> getTheGiftMessageHtml() {
        String message = giftService.getTheGift().toString();
        String html = "<html><body style='direction: rtl; font-family:" +
                " Arial, sans-serif; white-space: pre-wrap;'>" +
                message.replace("\n", "<br>") +
                "</body></html>";
        return ResponseEntity.ok(html);
    }

}
