package com.example.rappers.data

class DataSource {
     fun loadLetterList()  = ('A'..'Z').toMutableList()
     fun loadRapperList() = listOf<String>("nas", "rakim", "the notorious B.I.G.", "Jay-Z", "Eminem", "André 3000", "Kanye West", "Snoop Dogg", "Lil Wayne", "Kendrick Lamar", "Rick Ross",  "Twista")

     fun loadRapperByWord(word: String?) : List<String>{
          return loadRapperList().filter { it.startsWith(word ?: "A") }
     }
}