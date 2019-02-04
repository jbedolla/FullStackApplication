package com.globomatics.shoe.repositories;

import com.globomatics.shoe.models.Shoe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShoeRepository extends JpaRepository<Shoe,Long> {

}
