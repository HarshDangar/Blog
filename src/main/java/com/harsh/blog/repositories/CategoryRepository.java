package com.harsh.blog.repositories;

import com.harsh.blog.domain.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface CategoryRepository extends JpaRepository<Category, UUID> {

    @Query("SELECT c FROM Category c LEFT JOIN FETCH c.posts")
    List<Category> findAllWIthPostCount();

    boolean existsByNameIgnoreCase(String name);
}
