package com.example.demo

import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/api/emplyees")
class EmployeesController (var employeesRepository: EmployeesRepository){
@GetMapping
    fun getAllEmployees(): Flux<Employees>{
    return employeesRepository.findAll()
}
    @GetMapping("/{id}")
    fun getById(@PathVariable id:String):Mono<Employees>{
        return employeesRepository.findById(id)
    }
    @PostMapping
    fun saveEmployees(@RequestBody employees:Employees):Mono<Employees>{
        return employeesRepository.save(employees)
    }
    @DeleteMapping("/{id}")
    fun deletedById(@PathVariable id:String): Mono<String>{
        println(id)
        return Mono.just("delete")
    }
}