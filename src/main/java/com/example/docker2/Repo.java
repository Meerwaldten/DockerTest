package com.example.docker2;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Repo extends JpaRepository<HelloWorld, Long> {


}
