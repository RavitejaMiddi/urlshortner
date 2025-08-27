package com.urlshortner.controllers;


import com.urlshortner.services.UrlMappingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/urlshortner")
public class UrlShortnerController {

    @Autowired
    private UrlMappingService urlMappingService;


    @GetMapping("/shorten")
    public String  shortenUrl(String url){
        System.out.println(url);
        String shortenedUrl = urlMappingService.shortenUrl(url);
        return shortenedUrl;
    }

    @GetMapping("/getOriginal")
    public String getWebsite(String url){
        return urlMappingService.getOriginalUrl(url);
    }

}
