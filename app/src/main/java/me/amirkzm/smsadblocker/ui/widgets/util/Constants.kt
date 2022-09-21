package me.amirkzm.smsadblocker.ui.widgets.util

import androidx.compose.material.SnackbarHostState
import androidx.compose.runtime.compositionLocalOf

val LocalSnackbarHostState = compositionLocalOf<SnackbarHostState> {
    error("No SnackbarHostState provided")
}