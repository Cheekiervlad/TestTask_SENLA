package com.example.demo.model;

import java.util.Random;

public enum ProductStatus {
    ACCEPTED, BEINGPROCESSED, SENT, DELIVERED;
    private static final Random PRNG = new Random();

    public static ProductStatus randomProductStatus()  {
        ProductStatus[] productStatuses = values();
        return productStatuses[PRNG.nextInt(productStatuses.length)];
    }
}
