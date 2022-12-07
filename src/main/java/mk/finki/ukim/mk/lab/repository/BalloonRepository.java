package mk.finki.ukim.mk.lab.repository;

import mk.finki.ukim.mk.lab.model.Balloon;
import mk.finki.ukim.mk.lab.model.Manufacturer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Repository
public class BalloonRepository {
    List<Balloon> balloons = new ArrayList<>(10);

    public BalloonRepository() {
        this.balloons.add(new Balloon("Black", "Black Balloon", null));
        this.balloons.add(new Balloon("White", "White Balloon", null));
        this.balloons.add(new Balloon("Red", "Red Balloon ", null));
        this.balloons.add(new Balloon("Green", "Green Balloon", null));
        this.balloons.add(new Balloon("Yellow", "Yellow Balloon", null));
        this.balloons.add(new Balloon("Blue", "Blue Balloon", null));
        this.balloons.add(new Balloon("Pink", "Pink Balloon", null));
        this.balloons.add(new Balloon("Gray", "Gray Balloon", null));
        this.balloons.add(new Balloon("Brown", "Brown Balloon", null));
        this.balloons.add(new Balloon("Orange", "Orange Balloon", null));
    }

    public List<Balloon> findAllBalloons() {
        return this.balloons;
    }

    public List<Balloon> findAllByNameOrDescription(String text) {
        List<Balloon> foundBalloons = new ArrayList<>();
        for (Balloon balloon : balloons) {
            if (balloon.getName().contains(text) || balloon.getDescription().contains(text))
                foundBalloons.add(balloon);
        }
        return foundBalloons;
    }

    public Optional<Balloon> findById(Long id) {
        return balloons.stream().filter(r -> r.getId().equals(id)).findFirst();
    }

    public Optional<Balloon> save(String name, String description, Manufacturer manufacturer) {
        balloons.removeIf(r -> r.getName().equals(name));
        Balloon balloon = new Balloon(name, description, manufacturer);
        balloons.add(balloon);
        return Optional.of(balloon);
    }

    public void delete(Long id) {
        balloons.removeIf(r -> r.getId().equals(id));
    }
}