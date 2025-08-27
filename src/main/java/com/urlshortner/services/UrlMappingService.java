package com.urlshortner.services;

import com.urlshortner.entitys.UrlMapping;
import com.urlshortner.repositories.UrlMappingRepository;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Optional;

@Service
public class UrlMappingService implements IUrlMappingService{

    @Autowired
    private UrlMappingRepository repository;

    @Override
    public String shortenUrl(String originalUrl) {
         Optional<UrlMapping> entity = repository.findByOriginalUrl(originalUrl);
         if(entity.isPresent())
            return entity.get().getShortCode();
         else {
             String shortenUrl = new String("http://localhost:8080/Apple2025MacBookAir");
             repository.save(new UrlMapping(originalUrl, shortenUrl, LocalDateTime.now(), new Date(2026, 5, 21), 1L));
             return shortenUrl;
         }
    }

    @Override
    public String getOriginalUrl(String shortCode) {
        Optional originalUrlByShortCode = repository.findOriginalUrlByShortCode(shortCode);
        if(originalUrlByShortCode.isPresent())
            return originalUrlByShortCode.get().toString();
        else
            return "Not Found";
    }
}
