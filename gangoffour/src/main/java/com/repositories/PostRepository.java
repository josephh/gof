package patterns.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import patterns.entities.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {

}
