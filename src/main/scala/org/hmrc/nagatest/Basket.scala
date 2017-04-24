package hmrctest

/**
  * Created by npatinbanda on 24/04/2017.
  */
case class Basket(items: List[BasketItem])

case class BasketItem(product: String, quantity: Int)
