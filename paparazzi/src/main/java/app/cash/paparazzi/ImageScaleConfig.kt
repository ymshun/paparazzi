package app.cash.paparazzi

sealed interface ImageScaleConfig {
  object Original : ImageScaleConfig
  data class Limit(val maxSize: Int) : ImageScaleConfig
}
