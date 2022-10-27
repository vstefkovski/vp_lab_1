package mk.finki.ukim.mk.lab.repository;

import mk.finki.ukim.mk.lab.bootstrap.DataHolder;
import mk.finki.ukim.mk.lab.model.Ballon;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;


@Repository
public class BalloonRepository {

    public List<Ballon> findAllBalloons() {
        return DataHolder.ballonList;
    }

    public List<Ballon> findAllByNameOrDescription(String text){
        return DataHolder.ballonList.stream()
                .filter(ballon -> ballon.getName().contains(text) || ballon.getDescription().contains(text))
                .collect(Collectors.toList());
    }


}
