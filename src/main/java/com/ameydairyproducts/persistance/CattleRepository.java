package com.ameydairyproducts.persistance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ameydairyproducts.domain.Cattle;

@Repository
public interface CattleRepository extends JpaRepository<Cattle, Integer> {
}