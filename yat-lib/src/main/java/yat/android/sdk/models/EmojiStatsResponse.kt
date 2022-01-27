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
 * @param emojiId 
 * @param metrics 
 */

data class EmojiStatsResponse (
    @field:Json(name = "emoji_id")
    val emojiId: kotlin.String,
    @field:Json(name = "metrics")
    val metrics: kotlin.collections.List<EmojiStatsResponseMetrics>
) : Serializable {
    companion object {
        private const val serialVersionUID: Long = 123
    }

}

