package com.umair.example

import io.flutter.embedding.android.FlutterActivity
import com.umair.beacons_plugin.BeaconsPlugin;

class MainActivity: FlutterActivity() {

    override fun onStart() {
        super.onStart()
        BeaconsPlugin.startBackgroundService(this)
    }
}
