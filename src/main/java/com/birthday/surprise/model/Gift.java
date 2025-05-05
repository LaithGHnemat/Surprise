package com.birthday.surprise.model;


import lombok.Data;


@Data

public class Gift {

    private String from;
     private String to;
     private String message;

    public void printGift(){
        String name ="WW91IGRlc2VydmUgYWxsIHRoZSBiZWF1dGlmdWwgdGhpbmdzIHRoYXQ" +
                "gaGFwcGVuZWQgdG8geW91Lgptb3JlIHByb3NwZXJpdHks" +
                "IGhvcGUgeW91IGNvbnRpbnVlZCBwcm9ncmVzcyBhbmQgc" +
                "3VjY2VzcyBhbmQgSSBiZWxpZXZlIHlvdSBjYW4uLiAKbXkgc" +
                "2hpbmluZywgSSB3YXMsIEkgZG8sIGFuZCAgSSB3aWxsIHN0YXk" +
                "gbG92ZSB5b3UgZm9yZXZlciBlbW1hLAp0YWtlIGdvb2QgY2FyZSBv" +
                "ZiB5b3Vyc2VsZi4uSSBsb3ZlIHlvdSBhIGxvdC4uCiBmYWxsb3cgdGhlI" +
                "GxpbmsgYW5kICBsaXN0ZW4gdG8gdGhpcyBzb25nIHBsZWFzZSA6Cmh0dHBz" +
                "Oi8vd3d3LnlvdXR1YmUuY29tL3dhdGNoP3Y9aG5oMHlVNWVmNFUKCgoK";
    }
}
