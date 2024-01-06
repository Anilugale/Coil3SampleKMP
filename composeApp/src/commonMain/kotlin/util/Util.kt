package util

import androidx.compose.ui.graphics.Color

fun String.toComposeColor():Color{
    return Color(("ff" + this.removePrefix("#").lowercase()).toLong(16))
}
