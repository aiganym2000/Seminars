package kz.kaznu.spring.repos;

import kz.kaznu.spring.domain.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepo extends CrudRepository<Message, Integer> {

}

