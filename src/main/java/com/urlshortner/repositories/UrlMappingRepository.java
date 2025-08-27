package com.urlshortner.repositories;

import com.urlshortner.entitys.UrlMapping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UrlMappingRepository extends JpaRepository<UrlMapping,Integer> {
    @Query("SELECT u.originalUrl FROM UrlMapping AS u WHERE u.shortCode = :shortUrl")
    Optional<String> findOriginalUrlByShortCode(@Param("shortUrl") String shortUrl);

    @Query("SELECT CASE WHEN COUNT(u) > 0 THEN true ELSE false END FROM UrlMapping u WHERE u.originalUrl = :originalUrl")
    boolean urlExists(@Param("originalUrl") String originalUrl);

    Optional<UrlMapping> findByOriginalUrl(String originalUrl);
}


