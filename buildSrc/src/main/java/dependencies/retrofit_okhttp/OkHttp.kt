package dependencies.retrofit_okhttp

import dependencies.implementation
import org.gradle.api.artifacts.dsl.DependencyHandler


fun DependencyHandler.okHttp() {
    implementation("com.squareup.okhttp3:okhttp:+")
}
