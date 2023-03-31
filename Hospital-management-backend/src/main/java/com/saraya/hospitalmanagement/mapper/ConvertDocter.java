package com.saraya.hospitalmanagement.mapper;

import org.springframework.stereotype.Component;

import com.saraya.hospitalmanagement.dto.DocterDTO;
import com.saraya.hospitalmanagement.model.Docter;
import com.saraya.hospitalmanagement.model.Specialisation;

@Component
public class ConvertDocter {
	public Docter dtoToEntity(DocterDTO dto) {
		Docter docter = new Docter();
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
		docter.setSchedule(dto.getSchedule());
		docter.setPrescriptions(dto.getPrescription());
		return docter;
	}
	
	public DocterDTO EntityToDto(Docter docter) {
		DocterDTO dto = new DocterDTO();
		dto.setId(docter.getId());
		dto.setAdress(docter.getAdress());
		dto.setAge(docter.getAge());
		dto.setAppiontments(docter.getAppiontments());
		dto.setContact(docter.getContact());
		dto.setFullName(docter.getFullName());
		dto.setEmail(docter.getEmail());
		dto.setGender(docter.getGender());
		dto.setMonth(docter.getMonth());
		dto.setPassword(docter.getPassword());
		dto.setPhoto(docter.getPhoto());
		dto.setRoles(docter.getRoles());
		dto.setSalary(docter.getSalary());
		dto.setSpecialisation(docter.getSpecialisation());
		dto.setStatus(docter.getStatus());
		dto.setUsername(docter.getUsername());
		dto.setYear(docter.getYear());
		dto.setSchedule(docter.getSchedule());
		dto.setPrescription(docter.getPrescriptions());
		return dto;
	}

}
