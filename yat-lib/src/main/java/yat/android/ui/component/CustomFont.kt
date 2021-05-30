/*
 * Copyright 2021 Yat Labs
 *
 * Redistribution and use in source and binary forms, with or
 * without modification, are permitted provided that the
 * following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above
 * copyright notice, this list of conditions and the following disclaimer in the
 * documentation and/or other materials provided with the distribution.
 *
 * 3. Neither the name of the copyright holder nor the names of
 * its contributors may be used to endorse or promote products
 * derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND
 * CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES,
 * INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 * NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE
 * OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package yat.android.ui.component

import android.content.Context
import android.graphics.Typeface
import java.util.*

enum class CustomFont(private val fileName: String) {

    ALLIANCE_BOLD("fonts/AllianceNo1-Bold.otf"),
    ALLIANCE_SEMI_BOLD("fonts/AllianceNo1-SemiBold.otf"),
    AVENIR_LT_STD_BLACK("fonts/AvenirLTStd-Black.otf"),
    AVENIR_LT_STD_HEAVY("fonts/AvenirLTStd-Heavy.otf"),
    AVENIR_LT_STD_MEDIUM("fonts/AvenirLTStd-Medium.otf"),
    AVENIR_NEXT_LT_PRO_REGULAR("fonts/AvenirNextLTPro-Regular.otf"),
    CIRCULAR_SPOTIFY_BOOK("fonts/CircularSpotifyTxT-Book.otf");

    companion object {
        fun fromString(fontName: String): CustomFont {
            return valueOf(fontName.uppercase(Locale.US))
        }
    }

    fun asTypeface(context: Context): Typeface {
        return Typeface.createFromAsset(context.assets, fileName)
    }

}