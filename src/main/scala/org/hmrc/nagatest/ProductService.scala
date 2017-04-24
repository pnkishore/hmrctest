package org.hmrc.nagatest

import Product._

/**
  * Created by npatinbanda on 24/04/2017.
  */
class ProductService {

  def getUnitPrice(product: String): BigDecimal = {
    /* product price can be retrieved from a persistent store */
    Option(product) match {
      case Some(Apple) => 0.60
      case Some(Orange) => 0.25
      case _ => throw UnknownProductException(product)
    }
  }

  def getPriceWithOffer(product: String, quantity: Int): BigDecimal =
    getProductOffer(product).map(_.billableQuantity(quantity)).getOrElse(quantity) * getUnitPrice(product)

  /* This could return a list of offers as well */
  def getProductOffer(product: String): Option[ProductOffer] =
    Option(product) match {
      case Some(Apple) => Some(ProductOffer(Apple, "Buy One Get One Free", 2, 1))
      case Some(Orange) => Some(ProductOffer(Orange, "Three for the price of two", 3, 2))
      case _ => None
    }


}
