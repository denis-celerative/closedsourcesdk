package com.muuv.closedsdk.util

import com.muuv.spikesdk.util.SpikePhoneValidator

object PhoneValidatorFromSpike {

    fun validatePhone(phone: String?): Boolean {
        return SpikePhoneValidator.validatePhone(phone)
    }

    fun formatPhoneWithCountry(phone: String, countryISO: String): String? {
        return SpikePhoneValidator.formatPhoneWithCountry(phone, countryISO)
    }
}
