package tdd

object Password {
  def isValid(password: String): Boolean = {
    return password.length > 5 && password.exists(_.isDigit)
  }
}