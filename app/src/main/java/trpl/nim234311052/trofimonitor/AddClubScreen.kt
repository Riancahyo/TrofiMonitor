package trpl.nim234311052.trofimonitor

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddClubScreen(onClubAdded: (Club) -> Unit) {
    var clubName by remember { mutableStateOf(TextFieldValue("")) }
    var premierLeague by remember { mutableStateOf(TextFieldValue("")) }
    var faCup by remember { mutableStateOf(TextFieldValue("")) }
    var eflCup by remember { mutableStateOf(TextFieldValue("")) }
    var championsLeague by remember { mutableStateOf(TextFieldValue("")) }
    var europaLeague by remember { mutableStateOf(TextFieldValue("")) }

    Surface(
        modifier = Modifier.fillMaxWidth(),
        color = MaterialTheme.colorScheme.background
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Tambahkan Klub Baru",
                fontSize = 24.sp,
                modifier = Modifier.padding(bottom = 24.dp),
                color = MaterialTheme.colorScheme.primary
            )

            OutlinedTextField(
                value = clubName,
                onValueChange = { clubName = it },
                label = { Text("Nama Klub") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp),
                shape = RoundedCornerShape(8.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = MaterialTheme.colorScheme.primary,
                    unfocusedBorderColor = MaterialTheme.colorScheme.outline
                )
            )

            OutlinedTextField(
                value = premierLeague,
                onValueChange = { premierLeague = it },
                label = { Text("Jumlah Premier League") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp),
                shape = RoundedCornerShape(8.dp),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = MaterialTheme.colorScheme.primary,
                    unfocusedBorderColor = MaterialTheme.colorScheme.outline
                )
            )

            OutlinedTextField(
                value = faCup,
                onValueChange = { faCup = it },
                label = { Text("Jumlah FA Cup") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp),
                shape = RoundedCornerShape(8.dp),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = MaterialTheme.colorScheme.primary,
                    unfocusedBorderColor = MaterialTheme.colorScheme.outline
                )
            )

            OutlinedTextField(
                value = eflCup,
                onValueChange = { eflCup = it },
                label = { Text("Jumlah EFL Cup") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp),
                shape = RoundedCornerShape(8.dp),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = MaterialTheme.colorScheme.primary,
                    unfocusedBorderColor = MaterialTheme.colorScheme.outline
                )
            )

            OutlinedTextField(
                value = championsLeague,
                onValueChange = { championsLeague = it },
                label = { Text("Jumlah Champions League") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp),
                shape = RoundedCornerShape(8.dp),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = MaterialTheme.colorScheme.primary,
                    unfocusedBorderColor = MaterialTheme.colorScheme.outline
                )
            )

            OutlinedTextField(
                value = europaLeague,
                onValueChange = { europaLeague = it },
                label = { Text("Jumlah Europa League") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 24.dp),
                shape = RoundedCornerShape(8.dp),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = MaterialTheme.colorScheme.primary,
                    unfocusedBorderColor = MaterialTheme.colorScheme.outline
                )
            )

            Button(
                onClick = {
                    val club = Club(
                        name = clubName.text,
                        premierLeague = premierLeague.text.toIntOrNull() ?: 0,
                        faCup = faCup.text.toIntOrNull() ?: 0,
                        eflCup = eflCup.text.toIntOrNull() ?: 0,
                        championsLeague = championsLeague.text.toIntOrNull() ?: 0,
                        europaLeague = europaLeague.text.toIntOrNull() ?: 0
                    )
                    onClubAdded(club)
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp),
                shape = RoundedCornerShape(8.dp)
            ) {
                Text("Tambah Klub", fontSize = 16.sp)
            }
        }
    }
}