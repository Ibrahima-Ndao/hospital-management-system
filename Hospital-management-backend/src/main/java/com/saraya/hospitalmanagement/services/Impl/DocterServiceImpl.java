package com.saraya.hospitalmanagement.services.Impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saraya.hospitalmanagement.dto.DocterDTO;
import com.saraya.hospitalmanagement.mapper.ConvertDocter;
import com.saraya.hospitalmanagement.model.Docter;
import com.saraya.hospitalmanagement.repository.DocterRepository;
import com.saraya.hospitalmanagement.services.DocterService;
@Service
public class DocterServiceImpl implements DocterService {
	@Autowired
	private ConvertDocter convertDocter;
	@Autowired
	private DocterRepository repository;
	
	@Override
	public DocterDTO save(DocterDTO docterDTO) {
		Docter docter = convertDocter.dtoToEntity(docterDTO);
		repository.save(docter);
		DocterDTO dto = convertDocter.EntityToDto(docter);
		return dto;
	}

	@Override
	public List<DocterDTO> getAll() {
		List<Docter> docters = repository.findAll();
		List<DocterDTO> docterDTOs = new ArrayList<>();
		for (Docter docter : docters) {
			DocterDTO dto = convertDocter.EntityToDto(docter);
			docterDTOs.add(dto);
		}
		return docterDTOs;
	}

	@Override
	public DocterDTO getDocterById(int id) {
		Optional<Docter> optional = repository.findById(id);
		DocterDTO dto = null;
		if (optional.isPresent()) {
			Docter docter = optional.get();
			dto = convertDocter.EntityToDto(docter);
		} else {
			throw new RuntimeException("verify the id that you want to show!!!!!!");
		}
		return dto;
	}

	@Override
	public void delete(int id) {
	repository.deleteById(id);
	}

	@Override
	public DocterDTO update(DocterDTO dto, int id) {
		Optional<Docter> optional = repository.findById(id);
		DocterDTO docterDTO = null;
		if (optional.isPresent()) {
			Docter docter = optional.get();
			docter.setAdress(dto.getAdress());
			docter.setAge(dto.getAge());
			docter.setAppiontments(dto.getAppiontments());
			docter.setContact(dto.getContact());
			docter.setFullName(dto.getFullName());
			docter.setEmail(dto.getEmail());
			docter.setGender(dto.getGender());
			docter.setMonth(dto.getMonth());
			docter.setPassword(dto.getPassword());
			docter.setPhoto(dto.getPhoto());
			docter.setRoles(dto.getRoles());
			docter.setSalary(dto.getSalary());
			docter.setSpecialisation(dto.getSpecialisation());
			docter.setStatus(dto.getStatus());
			docter.setUsername(dto.getUsername());
			docter.setYear(dto.getYear());
			docterDTO = convertDocter.EntityToDto(docter);
			repository.save(docter);
		}
		return docterDTO;
	}

	@Override
	public int numberOfDoctor() {
		int cpt = 0;
		List<Docter> docters = repository.findAll();
		for (int i = 0; i < docters.size(); i++) {
			cpt++;
		}
		return cpt;
	}

	@Override
	public int numberOfActiveDoctor() {
		int cpt = 0;
		List<Docter> docters = repository.findByStatus("active");
		for (Docter docter : docters) {
			//if (docter.getStatus().equals("active")) {
				cpt++;
			//}
		}
		return cpt;
	}

	@Override
	public DocterDTO getDocterPrinscriptionById(int id) {
		Optional<Docter> optional = repository.findById(id);
		DocterDTO dto = null;
		if (optional.isPresent()) {
			Docter docter = optional.get();
			dto = convertDocter.EntityToDto(docter);
		} else {
			throw new RuntimeException("verify the id that you want to show!!!!!!");
		}
		return dto;
	}

	@Override
	public List<DocterDTO> getAvailableDoctors() {
		List<Docter> docters = repository.findDoctersByStatus("active");
		List<DocterDTO> docterDTOs = new ArrayList<>();
		for (Docter docter : docters) {
			//if(docter.getStatus().equalsIgnoreCase("active")) {
				DocterDTO dto = convertDocter.EntityToDto(docter);
				docterDTOs.add(dto);
			//}
			
		}
		return docterDTOs;
	}

}
