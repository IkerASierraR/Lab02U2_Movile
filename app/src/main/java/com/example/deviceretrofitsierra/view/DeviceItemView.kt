package com.example.deviceretrofitsierra.view

import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import com.example.deviceretrofitsierra.data.Device

@Composable
fun DeviceItemView(device: Device){

    Row(verticalAlignment = Alignment.CenterVertically) {
        Icon(imageVector = vector)

    }
}