package ru.itmo.clouddevokladnikov.domain

import jakarta.persistence.*

@Entity
@Table(name = "programs")
data class Program(
		@Id @GeneratedValue(strategy= GenerationType.AUTO) val id: Long,
		@Column(name = "source_code") val sourceCode: String?,
		@Column(name = "returned_value") val returnedValue: String?
)
