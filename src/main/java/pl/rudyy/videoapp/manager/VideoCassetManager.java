package pl.rudyy.videoapp.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import pl.rudyy.videoapp.dao.VideoCasseteRepo;
import pl.rudyy.videoapp.dao.entity.VideoCassette;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class VideoCassetManager {
    private VideoCasseteRepo videoCasseteRepo;

    @Autowired
    public VideoCassetManager(VideoCasseteRepo videoCasseteRepo) {
        this.videoCasseteRepo = videoCasseteRepo;
    }

    public Optional<VideoCassette> findById(Long id) {
        return videoCasseteRepo.findById(id);
    }

    public Iterable<VideoCassette> findAll() {
        return videoCasseteRepo.findAll();
    }

    public VideoCassette save(VideoCassette videoCassette) {
        return videoCasseteRepo.save(videoCassette);
    }

    public void deleteBy(Long id) {
        videoCasseteRepo.deleteById(id);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void fillDB(){
        save(new VideoCassette(1L, "Titanic", LocalDate.of(1995, 1, 1)));
        save(new VideoCassette(2L, "Pulp fiction", LocalDate.of(1995, 3, 3)));
    }

}
