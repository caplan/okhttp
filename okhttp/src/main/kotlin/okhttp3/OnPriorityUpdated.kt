package okhttp3

fun interface OnPriorityUpdated {
  fun onPriorityUpdated(weight: Int)

  companion object {
    val NOOP = OnPriorityUpdated {}
  }
}