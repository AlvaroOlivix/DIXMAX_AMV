package com.example.dixmax_amv.features.enlace.data.local

import com.example.dixmax_amv.features.enlace.domain.Link

fun Link.toEntity(): LinkEntity {
    return LinkEntity(id = this.id, name = this.name, ticket = this.ticket, options = this.options)
}

fun LinkEntity.toDomain(): Link {
    return Link(id = this.id, name = this.name, ticket = this.ticket, options = this.options)
}

