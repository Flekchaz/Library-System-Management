package com.example.library_management_system.repositories;

import com.example.library_management_system.Entities.Book;
import net.sf.jsqlparser.statement.select.Select;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface BookRepo extends JpaRepository<Book,Long> {

}
