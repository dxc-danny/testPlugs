package com.github.dxcdanny.testplugs.services

import com.intellij.openapi.project.Project
import com.github.dxcdanny.testplugs.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
