package com.islamelmrabet.statsticsislam

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.islamelmrabet.statsticsislam.ui.theme.StatsticsIslamTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StatsticsIslamTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }
                Content()
            }
        }
    }
}

@Composable
fun Content() {
    var total by remember { mutableStateOf(0)}
    var people by remember { mutableStateOf(0)}
    var bicycle by remember { mutableStateOf(0)}
    var car by remember { mutableStateOf(0)}
    var scooter by remember { mutableStateOf(0)}
    total = people + bicycle + car + scooter

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "Estadisticas Islam",
            fontSize = 35.sp
        )
        Spacer(modifier = Modifier.height(30.dp))
        //FILA TOTAL
        Row(){
            Text(
                text = "Total: $total",
                fontSize = 35.sp
            )
            Spacer(modifier = Modifier.width(30.dp))
            Button(
                onClick = {

                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFE53935)
                )
            ) {
                Text(
                    "Reiniciar todos",
                    fontSize = 15.sp,
                    modifier = Modifier.padding(5.dp),
                )
            }
        }
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "Personas: ",
            fontSize = 20.sp
        )
        //FILA DE PERSONAS
        Spacer(modifier = Modifier.height(5.dp))
        Row(){
            Text(
                "$people",
                fontSize = 30.sp,
            )
            Spacer(modifier = Modifier.width(20.dp))
            Button(
                onClick = {
                    people++
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFE008f4c)
                )

            ) {
                Text(
                    "+1",
                    fontSize = 15.sp,
                    modifier = Modifier.padding(5.dp),
                )
            }
            Spacer(modifier = Modifier.width(30.dp))
            Button(
                onClick = {
                    people--
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFEf0b235)
                )

            ) {
                Text(
                    "-1",
                    fontSize = 15.sp,
                    modifier = Modifier.padding(5.dp),
                )
            }
            Spacer(modifier = Modifier.width(30.dp))
            Button(
                onClick = {
                    people = 0
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFE53935)
                )

            ) {
                Text(
                    "Reset",
                    fontSize = 15.sp,
                    modifier = Modifier.padding(5.dp),
                )
            }
        }
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "Patinetes: ",
            fontSize = 20.sp
        )
        //FILA DE PATINETES
        Spacer(modifier = Modifier.height(5.dp))
        Row(){
            Text(
                "$scooter",
                fontSize = 30.sp,
            )
            Spacer(modifier = Modifier.width(20.dp))
            Button(
                onClick = {
                    scooter++
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFE008f4c)
                )

            ) {
                Text(
                    "+1",
                    fontSize = 15.sp,
                    modifier = Modifier.padding(5.dp),
                )
            }
            Spacer(modifier = Modifier.width(30.dp))
            Button(
                onClick = {
                    scooter--
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFEf0b235)
                )

            ) {
                Text(
                    "-1",
                    fontSize = 15.sp,
                    modifier = Modifier.padding(5.dp),
                )
            }
            Spacer(modifier = Modifier.width(30.dp))
            Button(
                onClick = {
                    scooter = 0
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFE53935)
                )

            ) {
                Text(
                    "Reset",
                    fontSize = 15.sp,
                    modifier = Modifier.padding(5.dp),
                )
            }
        }
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "Bicicletas: ",
            fontSize = 20.sp
        )
        //FILA DE BICICLETAS
        Spacer(modifier = Modifier.height(5.dp))
        Row(){
            Text(
                "$bicycle",
                fontSize = 30.sp,
            )
            Spacer(modifier = Modifier.width(20.dp))
            Button(
                onClick = {
                    bicycle++
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFE008f4c)
                )

            ) {
                Text(
                    "+1",
                    fontSize = 15.sp,
                    modifier = Modifier.padding(5.dp),
                )
            }
            Spacer(modifier = Modifier.width(30.dp))
            Button(
                onClick = {
                    bicycle--
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFEf0b235)
                )

            ) {
                Text(
                    "-1",
                    fontSize = 15.sp,
                    modifier = Modifier.padding(5.dp),
                )
            }
            Spacer(modifier = Modifier.width(30.dp))
            Button(
                onClick = {
                    bicycle = 0
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFE53935)
                )

            ) {
                Text(
                    "Reset",
                    fontSize = 15.sp,
                    modifier = Modifier.padding(5.dp),
                )
            }
        }
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "Coches: ",
            fontSize = 20.sp
        )
        //FILA DE COCHES
        Spacer(modifier = Modifier.height(5.dp))
        Row(){
            Text(
                "$car",
                fontSize = 30.sp,
            )
            Spacer(modifier = Modifier.width(20.dp))
            Button(
                onClick = {
                    car++
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFE008f4c)
                )

            ) {
                Text(
                    "+1",
                    fontSize = 15.sp,
                    modifier = Modifier.padding(5.dp),
                )
            }
            Spacer(modifier = Modifier.width(30.dp))
            Button(
                onClick = {
                    car--
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFEf0b235)
                )

            ) {
                Text(
                    "-1",
                    fontSize = 15.sp,
                    modifier = Modifier.padding(5.dp),
                )
            }
            Spacer(modifier = Modifier.width(30.dp))
            Button(
                onClick = {
                    car = 0
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFE53935)
                )

            ) {
                Text(
                    "Reset",
                    fontSize = 15.sp,
                    modifier = Modifier.padding(5.dp),
                )
            }
        }
        //FILA DE ESTADISTICA
        Spacer(modifier = Modifier.height(10.dp))

        Text(
            "Estadisticas:",
            fontSize = 25.sp,
            modifier = Modifier.padding(10.dp),
        )
        Row(){
            Text(
                "Personas:",
                fontSize = 20.sp,
                modifier = Modifier.padding(5.dp),
            )
            Text(
                "Bicicletas:",
                fontSize = 20.sp,
                modifier = Modifier.padding(5.dp),
            )
        }
        Row {
            Text(
                "Patinetes:",
                fontSize = 20.sp,
                modifier = Modifier.padding(5.dp),
            )
            Text(
                "Coches:",
                fontSize = 20.sp,
                modifier = Modifier.padding(5.dp),
            )
        }
    }
}



@Composable
fun GreetingPreview() {
    StatsticsIslamTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            Content()
        }
    }
}