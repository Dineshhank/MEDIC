package com.example.medic

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity
import io.agora.rtc.RtcEngine
import io.agora.rtc.video.VideoCanvas

class Videocallactivity :AppCompatActivity {
    private var mCallBtn: ImageView? =null
    private var mMuteBtn: ImageView? =null
    private var mSwitchCameraBtn: ImageView? =null
    private var mCallEnd = false
    private var mLocalVideo: VideoCanvas? = null
    private var mRemoteVideo: VideoCanvas? = null
    private var mLocalContainer: FrameLayout? =null
    private var mRemoteContainer: RelativeLayout? =null
    private var mRtcEngine: RtcEngine?=null
    private var channelName: String?=null
    private var token: String? =null

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_videocallactivity)
    }
}