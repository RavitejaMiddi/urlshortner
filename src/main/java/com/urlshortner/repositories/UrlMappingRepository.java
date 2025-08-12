package com.urlshortner.repositories;

import com.urlshortner.entitys.UrlMapping;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UrlMappingRepository extends JpaRepository<UrlMapping,Integer> {
}
