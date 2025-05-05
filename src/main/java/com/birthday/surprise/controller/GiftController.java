package com.birthday.surprise.controller;


import com.birthday.surprise.service.GiftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController

public class GiftController {
    @Autowired
    private GiftService giftService;

    @GetMapping("/yourGift")//localhost:8080/yourGift
    public ResponseEntity<String> getTheGift() {
        String message=giftService.getTheGift();
        return ResponseEntity.ok(message);
    }

    @GetMapping("/pod-ip") //localhost:8080/pod-ip
    public ResponseEntity<String> getPodIp() {
        try {
            return ResponseEntity.ok("Pod IP Address: "
                    + InetAddress.getLocalHost().getHostAddress());
        } catch (UnknownHostException e) {
            return ResponseEntity.status(500).body("Unable to fetch IP address");
        }
    }


}
