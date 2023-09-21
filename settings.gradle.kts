rootProject.name = "sandbox-spring-context"

pluginManagement {
    val springDependencyManagement: String by settings
    val springframeworkBoot: String by settings

    plugins {
        id("io.spring.dependency-management") version springDependencyManagement
        id("org.springframework.boot") version springframeworkBoot
    }
}

include("examples:annotation-based-configuration")
include("examples:bean-lifecycle")
include("examples:circular-dependency")
include("examples:injection-types")
include("examples:java-based-configuration")
include("examples:xml-based-configuration")
include("examples:package-scanning")
