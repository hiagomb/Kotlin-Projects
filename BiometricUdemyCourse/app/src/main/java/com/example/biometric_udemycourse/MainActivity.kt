package com.example.biometric_udemycourse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.biometric.BiometricPrompt
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(BiometricHelper.isAvailable(this)){

            val executor = ContextCompat.getMainExecutor(this)

            val bio = BiometricPrompt(this, executor, object : BiometricPrompt.AuthenticationCallback() {
                override fun onAuthenticationSucceeded(result: BiometricPrompt.AuthenticationResult) {
                    val s = ""
                    super.onAuthenticationSucceeded(result)
                }

                override fun onAuthenticationFailed() {
                    super.onAuthenticationFailed()
                }

                override fun onAuthenticationError(errorCode: Int, errString: CharSequence) {
                    super.onAuthenticationError(errorCode, errString)
                }
            })

            val info = BiometricPrompt.PromptInfo.Builder().setTitle("Titulo").setSubtitle("Subtitulo")
                .setDescription("Descrição").setNegativeButtonText("Cancelar").
                build()

            bio.authenticate(info)
        }
    }
}