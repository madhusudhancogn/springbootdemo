package com.example.dao;

import com.example.api.Databasedemo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryRepository extends JpaRepository<Databasedemo,String> {
}
