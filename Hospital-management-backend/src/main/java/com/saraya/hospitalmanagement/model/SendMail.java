package com.saraya.hospitalmanagement.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
public class SendMail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "valueSubject")
    private String object;

    @Column(name = "message")
    private String text;

    @ManyToOne
    private Patient patient;

    @OneToOne
    private Receptionnist receptionnist;
    
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getObject() {
		return object;
	}

	public void setObject(String object) {
		this.object = object;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Receptionnist getReceptionnist() {
		return receptionnist;
	}

	public void setReceptionnist(Receptionnist receptionnist) {
		this.receptionnist = receptionnist;
	}
    
}
