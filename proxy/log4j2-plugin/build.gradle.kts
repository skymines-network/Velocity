plugins {
    `java-library`
    id("velocity-publish")
}
dependencies {
    implementation(libs.bundles.log4j)
    annotationProcessor(libs.log4j.core)
}