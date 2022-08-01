package dependencies

import org.gradle.api.artifacts.dsl.DependencyHandler
import dependencies.retrofit_okhttp.gson
import dependencies.retrofit_okhttp.okHttp
import dependencies.retrofit_okhttp.retrofit
import dependencies.kotlin.coroutine
import dependencies.android.vmLifecycle
import dependencies.android.androidX

fun DependencyHandler.appLibraries() {
    androidCore()
    materialDesign()
    testUnit()
    retrofit()
    okHttp()
    gson()
    coroutine()
    vmLifecycle()
    androidX()
    koinKotlin("3.1.6")
}