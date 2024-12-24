package com.example.paymentservice.services;

import com.example.paymentservice.configs.RestConfig;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ProductService {
    private RestTemplate restTemplate;
    public ProductService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    public String getProductDetails(String productId) {
        return restTemplate.getForObject("http://ProductService/products/"+ productId, String.class);
    }
}
