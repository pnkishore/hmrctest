package org.hmrc.nagatest

/**
  * Created by npatinbanda on 24/04/2017.
  */
case class UnknownProductException(productName: String) extends Exception("Unknown Product - " + productName)
