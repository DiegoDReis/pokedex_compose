plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
}

apply {
    from("$rootDir/plugins/android-commons.gradle")
}

android {
    namespace = "com.example.pokedex"

    defaultConfig {
        applicationId = "com.example.pokedex"
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
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