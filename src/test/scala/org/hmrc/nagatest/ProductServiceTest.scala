package org.hmrc.org.hmrc.nagatest

import org.hmrc.nagatest.{UnknownProductException, Product, ProductService}
import org.scalatest.FunSuite

/**
  * Created by npatinbanda on 24/04/2017.
  */
class ProductServiceTest extends FunSuite {

  val service = new ProductService

  test("product unit price") {
    assert(service.getUnitPrice(Product.Apple) == 0.6)
    assert(service.getUnitPrice(Product.Orange) == 0.25)
    val exception = intercept[UnknownProductException] {
      service.getUnitPrice("xyz")
    }
    assert(exception == UnknownProductException("xyz"))
  }

}
