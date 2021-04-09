package com.github.lankydan.fairyfloss.services

import com.github.lankydan.fairyfloss.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
