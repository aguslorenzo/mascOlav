package com.mascOlav.demo.repository;

import com.mascOlav.demo.model.Association;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssociationRepository extends JpaRepository<Association, Long> {

}
