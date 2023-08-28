package app.cash.paparazzi

sealed interface ImageScaleConfig {
  data object Original : ImageScaleConfig
  data class Limit(val maxSize: Int) : ImageScaleConfig
}
