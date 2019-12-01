package com.example.demo

import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository

@Repository
interface EmployeesRepository:ReactiveMongoRepository<Employees,String>{

}