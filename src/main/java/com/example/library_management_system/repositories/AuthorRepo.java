package com.example.library_management_system.repositories;

import com.example.library_management_system.Entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface AuthorRepo extends JpaRepository<Author,Long> {
}
