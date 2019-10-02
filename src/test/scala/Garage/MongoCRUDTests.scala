package Garage

import resources.BaseTestingClass

class MongoCRUDTests extends BaseTestingClass{

  var mongoCRUD: MongoCRUD = _

  before {
    mongoCRUD = new MongoCRUD()
  }

//  "Logging in as a johndoe" should "return the user johndoe" in {
//    val service = mock[MongoCRUD]
//    when(service.getFirstDocument("johndoe")).thenReturn(Document("" -> ""))
//    val johndoe = mongoCRUD.getFirstDocument("johndoe")
//    //assert(johndoe.get == User("johndoe"))
//  }



}
