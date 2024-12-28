package okhttp3

fun interface RequestPriorityUpdateRFC9218 {
  // urgency must be 0..7
  fun requestPriorityUpdate(urgency: Int, incremental: Boolean)
}
