package org.hmrc.nagatest

/**
  * Created by npatinbanda on 24/04/2017.
  */
class CheckoutService(productService: ProductService) {

  def calculatePrice(basket: Basket) : BigDecimal =
    Option(basket).map(b => b.items.map(i => productService.getPriceWithOffer(i.product, i.quantity)).sum).getOrElse(0)
}
