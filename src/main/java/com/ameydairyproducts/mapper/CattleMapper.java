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
			cattle.setSellingPrice(dto.getSellingPrice());
			cattle.setCurrentStatus(dto.getCurrentStatus());
			cattle.setPurchaseDate(dto.getPurchaseDate());
			cattle.setSoldDate(dto.getSoldDate());
			cattle.setIsMilkProducingCattle(dto.isIsMilkProducingCattle());
			cattle.setIsPregnantCattle(dto.isIsPregnantCattle());
			cattle.setLaganDate(dto.getLaganDate());
			cattle.setExpectedDeliveryDate(dto.getExpectedDeliveryDate());
			cattle.setGender(dto.getGender());
			cattle.setVet(dto.getVet());
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
			cattleDTO.setCurrentStatus(cattle.getCurrentStatus());
			cattleDTO.setSellingPrice(cattle.getSellingPrice());
			cattleDTO.setPurchaseDate(cattle.getPurchaseDate());
			cattleDTO.setSoldDate(cattle.getSoldDate());
			cattleDTO.setIsMilkProducingCattle(cattle.isIsMilkProducingCattle());
			cattleDTO.setIsPregnantCattle(cattle.isIsPregnantCattle());
			cattleDTO.setLaganDate(cattle.getLaganDate());
			cattleDTO.setExpectedDeliveryDate(cattle.getExpectedDeliveryDate());
			cattleDTO.setGender(cattle.getGender());
			cattleDTO.setVet(cattle.getVet());
			
		}

		return cattleDTO;
	}

}
