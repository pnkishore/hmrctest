package org.hmrc.nagatest

/**
  * Created by npatinbanda on 24/04/2017.
  */
case class ProductOffer(product: String, offerName: String, offerQuantity:Int, chargeableQuantity: Int) {
  def billableQuantity(quantity: Int) : Int = (quantity / offerQuantity) * chargeableQuantity + (quantity % offerQuantity)
}
