package com.saraya.hospitalmanagement.services;

import java.util.List;
import com.saraya.hospitalmanagement.dto.ReceptionnistDTO;
import com.saraya.hospitalmanagement.model.Receptionnist;

public interface ReceptionnistService {
	Receptionnist save(Receptionnist dto);
	List<Receptionnist> getAll();
	Receptionnist getReceptionnistById(int id);
	void delete(int id);
	Receptionnist update(Receptionnist dto, int id);
}
