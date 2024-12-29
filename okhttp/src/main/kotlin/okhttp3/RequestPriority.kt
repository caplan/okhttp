package okhttp3

interface RequestPriority {
  var priority: Int  // 1..256, default 16
}
