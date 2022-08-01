package dependencies.android

import org.gradle.api.artifacts.dsl.DependencyHandler
import dependencies.implementation

fun DependencyHandler.vmLifecycle() {
    implementation("androidx.lifecycle:lifecycle-extensions:2.2.0")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.2.0")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.2.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.2.0")
}