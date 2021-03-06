/*
 * Copyright (c) 2020 Proton Technologies AG
 * 
 * This file is part of ProtonMail.
 * 
 * ProtonMail is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * ProtonMail is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with ProtonMail. If not, see https://www.gnu.org/licenses/.
 */
package ch.protonmail.android.utils.extensions

import android.content.Context
import androidx.annotation.ColorRes
import androidx.core.content.ContextCompat

/*
 * Compatibility extensions for brevity purpose.
 * E.g. `ContextCompat.getColor( context, colorRes )` -> `context.getColorCompat( colorRes )`
 */

/**
 * @return color [Int]
 * @see ContextCompat.getColor
 */
fun Context.getColorCompat( @ColorRes colorRes: Int ) = ContextCompat.getColor( this, colorRes )