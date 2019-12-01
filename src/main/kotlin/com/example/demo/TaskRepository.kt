package com.example.demo

import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository

@Repository
//Repository- хранит данные в базе данных
//Все абстрактные методы реализует технология SPRINGDATA
interface TaskRepository: ReactiveMongoRepository<Task,String>{

}