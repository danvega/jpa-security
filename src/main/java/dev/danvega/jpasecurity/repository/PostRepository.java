package dev.danvega.jpasecurity.repository;

import dev.danvega.jpasecurity.model.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post,Long> {

}
