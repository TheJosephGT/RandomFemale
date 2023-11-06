package com.example.randomperson.ui.theme.Person

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.randomperson.data.remote.dto.PersonDTO

@Composable
fun Consult(persons: List<PersonDTO>) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Text(text = "Lista de mujeres", style = MaterialTheme.typography.titleMedium)

        Spacer(modifier = Modifier.height(16.dp))

        LazyColumn(modifier = Modifier.fillMaxWidth()) {
            items(persons) { person ->
                PersonItem(person)
            }
        }
    }
}

@Composable
fun PersonItem(person: PersonDTO) {
    Box(
        modifier = Modifier.fillMaxSize().wrapContentSize()
    ){
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text(text = "Nombre: " + person.name.title, style = MaterialTheme.typography.titleMedium)
            Text(text = "Fecha: " + person.name.first, style = MaterialTheme.typography.titleMedium)
            Text(text = "Rnc: " + person.nat, style = MaterialTheme.typography.titleMedium)
        }
    }
}