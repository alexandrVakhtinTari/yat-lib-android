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
 * Payment address response for crypto and token payment data
 * @param address The payment address
 * @param category The category of this address
 * @param default Optional: Is this address the default address for the category
 * @param description Optional: Description of the address
 * @param longName Optional: CryptoToken long name is a defined name for the ERC20 token
 * @param settlementNetwork Optional: CryptoToken settlement network for the ERC20 token
 * @param shortName Optional: CryptoToken short name to identify an ERC20 token
 * @param signature Optional: Proof of ownership signature for the address
 */

data class PaymentAddressResponseResult (
    /* The payment address */
    @field:Json(name = "address")
    val address: kotlin.String,
    /* The category of this address */
    @field:Json(name = "category")
    val category: kotlin.String,
    /* Optional: Is this address the default address for the category */
    @field:Json(name = "default")
    val default: kotlin.Boolean,
    /* Optional: Description of the address */
    @field:Json(name = "description")
    val description: kotlin.String? = null,
    /* Optional: CryptoToken long name is a defined name for the ERC20 token */
    @field:Json(name = "long_name")
    val longName: kotlin.String? = null,
    /* Optional: CryptoToken settlement network for the ERC20 token */
    @field:Json(name = "settlement_network")
    val settlementNetwork: kotlin.String? = null,
    /* Optional: CryptoToken short name to identify an ERC20 token */
    @field:Json(name = "short_name")
    val shortName: kotlin.String? = null,
    /* Optional: Proof of ownership signature for the address */
    @field:Json(name = "signature")
    val signature: kotlin.String? = null
) : Serializable {
    companion object {
        private const val serialVersionUID: Long = 123
    }

}

