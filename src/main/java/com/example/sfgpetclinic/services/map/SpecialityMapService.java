package com.example.sfgpetclinic.services.map;

import com.example.sfgpetclinic.models.Speciality;
import com.example.sfgpetclinic.repositories.SpecialityRepository;
import com.example.sfgpetclinic.services.SpecialityService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile({"default", "map"})
public class SpecialityMapService implements SpecialityService {

    public SpecialityMapService(SpecialityRepository specialityRepository) {
        this.specialityRepository = specialityRepository;
    }

    private final SpecialityRepository specialityRepository;

    @Override
    public Set<Speciality> findAll() {
        Set<Speciality> specialities = new HashSet<>();
        specialityRepository.findAll().forEach(speciality -> specialities.add(speciality));
        return specialities;
    }

    @Override
    public Speciality findById(Long aLong) {
        return specialityRepository.findById(aLong).orElse(null);
    }

    @Override
    public Speciality save(Speciality object) {
        return specialityRepository.save(object);
    }

    @Override
    public void delete(Speciality object) {
        specialityRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        specialityRepository.deleteById(aLong);
    }
}
