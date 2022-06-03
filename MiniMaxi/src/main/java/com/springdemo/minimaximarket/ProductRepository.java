package com.springdemo.minimaximarket;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Proizvod, Long> {

}
