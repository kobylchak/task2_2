package ua.kob.vas;

import lombok.Data;

import java.util.*;

@Data
public class Card {
    private String name;
    private String surname;
    private List<String> phones = new ArrayList<>();
    private List<String> sites = new ArrayList<>();
    private Map<String, String> address = new HashMap<>();

    public Card() {
        super();
    }

    public Card(String name, String surname, List<String> phones, List<String> sites, Map<String, String> address) {
        this.name = name;
        this.surname = surname;
        this.phones = phones;
        this.sites = sites;
        this.address = address;
    }
}
