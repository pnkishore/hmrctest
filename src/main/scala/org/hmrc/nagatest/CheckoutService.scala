package hmrctest

/**
  * Created by npatinbanda on 24/04/2017.
  */
class CheckoutService(productService: ProductService) {

  def calculatePrice(basket: Basket) : BigDecimal =
    Option(basket).map(b => b.items.map(i => productService.getUnitPrice(i.product) * i.quantity).sum).getOrElse(0)
}
