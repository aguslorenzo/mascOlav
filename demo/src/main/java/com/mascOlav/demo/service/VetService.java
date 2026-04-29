package com.mascOlav.demo.service;

import com.mascOlav.demo.dto.VetDTO;
import com.mascOlav.demo.model.Vet;
import com.mascOlav.demo.repository.VetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VetService {

    private final VetRepository vetRepository;

    //create vet
    public Vet createVet(VetDTO vetDto){
        Vet vet = new Vet();
        vet.setName(vetDto.getName());
        vet.setAddress(vetDto.getAddress());
        vet.setLatitude(vetDto.getLatitude());
        vet.setLongitude(vetDto.getLongitude());
        vet.setPhone(vetDto.getPhone());
        vet.setSchedule(vetDto.getSchedule());
        return  vetRepository.save(vet);
    }

    //update vet
    public Vet updateVet(Long id, VetDTO vetDto) {
        Vet vet = vetRepository.findById(id).orElseThrow();
        vet.setName(vetDto.getName());
        vet.setAddress(vetDto.getAddress());
        vet.setLatitude(vetDto.getLatitude());
        vet.setLongitude(vetDto.getLongitude());
        vet.setPhone(vetDto.getPhone());
        vet.setSchedule(vetDto.getSchedule());
        return vetRepository.save(vet);
    }

    //delete vet
    public void deleteVet(Long id){
        vetRepository.deleteById(id);
    }

    //get all vets
    public List<Vet> findAll(){
        return vetRepository.findAll();
    }
}
