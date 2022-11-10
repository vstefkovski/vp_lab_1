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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
