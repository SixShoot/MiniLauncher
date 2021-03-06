val log4j2Version = "2.11.0"

dependencies {
    implementation(project(":api"))
    implementation(project(":renderer"))
    implementation("org.apache.logging.log4j:log4j-core:$log4j2Version")
    implementation("org.apache.logging.log4j:log4j-slf4j-impl:$log4j2Version")
}