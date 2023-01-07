package com.vish.trackerapp;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("secret")
public record TrackerConfigProperties(String apiUrl, String apiKey, String apiHost) {

}
