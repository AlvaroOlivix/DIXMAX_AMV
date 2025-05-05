package com.example.dixmax_amv.features.enlace.data.remote

import com.example.dixmax_amv.features.enlace.domain.Link
import com.example.dixmax_amv.features.enlace.domain.Option
import org.koin.core.annotation.Single

@Single
class LinkRemoteMockDataSource {

    private val options = listOf(
        Option("020", "PowVideo", "720p"),
        Option("021", "PowVideo", "1080p"),
        Option("010", "StreamVideo", "1080p"),
        Option("011", "StreamVideo", "720p"),
        Option("030", "LoadTrial", "720p"),
        Option("031", "LoadTrial", "480p"),

        )
    private val links = listOf(
        Link("01", "Link1", "#20", options = listOf(options[1], options[2])),
        Link("02", "Link2", "#21", options),
        Link("03", "Link3", "#22", options = listOf(options[0], options[3], options[5])),
        Link("04", "Link4", "#23", options = listOf(options[0], options[1])),
        Link("05", "Link5", "#24", options),
        Link("01", "Link6", "#20", options = listOf(options[1], options[2])),
        Link("02", "Link7", "#21", options),
        Link("03", "Link8", "#22", options = listOf(options[0], options[3], options[5])),
        Link("04", "Link9", "#23", options = listOf(options[0], options[1])),
        Link("05", "Link10", "#24", options)
    )

    fun getAllLinks(): List<Link> {
        return links
    }

    fun getLikById(linkId: String): Link? {
        return links.find { it.id == linkId }
    }

}