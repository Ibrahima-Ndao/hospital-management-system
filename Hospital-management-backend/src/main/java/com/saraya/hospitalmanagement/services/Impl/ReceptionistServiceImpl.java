package com.saraya.hospitalmanagement.services.Impl;

import java.util.List;
import java.util.Optional;

import javax.sound.midi.MidiMessage;
import javax.sound.midi.Receiver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saraya.hospitalmanagement.dto.ReceptionnistDTO;
import com.saraya.hospitalmanagement.model.Receptionnist;
import com.saraya.hospitalmanagement.repository.ReceptionnistRepo;
import com.saraya.hospitalmanagement.services.ReceptionnistService;
@Service
public class ReceptionistServiceImpl implements ReceptionnistService{
	@Autowired
	private ReceptionnistRepo receptionnistRepo;
	@Override
	public Receptionnist save(Receptionnist dto) {
		// TODO Auto-generated method stub
		return receptionnistRepo.save(null);
	}

	@Override
	public List<Receptionnist> getAll() {
		// TODO Auto-generated method stub
		return receptionnistRepo.findAll();
	}

	@Override
	public Receptionnist getReceptionnistById(int id) {
		// TODO Auto-generated method stub
		return receptionnistRepo.findById(id).orElse(null);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		receptionnistRepo.deleteById(id);
	}

	@Override
	public Receptionnist update(Receptionnist dto, int id) {
		Optional<Receptionnist> list = receptionnistRepo.findById(id);
		Receptionnist receptionnist = null;
		if (list.isPresent()) {
			receptionnist = list.get();
			receptionnist.setAppiontments(dto.getAppiontments());
			receptionnist.setEmail(dto.getEmail());
			receptionnist.setFullName(dto.getFullName());
			receptionnist.setPassword(dto.getPassword());
			receptionnist.setPhoto(dto.getPhoto());
			receptionnist.setRoles(dto.getRoles());
			receptionnist.setUsername(dto.getUsername());
		}
		return receptionnistRepo.save(receptionnist);
	}
	
}
