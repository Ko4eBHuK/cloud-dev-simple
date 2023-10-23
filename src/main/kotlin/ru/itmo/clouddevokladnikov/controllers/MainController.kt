package ru.itmo.clouddevokladnikov.controllers

import ru.itmo.clouddevokladnikov.domain.Program
import ru.itmo.clouddevokladnikov.services.ProgramService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class MainController(
        val programService: ProgramService
) {
    @GetMapping("/")
    fun index(): List<Program> = programService.getPrograms()

    @PostMapping("/")
    fun postProgram(@RequestBody program: Program) {
        programService.save(program)
    }
}
