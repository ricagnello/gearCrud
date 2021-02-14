package com.neutronstar.gearcrud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neutronstar.gearcrud.entities.Gear;

public interface GearRepository extends JpaRepository<Gear, Long> {

}
