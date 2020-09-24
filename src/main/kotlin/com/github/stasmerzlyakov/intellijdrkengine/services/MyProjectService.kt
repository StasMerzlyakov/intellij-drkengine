package com.github.stasmerzlyakov.intellijdrkengine.services

import com.intellij.openapi.project.Project
import com.github.stasmerzlyakov.intellijdrkengine.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
