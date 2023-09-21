plugins {
    id("java")
}

dependencies {
    implementation("org.springframework:spring-context")

    implementation("ch.qos.logback:logback-classic")
    implementation("javax.annotation:javax.annotation-api:1.3.2")

    compileOnly("org.projectlombok:lombok")
    annotationProcessor("org.projectlombok:lombok")

    testImplementation("org.springframework:spring-test")
    testImplementation("org.junit.jupiter:junit-jupiter-api")
    testImplementation("org.junit.jupiter:junit-jupiter-engine")
    testImplementation("org.junit.jupiter:junit-jupiter-params")
    testImplementation("org.mockito:mockito-junit-jupiter")
    testImplementation("org.assertj:assertj-core")
}
