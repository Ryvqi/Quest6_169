package com.example.data.ui.view.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.R

@Preview(showBackground = true)
@Composable
fun mahasiswaFormView(){

    var nim by remember { mutableStateOf("") }
    var nama by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }

    var listData: MutableList<String> = mutableListOf(nim, nama, email)

    Column(modifier = Modifier
        .fillMaxSize()
        .background(color = colorResource(id = R.color.primary)),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.padding(16.dp))

        Row(modifier = Modifier
            .padding(40.dp),
            verticalAlignment = Alignment.CenterVertically) {
            Image(painter = painterResource(id = R.drawable.logo),
                contentDescription = "")
        }

        Spacer(modifier = Modifier.padding(start = 30.dp))

        Column {
            Text(text = "University of Muhammadiyah Yogyakarata",
                color = Color.Red,
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold
            )
            Text(text = "Unggul dan Islami",
                color = Color.Red,
                fontWeight = FontWeight.Light
            )
        }
    }

    Box(modifier = Modifier.fillMaxWidth()
        .background(color = Color.White,
            shape = RoundedCornerShape(
                topEnd = 15.dp,
                topStart = 15.dp
            )
        )) {
        Column(
            modifier = Modifier.padding(20.dp).fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Masukan data kamu",
                fontWeight = FontWeight.Bold,
                fontSize = 19.sp
            )
            Text(text = "Isi sesuai data yang kamu daftarkan",
                fontWeight = FontWeight.Light,
                fontSize = 19.sp
            )
        }
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(50.dp),
            value = nim,
            onValueChange = {nim = it},
            label = { Text(text = "Nomor Induk Mahasiswa") },
            leadingIcon = {
                Icon(
                    Icons.Filled.Info,
                    contentDescription = ""
                )
            },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Number,
                imeAction = ImeAction.Next
            ),
            singleLine = true,
        )

        Spacer(modifier = Modifier.padding(4.dp))

        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(50.dp),
            value = nama,
            onValueChange = {nama = it},
            label = { Text(text = "Masukan Nama Anda") },
            leadingIcon = {
                Icon(
                    Icons.Filled.Person,
                    contentDescription = ""
                )
            }
        )

        Spacer(modifier = Modifier.padding(4.dp))

        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(50.dp),
            value = email,
            onValueChange = {email = it},
            label = { Text(text = "Masukan Email Anda") },
            leadingIcon = {
                Icon(
                    Icons.Filled.Email,
                    contentDescription = ""
                )
            }
        )
    }
}