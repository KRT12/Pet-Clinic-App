package com.example.sfgpetclinic.repositories;

import com.example.sfgpetclinic.models.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
