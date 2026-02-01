package com.StreamAPI.streamapiproblems;

import java.util.*;
import java.util.stream.Collectors;

class Claim {
    String type;
    double amount;

    Claim(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    String getType() { return type; }
    double getAmount() { return amount; }
}

public class InsuranceClaimAnalysis {
    public static void main(String[] args) {

        List<Claim> claims = Arrays.asList(
                new Claim("Health", 20000),
                new Claim("Health", 30000),
                new Claim("Vehicle", 15000),
                new Claim("Vehicle", 25000),
                new Claim("Life", 50000)
        );

        Map<String, Double> avgClaims =
                claims.stream()
                        .collect(Collectors.groupingBy(
                                Claim::getType,
                                Collectors.averagingDouble(Claim::getAmount)
                        ));

        avgClaims.forEach((k, v) ->
                System.out.println(k + " -> " + v));
    }
}
