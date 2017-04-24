package org.hmrc.nagatest

import org.hmrc.nagatest.{Basket, BasketItem, ProductService, CheckoutService}
import org.hmrc.nagatest.Product._
import org.scalatest.FunSuite

/**
  * Created by npatinbanda on 24/04/2017.
  */
class CheckoutServiceTest extends FunSuite {

  val service = new CheckoutService(new ProductService)

  test("calculate price") {
    val basket = Basket(List(BasketItem(Apple, 3), BasketItem(Orange, 7)))
    /* should charge for 2 apples and 5 Oranges */
    assert(service.calculatePrice(basket) == 2.45)
  }

  test("calculate price for empty basket") {
    val basket = Basket(List())
    assert(service.calculatePrice(basket) == 0)
  }

}
