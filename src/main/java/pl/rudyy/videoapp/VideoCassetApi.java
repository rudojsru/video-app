package pl.rudyy.videoapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/cassetts/")
public class VideoCassetApi {
    private List<VideoCassette> videoCassettes;

    public VideoCassetApi() {
        videoCassettes = new ArrayList<>();
        videoCassettes.add(new VideoCassette(1L, "Titanic", LocalDate.of(1995, 1, 1)));
        videoCassettes.add(new VideoCassette(2L, "Pulp fiction", LocalDate.of(1995, 3, 3)));
    }

    @GetMapping("/all")
    public List<VideoCassette> getAll() {
        return videoCassettes;
    }

    @GetMapping
    public VideoCassette getId(@RequestParam int index) {
        Optional<VideoCassette> first = videoCassettes.stream().filter(element -> element.getId() == index).findFirst();
        return first.get();
    }
}
