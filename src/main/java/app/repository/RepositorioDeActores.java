package app.repository;

import app.domain.Actor;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by aye on 27/05/17.
 */
public interface RepositorioDeActores extends MongoRepository<Actor,String> {
}
