plugins {
    alias(libs.plugins.moviedb.android.feature)
    alias(libs.plugins.moviedb.android.library.compose)
}

android {
    compileSdk = 34
    namespace = "at.marki.moviedb.feature.details"
}

dependencies {
    implementation(projects.core.common)
    implementation(projects.core.designsystems)

    implementation(libs.coil.kt.compose)
    implementation(libs.kotlinx.datetime)
}
