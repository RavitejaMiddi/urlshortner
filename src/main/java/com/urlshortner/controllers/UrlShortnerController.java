package com.urlshortner.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/urlshortner")
public class UrlShortnerController {



    @GetMapping("/shorten")
    public String  shortenUrl(String url){
        return "shortened url";
    }

}
