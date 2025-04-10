package com.example.dixmax_amv.features.serie.data.remote

import com.example.dixmax_amv.features.serie.domain.Category
import com.example.dixmax_amv.features.serie.domain.Serie
import org.koin.core.annotation.Single

@Single
class MockSeriesRemoteDataSource {
    private val categories = listOf(
        Category("001", "Ciendia Ficción"),
        Category("002", "Fantasía"),
        Category("003", "Drama"),
        Category("004", "Crítica Social")
    )
    private val series = listOf(
        Serie(
            "01",
            "The Punisher",
            categories = listOf(categories[0], categories[1]),
            "2018",
            "E.E.U.U.",
            "+15",
            "3 Temporadas",
            "https://th.bing.com/th/id/OIP.G72jUGarVeiY9dMZVten-AHaLH?w=203&h=304&c=7&r=0&o=5&pid=1.7",
            "8.6",false
        ),
        Serie(
            "02",
            "The Walking Dead",
            categories = listOf(categories[0], categories[2]),
            "2010",
            "E.E.U.U.",
            "+18",
            "11 Temporadas",
            "https://th.bing.com/th/id/OIP.Z4ZsYFMdPY7CYsNBRgvk9AHaLH?w=203&h=304&c=7&r=0&o=5&pid=1.7",
            "8.4",false
        ),
        Serie(
            "03",
            "Stranger Things",
            categories = listOf(categories[2], categories[3]),
            "2015",
            "E.E.U.U.",
            "+18",
            "4 Temporadas",
            "https://th.bing.com/th/id/OIP.3C9NaO9TQ16LKgs0WVUPIgHaK9?w=205&h=304&c=8&rs=1&qlt=90&o=6&pid=3.1&rm=2",
            "8.0",false
        ),
        Serie(
            "04",
            "Arcane",
            categories = listOf(categories[2], categories[3]),
            "2020",
            "E.E.U.U.",
            "+18",
            "2 Temporadas",
            "https://th.bing.com/th/id/OIP.7m43hGDVESVKrMvcokXI3AHaJl?w=186&h=241&c=7&r=0&o=5&pid=1.7",
            "9.6",false
        ), Serie(
            "05",
            "Atack on Titan",
            categories = listOf(categories[2], categories[3]),
            "2020",
            "E.E.U.U.",
            "+18",
            "4 Temporadas",
            "https://th.bing.com/th/id/OIP.Vk7QJI4mhETuDF8a6TF08wHaKf?w=203&h=287&c=7&r=0&o=5&pid=1.7",
            "9.0",false
        ),
        Serie(
            "06",
            "The Punisher",
            categories = listOf(categories[0], categories[1]),
            "2018",
            "E.E.U.U.",
            "+15",
            "3 Temporadas",
            "https://th.bing.com/th/id/OIP.G72jUGarVeiY9dMZVten-AHaLH?w=203&h=304&c=7&r=0&o=5&pid=1.7",
            "8.6",false
        ),
        Serie(
            "07",
            "The Walking Dead",
            categories = listOf(categories[0], categories[2]),
            "2010",
            "E.E.U.U.",
            "+18",
            "11 Temporadas",
            "https://th.bing.com/th/id/OIP.Z4ZsYFMdPY7CYsNBRgvk9AHaLH?w=203&h=304&c=7&r=0&o=5&pid=1.7",
            "8.4",false
        ),
        Serie(
            "08",
            "Stranger Things",
            categories = listOf(categories[2], categories[3]),
            "2015",
            "E.E.U.U.",
            "+18",
            "4 Temporadas",
            "https://th.bing.com/th/id/OIP.3C9NaO9TQ16LKgs0WVUPIgHaK9?w=205&h=304&c=8&rs=1&qlt=90&o=6&pid=3.1&rm=2",
            "8.0",false
        ),
        Serie(
            "09",
            "Arcane",
            categories = listOf(categories[2], categories[3]),
            "2020",
            "E.E.U.U.",
            "+18",
            "2 Temporadas",
            "https://th.bing.com/th/id/OIP.7m43hGDVESVKrMvcokXI3AHaJl?w=186&h=241&c=7&r=0&o=5&pid=1.7",
            "9.6",false
        ), Serie(
            "10",
            "Atack on Titan",
            categories = listOf(categories[2], categories[3]),
            "2020",
            "E.E.U.U.",
            "+18",
            "4 Temporadas",
            "https://th.bing.com/th/id/OIP.Vk7QJI4mhETuDF8a6TF08wHaKf?w=203&h=287&c=7&r=0&o=5&pid=1.7",
            "9.0",false
        ),
        Serie(
            "11",
            "The Punisher",
            categories = listOf(categories[0], categories[1]),
            "2018",
            "E.E.U.U.",
            "+15",
            "3 Temporadas",
            "https://th.bing.com/th/id/OIP.G72jUGarVeiY9dMZVten-AHaLH?w=203&h=304&c=7&r=0&o=5&pid=1.7",
            "8.6",false
        ),
        Serie(
            "12",
            "The Walking Dead",
            categories = listOf(categories[0], categories[2]),
            "2010",
            "E.E.U.U.",
            "+18",
            "11 Temporadas",
            "https://th.bing.com/th/id/OIP.Z4ZsYFMdPY7CYsNBRgvk9AHaLH?w=203&h=304&c=7&r=0&o=5&pid=1.7",
            "8.4",false
        ),
        Serie(
            "13",
            "Stranger Things",
            categories = listOf(categories[2], categories[3]),
            "2015",
            "E.E.U.U.",
            "+18",
            "4 Temporadas",
            "https://th.bing.com/th/id/OIP.3C9NaO9TQ16LKgs0WVUPIgHaK9?w=205&h=304&c=8&rs=1&qlt=90&o=6&pid=3.1&rm=2",
            "8.0",false
        ),
        Serie(
            "14",
            "Arcane",
            categories = listOf(categories[2], categories[3]),
            "2020",
            "E.E.U.U.",
            "+18",
            "2 Temporadas",
            "https://th.bing.com/th/id/OIP.7m43hGDVESVKrMvcokXI3AHaJl?w=186&h=241&c=7&r=0&o=5&pid=1.7",
            "9.6",false
        ), Serie(
            "15",
            "Atack on Titan",
            categories = listOf(categories[2], categories[3]),
            "2020",
            "E.E.U.U.",
            "+18",
            "4 Temporadas",
            "https://th.bing.com/th/id/OIP.Vk7QJI4mhETuDF8a6TF08wHaKf?w=203&h=287&c=7&r=0&o=5&pid=1.7",
            "9.0",false
        )
    )


    fun getSeries(): List<Serie> {
        return series
    }

    fun getSerieById(serieId: String): Serie? {
        return series.find { it.id == serieId }
    }

}