package com.ameydairyproducts.mapper;

import org.springframework.stereotype.Component;

import com.ameydairyproducts.domain.Cattle;
import com.ameydairyproducts.dto.CattleDTO;

@Component
public class CattleMapper {
	
	public Cattle cattleDTOtoEntity(CattleDTO dto) {
		Cattle cattle = new Cattle();

		if (null != dto) {
			cattle.setId(dto.getId());
			cattle.setBreed(dto.getBreed());
			cattle.setCattleName(dto.getCattleName());
			cattle.setMilkingCapacity(dto.getMilkingCapacity());
			cattle.setNumOfKids(dto.getNumOfKids());
			cattle.setPricePurchased(dto.getPricePurchased());
			cattle.setUniqueIdentity(dto.getUniqueIdentity());
		}

		return cattle;
	}
	
	
	
	public CattleDTO cattlEntityToDto(Cattle cattle) {
		CattleDTO cattleDTO = new CattleDTO();

		if (null != cattle) {
			cattleDTO.setId(cattle.getId());
			cattleDTO.setBreed(cattle.getBreed());
			cattleDTO.setCattleName(cattle.getCattleName());
			cattleDTO.setMilkingCapacity(cattle.getMilkingCapacity());
			cattleDTO.setNumOfKids(cattle.getNumOfKids());
			cattleDTO.setPricePurchased(cattle.getPricePurchased());
			cattleDTO.setUniqueIdentity(cattle.getUniqueIdentity());
		}

		return cattleDTO;
	}
	

}
