package com.muuv.closedsdk.util

import android.telephony.PhoneNumberUtils

object ClosedSourcePhoneValidator {

    fun validatePhone(phone: String?): Boolean {
        if (phone == null) return false
        return (phone.matches(Regex("^[+]+[0-9]{10,14}")))
    }

    fun formatPhoneWithCountry(phone: String, countryISO: String): String? {
        return PhoneNumberUtils.formatNumber(phone, countryISO)
    }
}
