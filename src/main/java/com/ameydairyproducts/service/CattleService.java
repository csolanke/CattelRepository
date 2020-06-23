package com.ameydairyproducts.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ameydairyproducts.domain.Cattle;
import com.ameydairyproducts.persistance.CattleRepository;

@Service
public class CattleService {
	
	
	private CattleRepository cattleRepository;
	
	CattleService(CattleRepository cattleRepository){
		
		this.cattleRepository = cattleRepository;
	}

    public List<Cattle> getAllCattles() {
       return  cattleRepository.findAll();
       
    }

    public Cattle getCattle(int id) {
       return  cattleRepository.findById(id).orElseGet(Cattle::new);
    }

    public void addCattle(Cattle cattle) {
        cattleRepository.save(cattle);
    }

    public void updateCattle(int id, Cattle cattle) {
        cattleRepository.save(cattle);
    }

    public void deleteCattle(int id) {
        cattleRepository.deleteById(id);
    }

}
