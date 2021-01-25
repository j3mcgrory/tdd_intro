package tdd

import org.scalatest.FunSpec
import org.scalatest.Matchers
import org.scalactic.source.Position.apply
import org.scalatest.Finders
import tdd.Password

class Password_Test extends FunSpec with Matchers {
  
   describe("A password checker") {
    describe("determines proper length") {
      it("rejects passwords that are less than 6 characters") {

        val tooShort = "abcde"
        val longEnough = "abcdef"        
        val evenLonger = "abcdefghi"        

        Password.isValid(tooShort) shouldBe false
        Password.isValid(longEnough) shouldBe true
        Password.isValid(evenLonger) shouldBe true
      }   
    }
  }
}