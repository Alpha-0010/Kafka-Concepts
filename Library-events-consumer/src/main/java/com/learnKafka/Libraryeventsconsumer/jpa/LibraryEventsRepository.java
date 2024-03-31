package com.learnKafka.Libraryeventsconsumer.jpa;
import com.learnKafka.Libraryeventsconsumer.entity.LibraryEvent;
import org.springframework.data.repository.CrudRepository;

public interface LibraryEventsRepository extends CrudRepository<LibraryEvent,Integer> {
}
