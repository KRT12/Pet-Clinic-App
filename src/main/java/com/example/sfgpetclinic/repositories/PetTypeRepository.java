package com.example.sfgpetclinic.repositories;

import com.example.sfgpetclinic.models.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
