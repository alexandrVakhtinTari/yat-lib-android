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
 * The specific Emoji ID that the user requests
 * @param availability The availability state of this emoji
 * @param available Whether the Emoji ID is available for purchase
 * @param emojiId Emoji ID in canonical form
 * @param flippableEmoji Which emoji are flippable
 * @param length Canonical EmojiID length in emojis
 * @param minted If this Emoji is minted
 * @param rhythmScore EmojiID rhythm score
 * @param shape 
 * @param shortNames Emoji key words
 * @param stats Total lookups using this API, if someone is viewing this Emoji ID  using their own self hosted node, it will not be counted here
 * @param copy EmojiID copy text
 * @param generation The generation of the Yat, if it has been purchased.
 * @param origin The origin of the Yat if it was from a Prism Case
 * @param price Pricing in US cents, e.g. 1024 is 10.24 USD.  Price is 0 if the emoji is not available
 */

data class SearchResultResult (
    /* The availability state of this emoji */
    @field:Json(name = "availability")
    val availability: SearchResultResult.Availability,
    /* Whether the Emoji ID is available for purchase */
    @field:Json(name = "available")
    val available: kotlin.Boolean,
    /* Emoji ID in canonical form */
    @field:Json(name = "emoji_id")
    val emojiId: kotlin.String,
    /* Which emoji are flippable */
    @field:Json(name = "flippable_emoji")
    val flippableEmoji: kotlin.collections.List<kotlin.Boolean>,
    /* Canonical EmojiID length in emojis */
    @field:Json(name = "length")
    val length: kotlin.Long,
    /* If this Emoji is minted */
    @field:Json(name = "minted")
    val minted: kotlin.Boolean,
    /* EmojiID rhythm score */
    @field:Json(name = "rhythm_score")
    val rhythmScore: kotlin.Long,
    @field:Json(name = "shape")
    val shape: EmojiListItemShape,
    /* Emoji key words */
    @field:Json(name = "short_names")
    val shortNames: kotlin.collections.List<kotlin.String>,
    /* Total lookups using this API, if someone is viewing this Emoji ID  using their own self hosted node, it will not be counted here */
    @field:Json(name = "stats")
    val stats: kotlin.collections.List<EmojiStatsResponseMetrics>,
    /* EmojiID copy text */
    @field:Json(name = "copy")
    val copy: kotlin.Any? = null,
    /* The generation of the Yat, if it has been purchased. */
    @field:Json(name = "generation")
    val generation: kotlin.Int? = null,
    /* The origin of the Yat if it was from a Prism Case */
    @field:Json(name = "origin")
    val origin: kotlin.String? = null,
    /* Pricing in US cents, e.g. 1024 is 10.24 USD.  Price is 0 if the emoji is not available */
    @field:Json(name = "price")
    val price: kotlin.Int? = null
) : Serializable {
    companion object {
        private const val serialVersionUID: Long = 123
    }

    /**
    * The availability state of this emoji
    * Values: available,taken,inCart,comingSoon,noPrice
    */
    
    enum class Availability(val value: kotlin.String){
        @field:Json(name = "Available") available("Available"),
        @field:Json(name = "Taken") taken("Taken"),
        @field:Json(name = "InCart") inCart("InCart"),
        @field:Json(name = "ComingSoon") comingSoon("ComingSoon"),
        @field:Json(name = "NoPrice") noPrice("NoPrice");
    }
}

