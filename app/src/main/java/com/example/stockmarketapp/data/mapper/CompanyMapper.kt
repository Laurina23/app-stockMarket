package com.example.stockmarketapp.data.mapper

import com.example.stockmarketapp.data.local.CompanyListingEntity
import com.example.stockmarketapp.domain.model.Company_Listing

fun CompanyListingEntity.toCompany_Listing(): Company_Listing {
    return Company_Listing(
        name = name,
        symbol = symbol,
        exchange = exchange
    )
}
fun Company_Listing.toCompanyListingEntity(): CompanyListingEntity {
    return CompanyListingEntity(
        name = name,
        symbol = symbol,
        exchange = exchange
    )
}