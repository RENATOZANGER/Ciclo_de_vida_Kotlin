package com.example.imcapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Lifecycle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.w("Lifecycle","CREATE- estou criando a tela")
        finish()
    }

    override fun onStart() {
        super.onStart()
        Log.w("Lifecycle","START- deixei a tela visivel para vc")
    }

    override fun onResume() {
        super.onResume()
        Log.w("Lifecycle","RESUME- agora vc pode interagir com ela")
    }

    override fun onPause() {
        super.onPause()
        Log.w("Lifecycle","PAUSE- a tela perdeu o foco, vc nao pode mais interagir com ela")
    }

    override fun onStop() {
        super.onStop()
        Log.w("Lifecycle","STOP- a tela nao esta mais visivel mas ainda existe")
    }

    override fun onRestart() {
        super.onRestart()
        Log.w("Lifecycle","RESTART- a tela esta retomando o foco")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.w("Lifecycle","DESTROY- a tela foi destruida")
    }
}