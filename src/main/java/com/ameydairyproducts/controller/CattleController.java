package com.ameydairyproducts.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ameydairyproducts.domain.Cattle;
import com.ameydairyproducts.dto.CattleDTO;
import com.ameydairyproducts.mapper.CattleMapper;
import com.ameydairyproducts.service.CattleService;

@RestController
@RequestMapping("/api/v1")
public class CattleController {

	@Autowired
    private CattleService cattleService;
	@Autowired
    private CattleMapper cattleMapper;
	
    @GetMapping("/cattles")
    public List<Cattle> getAllCattles() {
        return cattleService.getAllCattles();
    }

    @GetMapping("/cattles/{id}")
    public CattleDTO getCattle(@PathVariable("id") int cattleId){
       Cattle cattleEntity = cattleService.getCattle(cattleId);
       return  cattleMapper.cattlEntityToDto(cattleEntity);
    }

    @PostMapping("/cattles")
    public void  addCattle(@RequestBody CattleDTO cattleDTO) {
    	
        cattleService.addCattle(cattleMapper.cattleDTOtoEntity(cattleDTO));
        
    }

    @PutMapping("/cattles/{id}")
    public void updateCattle(@PathVariable("id") int cattleId, @RequestBody CattleDTO cattleDto) {
    	
        cattleService.updateCattle(cattleId, cattleMapper.cattleDTOtoEntity(cattleDto));
    }

    @DeleteMapping("/cattles/{id}")
    public void deleteCattle(@PathVariable("id") int cattleId) {
        cattleService.deleteCattle(cattleId);
    }
}
