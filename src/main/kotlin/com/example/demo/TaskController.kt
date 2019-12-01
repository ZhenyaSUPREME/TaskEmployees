package com.example.demo

import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
@RestController
@RequestMapping("/api/task")
class TaskController(var taskRepository:TaskRepository){
    @GetMapping
    fun getAllTask(): Flux<Task>{
        return taskRepository.findAll()
    }
    @GetMapping("/{id}")
    fun getTask(@PathVariable id:String):Mono<Task>{
        return taskRepository.findById(id)
    }
@PostMapping
//{
//    "id":"194",
//    "name":"Ivan",
//    "age":"8"
//}
fun createTask(@RequestBody task:Task): Mono<Task> {
    return taskRepository.save(task)
}
    @DeleteMapping("/{id}")
    fun deletedById(@PathVariable id:String):Mono<String> {
        println (id)
       // taskRepository.deleteById(id)
        return Mono.just("deleted")
    }
}