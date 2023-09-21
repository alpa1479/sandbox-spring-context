plugins {
    id("java")
}

dependencies {
    /*
     * org.springframework:spring-context dependency will include:
     * - spring-aop
     * - spring-beans
     * - spring-context
     * - spring-core
     * - spring-expression
     * - spring-jcl
     *
     */
    implementation("org.springframework:spring-context")

    implementation("ch.qos.logback:logback-classic")

    compileOnly("org.projectlombok:lombok")
    annotationProcessor("org.projectlombok:lombok")

    testImplementation("org.springframework:spring-test")
    testImplementation("org.junit.jupiter:junit-jupiter-api")
    testImplementation("org.junit.jupiter:junit-jupiter-engine")
    testImplementation("org.junit.jupiter:junit-jupiter-params")
    testImplementation("org.mockito:mockito-junit-jupiter")
    testImplementation("org.assertj:assertj-core")
}
