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
 * @param pattern 
 * @param shape 
 */

data class EmojiListItemShape (
    @field:Json(name = "pattern")
    val pattern: kotlin.Any? = null,
    @field:Json(name = "shape")
    val shape: EmojiListItemShape.Shape? = null
) : Serializable {
    companion object {
        private const val serialVersionUID: Long = 123
    }

    /**
    * 
    * Values: repeaters,eyeHeart,bookends,adoptables
    */
    
    enum class Shape(val value: kotlin.String){
        @field:Json(name = "Repeaters") repeaters("Repeaters"),
        @field:Json(name = "Eye Heart") eyeHeart("Eye Heart"),
        @field:Json(name = "Bookends") bookends("Bookends"),
        @field:Json(name = "Adoptables") adoptables("Adoptables");
    }
}

