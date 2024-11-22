package com.example.data.ui.view.screen

import android.widget.Button
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.R
import com.example.data.model.Mahasiswa
import com.example.data.model.RencanaStudi

@Composable
fun TampilDataView(
    mahasiswa: Mahasiswa,
    krs: RencanaStudi,
    onClickButton: () -> Unit
){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = colorResource(id = R.color.primary))
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "",
                modifier = Modifier
                    .clip(shape = CircleShape)
                    .size(50.dp)
            )
            Spacer(modifier = Modifier.padding(start = 16.dp))
            Column(modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = mahasiswa.nama,
                    fontWeight = FontWeight.Bold,
                    fontSize = 15.sp,
                    color = Color.White
                )
                Text(
                    text = mahasiswa.nim,
                    fontWeight = FontWeight.Light,
                    fontSize = 12.sp,
                    color = Color.White
                )
            }
            Box {
                Icon(
                    Icons.Filled.Notifications,
                    contentDescription = "",
                    tint = Color.White
                )
            }
        }
        Box(modifier = Modifier.background(
            color = Color.White,
            shape = RoundedCornerShape(
                topEnd = 15.dp,
                topStart = 15.dp
            )
        )
            .fillMaxSize()
        ){
            Column(modifier = Modifier
                .fillMaxSize()
            ) {
                TampilDataview(
                    judul = "NIM",
                    isinya = mahasiswa.nim
                )
                TampilDataview(
                    judul = "Nama",
                    isinya = mahasiswa.nama
                )
                TampilDataview(
                    judul = "Email",
                    isinya = mahasiswa.email
                )
                TampilDataview(
                    judul = "Nama matkul",
                    isinya = krs.namaMK
                )
                TampilDataview(
                    judul = "Kelas",
                    isinya = krs.kelas
                )
                Spacer(modifier = Modifier.padding(start = 16.dp))
                Button(
                    onClick = {onClickButton() },
                    modifier = Modifier .padding(16.dp)
                ) {
                    Text(text = "Kembali")
                }
            }
        }
    }
}

@Composable
fun TampilDataview(
    judul: String,
    isinya: String
){
    Row(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(judul, modifier = Modifier .weight(0.8f))
        Text(":", modifier = Modifier .weight(0.2f))
        Text(isinya, modifier = Modifier .weight(2f))
    }
}