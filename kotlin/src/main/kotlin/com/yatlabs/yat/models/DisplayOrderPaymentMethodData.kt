/**
* Emoji ID API server
* Emoji ID is a directory service that associates almost any type of structured data with a short, memorable identifier the emoji id.
*
* The version of the OpenAPI document: 0.2.262
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package com.yatlabs.yat.models

import com.yatlabs.yat.models.DisplayOrderPaymentMethodDataMethods

import com.squareup.moshi.Json
import java.io.Serializable

/**
 * Payment method data for payment methods that provide QR code checkout options set via checkout.
 * @param clientSecret Client Secret for the `Stripe` method for Elements and Checkout
 * @param method Payment method
 * @param methods Metadata for `CoinbaseCommerce` payment method
 * @param paymentIntentId Payment method ID for `Stripe` method
 * @param cancelUrl Cancel url for `Stripe` method when using Checkout
 * @param invoiceId Invoice ID for the `Stripe` method for Elements
 * @param sessionId Invoice ID for the `Stripe` method for Checkout
 * @param successUrl Success url for `Stripe` method when using Checkout
 */

data class DisplayOrderPaymentMethodData (
    /* Client Secret for the `Stripe` method for Elements and Checkout */
    @Json(name = "client_secret")
    val clientSecret: kotlin.String,
    /* Payment method */
    @Json(name = "method")
    val method: DisplayOrderPaymentMethodData.Method,
    /* Metadata for `CoinbaseCommerce` payment method */
    @Json(name = "methods")
    val methods: kotlin.collections.List<DisplayOrderPaymentMethodDataMethods>,
    /* Payment method ID for `Stripe` method */
    @Json(name = "payment_intent_id")
    val paymentIntentId: kotlin.String,
    /* Cancel url for `Stripe` method when using Checkout */
    @Json(name = "cancel_url")
    val cancelUrl: kotlin.String? = null,
    /* Invoice ID for the `Stripe` method for Elements */
    @Json(name = "invoice_id")
    val invoiceId: kotlin.String? = null,
    /* Invoice ID for the `Stripe` method for Checkout */
    @Json(name = "session_id")
    val sessionId: kotlin.String? = null,
    /* Success url for `Stripe` method when using Checkout */
    @Json(name = "success_url")
    val successUrl: kotlin.String? = null
) : Serializable {
    companion object {
        private const val serialVersionUID: Long = 123
    }

    /**
    * Payment method
    * Values: coinbaseCommerce,stripe
    */
    
    enum class Method(val value: kotlin.String){
        @Json(name = "CoinbaseCommerce") coinbaseCommerce("CoinbaseCommerce"),
        @Json(name = "Stripe") stripe("Stripe");
    }
}
