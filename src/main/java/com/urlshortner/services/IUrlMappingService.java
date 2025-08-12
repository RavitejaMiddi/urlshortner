package com.urlshortner.services;

import com.urlshortner.entitys.UrlMapping;

public interface IUrlMappingService {
     String shortenUrl(String originalUrl);
     String getOriginalUrl(String shortCode);

}
