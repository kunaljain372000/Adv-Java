package com.tas.restApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tas.restApi.entites.Shop;

@Repository
public interface ShopRepository extends JpaRepository<Shop, Long> {
   
}
