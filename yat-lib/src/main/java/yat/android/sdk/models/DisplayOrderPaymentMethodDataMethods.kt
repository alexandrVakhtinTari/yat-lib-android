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
package yat.android.sdk.models


import com.squareup.moshi.Json
import java.io.Serializable

/**
 * 
 * @param address 
 * @param amount 
 * @param currency 
 * @param title 
 */

data class DisplayOrderPaymentMethodDataMethods (
    @Json(name = "address")
    val address: kotlin.String,
    @Json(name = "amount")
    val amount: kotlin.Double,
    @Json(name = "currency")
    val currency: kotlin.String,
    @Json(name = "title")
    val title: kotlin.String
) : Serializable {
    companion object {
        private const val serialVersionUID: Long = 123
    }

}
