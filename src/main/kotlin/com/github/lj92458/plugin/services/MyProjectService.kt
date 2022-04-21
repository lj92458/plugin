package com.github.lj92458.plugin.services

import com.intellij.openapi.project.Project
import com.github.lj92458.plugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
