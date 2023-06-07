package com.example.SprngBootApp.Repository;

import com.example.SprngBootApp.Model.DatabaseFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface DatabaseFileRepository extends JpaRepository<DatabaseFile,String> {
}
