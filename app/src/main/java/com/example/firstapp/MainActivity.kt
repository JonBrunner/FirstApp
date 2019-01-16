package com.example.firstapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

// MainAct is name of the current activity
// : is extending to AppCompatActivity
// Every ACTIVITY is a single page in an application

/*
Java folder is logic/methodology of the application while the res folder contains the visuals/UI/audio files
Application Name is what appears on Play Store / App Store
Application Name can be change at anytime

FirstApp         Project is the parent project, with sub-projects and files
app              is a sub-project or module
res              contains the ui resources, example layouts, images, audio files, ect.
res/drawable     image and vector assets
res/mipmap       launcher icon stored here
res/values       app styles and themes, color details, local strings
AndroidManifest  Contains app component details, Activity declarations, Service,
                 BroadCastReceiver, Content Provider, NECESSARY PERMISSIONS DEFINED
build.gradle     Build configuration, Plugins used, external libraries or dependencies used in app
 */

/*
Android composed of:
Activities, Broadcast Receiver, Service and Content Provider
Each declared in the AndroidManifest.xml
 */

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}
