package at.marki.moviedb.core.model

//REVIEW: not sure where this is coming from?
data class Inca(
    val srcLabelImageUrl: String?,
    val countryId: Long,
    val precipitationMaps: List<String>,
    val temperatureMaps: List<String>,
    val precipitationColorTable: List<String>,
    val temperatureColorTable: List<String>,
)
