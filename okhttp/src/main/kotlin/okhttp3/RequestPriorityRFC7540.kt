package okhttp3

fun interface RequestPriorityRFC7540 {
  fun requestPriority(weight: Int)  // 1..256, default 16
}
