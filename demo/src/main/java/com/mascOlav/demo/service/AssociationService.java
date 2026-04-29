package com.mascOlav.demo.service;

import com.mascOlav.demo.dto.AssociationDTO;
import com.mascOlav.demo.model.Association;
import com.mascOlav.demo.repository.AssociationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AssociationService {

    private final AssociationRepository associationRepository;

    public Association createAssociation(AssociationDTO associationDto){
        Association association = new Association();
        association.setName(associationDto.getName());
        association.setDescription(associationDto.getDescription());
        association.setPhone(associationDto.getPhone());
        association.setInstagramProfile(associationDto.getInstagramProfile());
        association.setLocation(associationDto.getLocation());
        return associationRepository.save(association);
    }

    public Association updateAssociation(Long id, AssociationDTO associationDto) {
        Association association = associationRepository.findById(id).orElseThrow();
        association.setName(associationDto.getName());
        association.setDescription(associationDto.getDescription());
        association.setPhone(associationDto.getPhone());
        association.setInstagramProfile(associationDto.getInstagramProfile());
        association.setLocation(associationDto.getLocation());
        return associationRepository.save(association);
    }

    //delete vet
    public void deleteAssociation(Long id){
        associationRepository.deleteById(id);
    }

    //get all vets
    public List<Association> findAll(){
        return associationRepository.findAll();
    }
}
