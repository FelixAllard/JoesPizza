# Joe's Pizza Android App

This project is a simple Android application developed with Kotlin and XML for UI design. It's structured around a 3-step navigation flow: selecting takeout or delivery, making a pizza selection from predefined options, and reviewing the order before confirmation. The app demonstrates basic usage of `ViewPager2` for swipeable screens and `Fragment` for modular UI components.

## Getting Started

To run this project, clone the repository and open it in Android Studio. Ensure you have the latest version of Android Studio and the Android SDK installed.

### Prerequisites

This project uses the AndroidX libraries, so make sure your development environment is set up for AndroidX. The application is built with the following dependencies (included in the `build.gradle` file):

```
dependencies {
    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.fragment:fragment-ktx:1.3.6")
    implementation("androidx.viewpager2:viewpager2:1.0.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}
```

### Installation

1.  Clone the repository to your local machine.
2.  Open the project in Android Studio.
3.  Wait for Android Studio to resolve dependencies and set up the project.
4.  Run the project on an emulator or a physical device.

## Architecture

The app's main activity (`MainActivity.kt`) sets up a `ViewPager2` widget that hosts three fragments:

- `SelectTypeFragment`: Allows the user to choose between takeout or delivery.
- `PizzaSelectionFragment`: Placeholder for pizza selection.
- `ReviewOrderFragment`: Placeholder for order review and confirmation.

Each fragment represents a step in the order process and can be navigated by swiping left or right.

## Manifest

The Android Manifest includes the necessary configuration for the app, including the declaration of `MainActivity` as the entry point.

```xml
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <application
        android:allowBackup="true"
        android:dataExtractionRules="@xml/data_extraction_rules"
        android:fullBackupContent="@xml/backup_rules"
        android:icon="@mipmap/ic_launcher"
        android:label="@string/app_name"
        android:roundIcon="@mipmap/ic_launcher_round"
        android:supportsRtl="true"
        android:theme="@style/Theme.JoesPizza"
        tools:targetApi="31">
        <activity
            android:name=".MainActivity"
            android:exported="true"
            android:label="@string/app_name"
            android:theme="@style/Theme.AppCompat.Light.NoActionBar">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />

                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>
    </application>
</manifest>
```

## Conclusion

This basic Android application is designed to provide a straightforward example of using `ViewPager2` with fragments for a multi-step user interface. Feel free to download, explore, and modify the project to better understand Android development with Kotlin and XML layouts.
