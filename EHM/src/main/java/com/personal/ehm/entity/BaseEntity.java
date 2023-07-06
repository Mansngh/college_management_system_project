package com.personal.ehm.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.hibernate.annotations.ColumnDefault;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@MappedSuperclass
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BaseEntity implements Serializable {
	public static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;

	@JsonBackReference
	@JoinColumn(name = "created_by", referencedColumnName = "id")
	@ManyToOne(fetch = FetchType.LAZY)
	User createdBy;

	@JoinColumn(name = "updated_by", referencedColumnName = "id")
	@ManyToOne(fetch = FetchType.LAZY)
	User updatedBy;

	@Column(name = "created_on")
	LocalDateTime createdOn;

	@Column(name = "updated_on")
	LocalDateTime updatedOn;

	@Column(name = "deleted")
	@ColumnDefault(value = "0")
	Boolean deleted = false;

	@Column(name = "active")
	Boolean active = true;

	@PrePersist
	public void prePresist() {
		if (createdOn == null) {
			createdOn = LocalDateTime.now();
			updatedOn = LocalDateTime.now();
		}
	}

	@PreUpdate
	public void preUpdate() {
		Long currentId = 2L;
		if (currentId != null) {
			// updatedBy=
		}
	}

}
