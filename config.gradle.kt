android {
    compileSdkVersion 29
    buildToolsVersion "29.0.3"

    defaultConfig {
        minSdkVersion 21
        targetSdkVersion 29
        versionCode 1
        versionName "1.0"
        testInstrumentationRunner "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles "consumer-rules.pro"
    }
    buildTypes {
        release {
            minifyEnabled false
            proguardFiles getDefaultProguardFile ('proguard-android-optimize.txt'), 'proguard-rules.pro'
        }
    }
}