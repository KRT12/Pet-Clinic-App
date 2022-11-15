package com.example.sfgpetclinic.services;

import com.example.sfgpetclinic.models.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
