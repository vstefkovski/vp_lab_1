package mk.finki.ukim.mk.lab.model;

import lombok.Data;

@Data
public class Ballon {
    String name;
    String description;

    public Ballon(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
