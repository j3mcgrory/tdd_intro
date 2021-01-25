package tdd

import org.scalatest.FunSpec
import org.scalatest.Matchers
import org.scalactic.source.Position.apply
import org.scalatest.Finders
import tdd.Password

class Password_Test extends FunSpec with Matchers {
  
   describe("A password checker") {
    describe("determines proper length") {
      it("rejects passwords without any digits") {
        val longEnough = "abcdef"
        val hasNumsMedium = "abc123"
        Password.isValid(longEnough) shouldBe false
        Password.isValid(hasNumsMedium) shouldBe true
      }
      it("rejects passwords that are less than 6 characters") {
        val hasNumsShort = "ab12"
        val hasNumsLong = "abcd1234"
        Password.isValid(hasNumsShort) shouldBe false     
        Password.isValid(hasNumsLong) shouldBe true
      }
    }
  }
}