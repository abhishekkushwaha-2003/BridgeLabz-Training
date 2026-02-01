package com.StreamAPI.streamapiproblems;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

class Member {
    String name;
    LocalDate expiryDate;

    Member(String name, LocalDate expiryDate) {
        this.name = name;
        this.expiryDate = expiryDate;
    }

    LocalDate getExpiryDate() { return expiryDate; }

    public String toString() {
        return name + " (Expiry: " + expiryDate + ")";
    }
}

public class ExpiringMembershipFilter {
    public static void main(String[] args) {

        List<Member> members = Arrays.asList(
                new Member("Rajeev", LocalDate.now().plusDays(10)),
                new Member("Abhi", LocalDate.now().plusDays(45)),
                new Member("Sonu", LocalDate.now().plusDays(25))
        );

        members.stream()
                .filter(m -> m.getExpiryDate()
                        .isBefore(LocalDate.now().plusDays(30)))
                .forEach(System.out::println);
    }
}

