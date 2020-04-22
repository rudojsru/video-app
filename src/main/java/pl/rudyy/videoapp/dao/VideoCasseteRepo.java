package pl.rudyy.videoapp.dao;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import pl.rudyy.videoapp.dao.entity.VideoCassette;

@Repository
public interface VideoCasseteRepo extends CrudRepository<VideoCassette,Long> {
}
