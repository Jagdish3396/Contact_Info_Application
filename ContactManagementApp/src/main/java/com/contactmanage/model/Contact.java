package com.contactmanage.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@Entity
@Table(name = "CONTACT_DTLS")
public class Contact {
	@Id
	@Column(name = "CONTACT_ID")
	private Integer ContactId;
	@Column(name = "CONTACT_NAME")
	private String contactName;
	@Column(name = "CONTACT_NUMBER")
	private String contactNumber;
	@Column(name = "CONTACT_EMAIL")
	private String contactEmail;
	@Column(name = "CREATED_DATE")
	private LocalDateTime createdDate;
	@Column(name = "UPDATED_DATE")
	private LocalDateTime updatedDate;

}
