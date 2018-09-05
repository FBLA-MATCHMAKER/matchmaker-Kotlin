import java.io.File
import java.util.Scanner
object program {
  @JvmStatic fun main(args:Array<String>) {
    // CALL INGESTDATA CLASS
    ingestData.main()
  }
}
internal object ingestData {
  fun main() {
    val f = File("FBLA.txt")
    //Setting up the Arrays
    /* 	
		 Array Name:		Person's Name
		 Slot 0:			Gender / Grade
		 Slot 1-30:		Form Answers
		 Slot 31-35:		In-Grade Matches
		 Slot 36-40:		All Matches	 		*/


    //Allowing Appropriate Slots to be created and filled

    try
    {
      val sc = Scanner(f)
      val x = 0
      //while(sc.hasNextLine()) {
      if (x < 1)
      {
        println(sc.nextLine())
        x = x++
      }
    }
    catch (e:Exception) {
      println(" :( ")
    }
    //Fill Boxes	

    val percentMatch = 0
    val pArray = 0
    val box1 = 0
    val box2 = 0
    val box3 = 0
    val box4 = 0
    val box5 = 0
    val box6 = 0
    if (percentMatch > box1)
    {
      box1 = pArray
      box2 = box1
      box3 = box2
      box4 = box3
      box5 = box4
      box6 = box5
    }
    else if (percentMatch > box2)
    {
      box2 = pArray
      box3 = box2
      box4 = box3
      box5 = box4
      box6 = box5
    }
    else if (percentMatch > box3)
    {
      box3 = pArray
      box4 = box3
      box5 = box4
      box6 = box5
    }
    else if (percentMatch > box4)
    {
      box4 = pArray
      box5 = box4
      box6 = box5
    }
    else if (percentMatch > box5)
    {
      box5 = pArray
      box6 = box5
    }
    else if (percentMatch > box6)
    {
      box6 = pArray
    }
    try
    {
      val sc = Scanner(f)
    }
    catch (e:Exception) {
      println(" :( ")
    }
  }
}
