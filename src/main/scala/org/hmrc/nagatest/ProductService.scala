package hmrctest

/**
  * Created by npatinbanda on 24/04/2017.
  */
class ProductService {

  def getUnitPrice(product: String): BigDecimal = {
    import Product._
    /* product price can be retrieved from a persistent store */
    Option(product) match {
      case Some(Apple) => 0.60
      case Some(Orange) => 0.25
      case _ => throw UnknownProductException(product)
    }
  }



}
