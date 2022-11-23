package com.example.biometric_udemycourse

import android.content.Context
import android.os.Build
import androidx.biometric.BiometricManager
import androidx.biometric.BiometricManager.Authenticators.BIOMETRIC_STRONG

class BiometricHelper {

    companion object{
        fun isAvailable(context: Context): Boolean{
            if(Build.VERSION.SDK_INT < 23){
                return false
            }

            val biometricManager = BiometricManager.from(context)
            when (biometricManager.canAuthenticate(BIOMETRIC_STRONG)){
                BiometricManager.BIOMETRIC_SUCCESS -> return true
                BiometricManager.BIOMETRIC_ERROR_NO_HARDWARE -> return false
                BiometricManager.BIOMETRIC_ERROR_HW_UNAVAILABLE -> return false
                BiometricManager.BIOMETRIC_ERROR_NONE_ENROLLED -> return false
            }

            return false
        }
    }
}