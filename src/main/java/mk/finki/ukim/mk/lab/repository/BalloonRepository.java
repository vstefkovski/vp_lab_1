package mk.finki.ukim.mk.lab.repository;

import mk.finki.ukim.mk.lab.bootstrap.DataHolder;
import mk.finki.ukim.mk.lab.model.Ballon;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Repository
public class BalloonRepository {
    List<Ballon> balloons = new ArrayList<>(10);

    public BalloonRepository() {
        this.balloons.add(new Ballon("Blue", "Small"));
        this.balloons.add(new Ballon("Blue", "Medium"));
        this.balloons.add(new Ballon("Blue", "Big"));
        this.balloons.add(new Ballon("Red", "Small"));
        this.balloons.add(new Ballon("Red", "Medium"));
        this.balloons.add(new Ballon("Red", "Extra Big"));
        this.balloons.add(new Ballon("Green", "Small"));
        this.balloons.add(new Ballon("Green", "Medium"));
        this.balloons.add(new Ballon("Green", "Big"));
        this.balloons.add(new Ballon("Yellow", "Extra Big"));
    }

    public List<Ballon> findAllBalloons() {
        return this.balloons;
    }

    public List<Ballon> findAllByNameOrDescription(String text) {
        List<Ballon> foundBalloons = new ArrayList<>();
        for (Ballon balloon : balloons) {
            if (balloon.getName().contains(text) || balloon.getDescription().contains(text))
                foundBalloons.add(balloon);
        }
        return foundBalloons;
    }
}
