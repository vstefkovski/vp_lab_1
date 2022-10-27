package mk.finki.ukim.mk.lab.bootstrap;

import lombok.Getter;
import mk.finki.ukim.mk.lab.model.Ballon;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
@Getter
public class DataHolder {
    public static List<Ballon> ballonList = new ArrayList<>();

    @PostConstruct
    public void init() {
        ballonList.add(new Ballon("First", "First Balloon "));
        ballonList.add(new Ballon("Second", "Second Balloon "));
        ballonList.add(new Ballon("Third", "Third Balloon "));
        ballonList.add(new Ballon("Fourth", "Fourth Balloon "));
        ballonList.add(new Ballon("Fifth", "Fifth Balloon "));
        ballonList.add(new Ballon("Sixth", "Sixth Balloon "));
        ballonList.add(new Ballon("Seventh", "Seventh Balloon "));
        ballonList.add(new Ballon("Eighth", "Eighth Balloon "));
        ballonList.add(new Ballon("Ninth", "Ninth Balloon "));
        ballonList.add(new Ballon("Tenth", "Tenth Balloon "));
    }
}
