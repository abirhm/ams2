package com.sip.projet_revision.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Provider {
	@Id // cle primaire
	@GeneratedValue(strategy = GenerationType.AUTO) // auto increment
	private long id;

	@NotBlank(message = "Name is mandatory") // condition not null
	@Column(name = "name") // description de nom de colonne
	private String name;

	@NotBlank(message = "Adress is mandatory")
	@Column(name = "adress")
	private String adress;

	public Provider() {
	}

	public Provider(long id, @NotBlank(message = "Name is mandatory") String name,
			@NotBlank(message = "Adress is mandatory") String adress,
			@NotBlank(message = "Email is mandatory") String email) {
		super();
		this.id = id;
		this.name = name;
		this.adress = adress;
		this.email = email;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@NotBlank(message = "Email is mandatory")
	@Column(name = "email")
	private String email;

	

}
