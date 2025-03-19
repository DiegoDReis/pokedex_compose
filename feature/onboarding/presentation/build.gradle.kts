plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
}
apply {
    from("$rootDir/plugins/android-commons.gradle")
}

android {
    namespace = "com.example.pokedex.feature.onboarding.presentation"
}

dependencies {

    implementation(project(Module.designSystem))

    debugImplementation(Internal.androidxUiTooling)
    debugImplementation(Internal.androidxUiTestManifest)

    testImplementation(Test.junit)
    androidTestImplementation(Test.androidxJunit)
    androidTestImplementation(Test.androidxEspressoCore)
    androidTestImplementation(platform(Internal.androidxComposeBom))
    androidTestImplementation(Test.androidxUiTestJunit4)
}