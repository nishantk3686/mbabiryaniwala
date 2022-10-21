package com.biryaniwala.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import com.biryaniwala.model.biryani;
import com.biryaniwala.repository.biryanirepository;
import org.springframework.stereotype.Service;

@Service
public class biryaniservice {
	
	private biryanirepository biryanirepo;
	
	public String addBiryani(biryani b1) {
		
		biryanirepo.save(b1);
		return "Biryani Added Successfully";
		}
	public String addAllBiryani(List<biryani> blist) {
		biryanirepo.saveAll(blist);
		return "All Biryanis Added Successfully";
	}
	
	
	public List<biryani> getAllBiryani(){
		List<biryani> allbiryani=new ArrayList<>();		
		biryanirepo.findAll().forEach(allbiryani::add);
		return allbiryani;
		
	}
	
	public Optional<biryani> getBiryaniById(int id) {
		return biryanirepo.findById(id);
	}
	
	public List<biryani> getBiryaniByType(String btype){
		return biryanirepo.findByBiryaniType(btype);
		
	}
	
	public List<biryani> getBiryaniByRange(int bprice){
		return biryanirepo.findByBiryaniPrice(bprice);
	}
	
	
	
	

}
