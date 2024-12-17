static void taskGroovy(String[] args) {
  def list = [1, 3, 4, 5, 1, 5, 4]
  def counts = [:]
  list.each { counts[it] = (counts[it] ?: 0) + 1 }
  counts
}