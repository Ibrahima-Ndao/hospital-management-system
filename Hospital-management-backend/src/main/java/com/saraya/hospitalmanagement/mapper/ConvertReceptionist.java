package com.saraya.hospitalmanagement.mapper;

import org.springframework.stereotype.Component;

import com.saraya.hospitalmanagement.dto.ReceptionnistDTO;
import com.saraya.hospitalmanagement.model.Receptionnist;

@Component
public class ConvertReceptionist {
	public Receptionnist dtoToEntity(ReceptionnistDTO dto) {
		Receptionnist receptionnist = new Receptionnist();
		receptionnist.setAppiontments(dto.getAppiontments());
		receptionnist.setEmail(dto.getEmail());
		receptionnist.setFullName(dto.getFullName());
		receptionnist.setPassword(dto.getPassword());
		receptionnist.setPhoto(dto.getPhoto());
		receptionnist.setRoles(dto.getRoles());
		receptionnist.setUsername(dto.getUsername());
		return receptionnist;
	}
	
	public ReceptionnistDTO EntityTodto(Receptionnist receptionnist) {
		ReceptionnistDTO dto = new ReceptionnistDTO();
		dto.setAppiontments(receptionnist.getAppiontments());
		dto.setEmail(receptionnist.getEmail());
		dto.setFullName(receptionnist.getFullName());
		dto.setPassword(receptionnist.getPassword());
		dto.setPhoto(receptionnist.getPhoto());
		dto.setRoles(receptionnist.getRoles());
		dto.setUsername(receptionnist.getUsername());
		return dto;
	}
}
