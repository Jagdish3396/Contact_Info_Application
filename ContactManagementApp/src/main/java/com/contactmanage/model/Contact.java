package com.contactmanage.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GeneratorType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@ToString
@Entity
//@Setter
//@Getter
@Table(name = "CONTACT_DTLS")
public class Contact {
	@Id
	@Column(name = "CONTACT_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer contactId;
	@Column(name = "CONTACT_NAME")
	private String contactName;
	@Column(name = "CONTACT_NUMBER")
	
	private String contactNumber;
	@Column(name = "CONTACT_EMAIL")
	private String contactEmail;
	@Column(name = "ACTIVE_SWITCH")
	private Character activeSw;
	@CreationTimestamp
	@Column(name = "CREATED_DATE", insertable = true)
	private LocalDate createdDate;
	@CreationTimestamp
	@Column(name = "UPDATED_DATE", updatable = false)
	private LocalDate updatedDate;


}
