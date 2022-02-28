package app.tanba.auth.repository;

import app.tambs.auth.models.Blog;

import jdk.jfr.Registered;

import org.springframework.data.jpa.repository.jpaRepository;

@Registered

public interface BlogRepository extends JpaRepository<Blog, Long> {

    List<Blogs FindAllyisPublished (Boolean isPublished);
}