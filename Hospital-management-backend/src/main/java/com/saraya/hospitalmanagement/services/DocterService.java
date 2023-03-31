package com.saraya.hospitalmanagement.services;

import java.util.List;
import com.saraya.hospitalmanagement.dto.DocterDTO;

public interface DocterService {
	DocterDTO save(DocterDTO docterDTO);
	List<DocterDTO> getAll();
	List<DocterDTO> getAvailableDoctors();
	DocterDTO getDocterById(int id);
	void delete(int id);
	DocterDTO update(DocterDTO docterDTO, int id);
	int numberOfDoctor();
	int numberOfActiveDoctor();
	DocterDTO getDocterPrinscriptionById(int id);
}
