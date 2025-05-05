package com.birthday.surprise.service;

import org.springframework.stereotype.Service;

import java.util.Base64;
@Service
public class GiftService {

    public String getTheGift(){
        String name ="WW91IGRlc2VydmUgYWxsIHRoZSBiZWF1dGlmdWwgdGhpbmdzIHRoYXQ" +
                "gaGFwcGVuZWQgdG8geW91Lgptb3JlIHByb3NwZXJpdHks" +
                "IGhvcGUgeW91IGNvbnRpbnVlZCBwcm9ncmVzcyBhbmQgc" +
                "3VjY2VzcyBhbmQgSSBiZWxpZXZlIHlvdSBjYW4uLiAKbXkgc" +
                "2hpbmluZywgSSB3YXMsIEkgZG8sIGFuZCAgSSB3aWxsIHN0YXk" +
                "gbG92ZSB5b3UgZm9yZXZlciBlbW1hLAp0YWtlIGdvb2QgY2FyZSBv" +
                "ZiB5b3Vyc2VsZi4uSSBsb3ZlIHlvdSBhIGxvdC4uCiBmYWxsb3cgdGhlI" +
                "GxpbmsgYW5kICBsaXN0ZW4gdG8gdGhpcyBzb25nIHBsZWFzZSA6Cmh0dHBz" +
                "Oi8vd3d3LnlvdXR1YmUuY29tL3dhdGNoP3Y9aG5oMHlVNWVmNFUKCgoK";
        Base64.Decoder decoder = Base64.getDecoder();
        String result = new String(decoder.decode(name));
        return result;
    }
}
