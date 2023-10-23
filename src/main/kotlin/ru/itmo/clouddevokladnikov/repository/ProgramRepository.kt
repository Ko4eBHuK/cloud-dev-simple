package ru.itmo.clouddevokladnikov.repository

import org.springframework.data.repository.CrudRepository
import ru.itmo.clouddevokladnikov.domain.Program

interface ProgramRepository : CrudRepository<Program, Long>
