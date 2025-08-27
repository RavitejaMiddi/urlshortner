package com.urlshortner.entitys;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "urls")
public class UrlMapping {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name = "original_url", nullable = false,length = 2000)
        private String originalUrl;

        @Column(name = "short_code", nullable = false, unique = true)
        private String shortCode;

        @Column(name = "created_at", nullable = false)
        private LocalDateTime createdAt;

        @Column(name = "expiry_date")
        private Date expiryDate;

        @Column(name = "click_count", nullable = false)
        private Long clickCount = 0L;

    // Constructors, getters, setters

    public UrlMapping( String originalUrl, String shortCode, LocalDateTime createdAt, Date expiryDate, Long clickCount) {
       // this.id = id;
        this.originalUrl = originalUrl;
        this.shortCode = shortCode;
        this.createdAt = createdAt;
        this.expiryDate = expiryDate;
        this.clickCount = clickCount;
    }

    public UrlMapping() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOriginalUrl() {
        return originalUrl;
    }

    public void setOriginalUrl(String originalUrl) {
        this.originalUrl = originalUrl;
    }

    public String getShortCode() {
        return shortCode;
    }

    public void setShortCode(String shortCode) {
        this.shortCode = shortCode;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Long getClickCount() {
        return clickCount;
    }

    public void setClickCount(Long clickCount) {
        this.clickCount = clickCount;
    }

    @Override
    public String toString() {
        return "UrlMapping{" +
                "id=" + id +
                ", originalUrl='" + originalUrl + '\'' +
                ", shortCode='" + shortCode + '\'' +
                ", createdAt=" + createdAt +
                ", expiryDate=" + expiryDate +
                ", clickCount=" + clickCount +
                '}';
    }
}
