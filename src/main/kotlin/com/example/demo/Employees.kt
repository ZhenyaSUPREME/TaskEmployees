package com.example.demo

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
class Employees (@Id var id:String, var name:String, var secondname:String){
    var tasks: MutableList<Task> = ArrayList()
    constructor(id:String,name:String,secondname:String,tasks:MutableList<Task>):this(id,name,secondname){
        this.tasks.addAll(tasks)
    }
    fun addTasks(tasks:MutableList<Task>){
        this.tasks.addAll(tasks)
    }

    fun addTask(task:Task){
        this.tasks.add(task)
    }
}