package Garage

import resources.BaseTestingClass
import org.mongodb.scala._
import org.mockito.Mockito._

class MongoCRUDTests extends BaseTestingClass{

  var mongoCRUD: MongoCRUD = _
  var mockMongoCRUD: MongoCRUD = _

  before {
    mongoCRUD = new MongoCRUD()
    mockMongoCRUD = mock[MongoCRUD]
  }

  "The function addDocument" should "add a document to the specified collection " in {
    val mockDocument = mock[Document]
    when(mockMongoCRUD.addDocument(mockDocument, "testCollection")).thenReturn()
  }

//  "Logging in as a johndoe" should "return the user johndoe" in {
//    val service = mock[MongoCRUD]
//    when(service.getFirstDocument("johndoe")).thenReturn(Document("" -> ""))
//    val johndoe = mongoCRUD.getFirstDocument("johndoe")
//    //assert(johndoe.get == User("johndoe"))
//  }



}
