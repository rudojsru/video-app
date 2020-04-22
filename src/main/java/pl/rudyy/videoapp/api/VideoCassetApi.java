package pl.rudyy.videoapp.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.rudyy.videoapp.dao.entity.VideoCassette;
import pl.rudyy.videoapp.manager.VideoCassetManager;

import java.util.Optional;

@RestController
@RequestMapping("/api/cassetts")
public class VideoCassetApi {
    //    private List<VideoCassette> videoCassettes;
//
//    public VideoCassetApi() {
//        videoCassettes = new ArrayList<>();
//
//    }
    private VideoCassetManager videoCassettes;

    @Autowired
    public VideoCassetApi(VideoCassetManager videoCassettes) {
        this.videoCassettes = videoCassettes;
    }

    @GetMapping("/all")
    public Iterable<VideoCassette> getAll() {
        return videoCassettes.findAll();
    }

    @GetMapping
    public Optional<VideoCassette> getId(@RequestParam long index) {
      //  Optional<VideoCassette> first = videoCassettes.stream().filter(element -> element.getId() == index).findFirst();
//   return first.get();
        return videoCassettes.findById(index);
    }

    @PostMapping
    public VideoCassette addVideo(@RequestBody VideoCassette videoCassette) {
        System.out.println(videoCassette);
        return videoCassettes.save(videoCassette);
    }

    @PutMapping
    public VideoCassette updateVideo(@RequestBody VideoCassette videoCassette) {
        System.out.println(videoCassette);
        return videoCassettes.save(videoCassette);
    }

    @DeleteMapping
    public  void deleteVideo(@RequestParam long index) {
        //return videoCassettes.removeIf(element -> element.getId() == index);
           videoCassettes.deleteBy(index);
    }
}
