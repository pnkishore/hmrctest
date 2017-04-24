package org.hmrc.test

import org.hmrc.test.Product._
import org.scalatest.FunSuite

/**
  * Created by npatinbanda on 24/04/2017.
  */
class CheckoutServiceTest extends FunSuite {

  val service = new CheckoutService(new ProductService)

  test("calculate price") {
    val basket = Basket(List(BasketItem(Apple, 2), BasketItem(Orange, 3)))
    assert(service.calculatePrice(basket) == 1.95)
  }

  test("calculate price for empty basket") {
    val basket = Basket(List())
    assert(service.calculatePrice(basket) == 0)
  }

}
