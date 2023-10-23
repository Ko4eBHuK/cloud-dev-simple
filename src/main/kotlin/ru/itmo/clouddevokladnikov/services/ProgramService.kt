package ru.itmo.clouddevokladnikov.services

import org.springframework.stereotype.Service
import ru.itmo.clouddevokladnikov.domain.Program
import ru.itmo.clouddevokladnikov.repository.ProgramRepository
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

@Service
class ProgramService(val repository: ProgramRepository) {

	fun getPrograms(): List<Program> = repository.findAll().toList()

	fun save(program: Program) {
		// TODO - call compiler to produce VM executable with source code from program
		// TODO - call VM with executable and collect the result
		// TODO - pass full program data to database
		val formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss")
		val currentTime = LocalDateTime.now().format(formatter)
		val returnedValue = "finished at $currentTime"
		repository.save(
			program.copy(
				returnedValue = returnedValue
			)
		)
	}
}
