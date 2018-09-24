import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.util.Scanner
object Program {
  @JvmStatic fun main(args:Array<String>) {
    // CALL INGESTDATA CLASS
    ingestData.main()
  }
}
internal object ingestData {
  private val sc:Scanner
  fun main() {
    val f = File("FBLA.txt")
    try
    {
      sc = Scanner(f)
      // Determine the length of FBLA.txt
      val reader = BufferedReader(FileReader("FBLA.txt"))
      val lines = 0
      while (reader.readLine() != null) lines++
      reader.close()
      // Create 2-D Array
      val arrayOfArrays = Array<Array<String>>(lines, {arrayOfNulls<String>(3)})
      val s = 0
      while (sc.hasNextLine())
      {
        // Declare
        val lineParse = sc.nextLine()
        // Split the values
        val parts = lineParse.split(("\t").toRegex()).dropLastWhile({ it.isEmpty() }).toTypedArray()
        val conName = (parts[0])
        val gender = (parts[1])
        val grade = (parts[2])
        val answer = (parts[3])
        val genGrade = gender + grade
        val ConString = arrayOf<String>(conName, genGrade, answer)
        // Put ConString into its respective files
        arrayOfArrays[s][0] = ConString[0]
        arrayOfArrays[s][1] = ConString[1]
        arrayOfArrays[s][2] = ConString[2]
        // Print Test
        s = s + 1
      }
      val cF7 = 0
      val cF8 = 0
      val cF9 = 0
      val cM7 = 0
      val cM8 = 0
      val cM9 = 0
      for (n in 0 until lines)
      {
        if (arrayOfArrays[n][1] == "F7" == true)
        {
          cF7 = cF7 + 1
        }
        else if (arrayOfArrays[n][1] == "F8" == true)
        {
          cF8 = cF8 + 1
        }
        else if (arrayOfArrays[n][1] == "F9" == true)
        {
          cF9 = cF9 + 1
        }
        else if (arrayOfArrays[n][1] == "M7" == true)
        {
          cM7 = cM7 + 1
        }
        else if (arrayOfArrays[n][1] == "M8" == true)
        {
          cM8 = cM8 + 1
        }
        else if (arrayOfArrays[n][1] == "M9" == true)
        {
          cM9 = cM9 + 1
        }
      }
      // MASTER F7 to M7 MATCHER\\
      println("BEGIN NEXT GROUP")
      println("")
      println("")
      val master = arrayOfNulls<String>(30)
      for (F7 in 0 until lines)
      {
        if (arrayOfArrays[F7][1] == "F7" == true)
        {
          val mName = arrayOfArrays[F7][0]
          for (e in 0..29)
          {
            master[e] = arrayOfArrays[F7][2].substring(e, e + 1)
          } // End masterInt {_for_}
          // Start second
          val second = arrayOfNulls<String>(30)
          val sName = arrayOfArrays[0][0]
          val percentMatch = 0.0
          val box1 = 0.0
          val box2 = 0.0
          val box3 = 0.0
          val box4 = 0.0
          val box5 = 0.0
          val box6 = 0.0
          val box7 = 0.0
          val box8 = 0.0
          val box9 = 0.0
          val box10 = 0.0
          val holdName = ""
          val sBox1 = ""
          val sBox2 = ""
          val sBox3 = ""
          val sBox4 = ""
          val sBox5 = ""
          val sBox6 = ""
          val sBox7 = ""
          val sBox8 = ""
          val sBox9 = ""
          val sBox10 = ""
          for (M7 in 0 until lines)
          {
            if (arrayOfArrays[M7][1] == "M7" == true)
            {
              sName = arrayOfArrays[M7][0]
              for (k in 0..29)
              {
                second[k] = arrayOfArrays[M7][2]
                .substring(k, k + 1)
              } // End masterInt {_for_}
              // Declare Varibles
              val matchCount = 0.0
              val pMatch = 0.0
              // Do the Math
              for (c in 0..29)
              {
                if (master[c] == second[c] == true)
                {
                  matchCount++
                } // End of "m=s" {_if_}
              } // End for "pMatch" {_for_}
              pMatch = matchCount / 30
              val rounded = Math.round(pMatch * 1000).toDouble() / 1000
              percentMatch = rounded
              holdName = sName
              if (percentMatch > box1)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = box3
                box3 = box2
                box2 = box1
                box1 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = sBox3
                sBox3 = sBox2
                sBox2 = sBox1
                sBox1 = holdName
              }
              else if (percentMatch > box2)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = box3
                box3 = box2
                box2 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = sBox3
                sBox3 = sBox2
                sBox2 = holdName
              }
              else if (percentMatch > box3)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = box3
                box3 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = sBox3
                sBox3 = holdName
              }
              else if (percentMatch > box4)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = holdName
              }
              else if (percentMatch > box5)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = holdName
              }
              else if (percentMatch > box6)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = holdName
              }
              else if (percentMatch > box7)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = holdName
              }
              else if (percentMatch > box8)
              {
                box9 = box8
                box10 = box9
                box8 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = holdName
              }
              else if (percentMatch > box9)
              {
                box10 = box9
                box9 = percentMatch
                sBox10 = sBox9
                sBox9 = holdName
              }
              else if (percentMatch > box10)
              {
                box10 = percentMatch
                sBox10 = holdName
              }
            }
          }
          println((mName + "," + sBox1 + "," + sBox2 + "," + sBox3 + ","
                   + sBox3 + "," + sBox4 + "," + sBox5 + "," + sBox6 + "," + sBox7 + ","
                   + sBox8 + "," + sBox9 + "," + sBox10))
        }
      }
      println("BEGIN NEXT GROUP")
      println("")
      println("")
      // MASTER F8 to M8 MATCHER\\
      for (F8 in 0 until lines)
      {
        if (arrayOfArrays[F8][1] == "F8" == true)
        {
          val mName = arrayOfArrays[F8][0]
          for (e in 0..29)
          {
            master[e] = arrayOfArrays[F8][2].substring(e, e + 1)
          } // End masterInt {_for_}
          // Start second
          val second = arrayOfNulls<String>(30)
          val sName = arrayOfArrays[0][0]
          val percentMatch = 0.0
          val box1 = 0.0
          val box2 = 0.0
          val box3 = 0.0
          val box4 = 0.0
          val box5 = 0.0
          val box6 = 0.0
          val box7 = 0.0
          val box8 = 0.0
          val box9 = 0.0
          val box10 = 0.0
          val holdName = ""
          val sBox1 = ""
          val sBox2 = ""
          val sBox3 = ""
          val sBox4 = ""
          val sBox5 = ""
          val sBox6 = ""
          val sBox7 = ""
          val sBox8 = ""
          val sBox9 = ""
          val sBox10 = ""
          for (M8 in 0 until lines)
          {
            if (arrayOfArrays[M8][1] == "M8" == true)
            {
              sName = arrayOfArrays[M8][0]
              for (k in 0..29)
              {
                second[k] = arrayOfArrays[M8][2]
                .substring(k, k + 1)
              } // End masterInt {_for_}
              // Declare Varibles
              val matchCount = 0.0
              val pMatch = 0.0
              // Do the Math
              for (c in 0..29)
              {
                if (master[c] == second[c] == true)
                {
                  matchCount++
                } // End of "m=s" {_if_}
              } // End for "pMatch" {_for_}
              pMatch = matchCount / 30
              val rounded = Math.round(pMatch * 1000).toDouble() / 1000
              percentMatch = rounded
              holdName = sName
              if (percentMatch > box1)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = box3
                box3 = box2
                box2 = box1
                box1 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = sBox3
                sBox3 = sBox2
                sBox2 = sBox1
                sBox1 = holdName
              }
              else if (percentMatch > box2)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = box3
                box3 = box2
                box2 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = sBox3
                sBox3 = sBox2
                sBox2 = holdName
              }
              else if (percentMatch > box3)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = box3
                box3 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = sBox3
                sBox3 = holdName
              }
              else if (percentMatch > box4)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = holdName
              }
              else if (percentMatch > box5)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = holdName
              }
              else if (percentMatch > box6)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = holdName
              }
              else if (percentMatch > box7)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = holdName
              }
              else if (percentMatch > box8)
              {
                box9 = box8
                box10 = box9
                box8 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = holdName
              }
              else if (percentMatch > box9)
              {
                box10 = box9
                box9 = percentMatch
                sBox10 = sBox9
                sBox9 = holdName
              }
              else if (percentMatch > box10)
              {
                box10 = percentMatch
                sBox10 = holdName
              }
            }
          }
          println((mName + "," + sBox1 + "," + sBox2 + "," + sBox3 + ","
                   + sBox3 + "," + sBox4 + "," + sBox5 + "," + sBox6 + "," + sBox7 + ","
                   + sBox8 + "," + sBox9 + "," + sBox10))
        }
      }
      println("BEGIN NEXT GROUP")
      println("")
      println("")
      // MASTER F9 to M9 MATCHER\\
      for (F9 in 0 until lines)
      {
        if (arrayOfArrays[F9][1] == "F9" == true)
        {
          val mName = arrayOfArrays[F9][0]
          for (e in 0..29)
          {
            master[e] = arrayOfArrays[F9][2].substring(e, e + 1)
          } // End masterInt {_for_}
          // Start second
          val second = arrayOfNulls<String>(30)
          val sName = arrayOfArrays[0][0]
          val percentMatch = 0.0
          val box1 = 0.0
          val box2 = 0.0
          val box3 = 0.0
          val box4 = 0.0
          val box5 = 0.0
          val box6 = 0.0
          val box7 = 0.0
          val box8 = 0.0
          val box9 = 0.0
          val box10 = 0.0
          val holdName = ""
          val sBox1 = ""
          val sBox2 = ""
          val sBox3 = ""
          val sBox4 = ""
          val sBox5 = ""
          val sBox6 = ""
          val sBox7 = ""
          val sBox8 = ""
          val sBox9 = ""
          val sBox10 = ""
          for (M9 in 0 until lines)
          {
            if (arrayOfArrays[M9][1] == "M9" == true)
            {
              sName = arrayOfArrays[M9][0]
              for (k in 0..29)
              {
                second[k] = arrayOfArrays[M9][2]
                .substring(k, k + 1)
              } // End masterInt {_for_}
              // Declare Varibles
              val matchCount = 0.0
              val pMatch = 0.0
              // Do the Math
              for (c in 0..29)
              {
                if (master[c] == second[c] == true)
                {
                  matchCount++
                } // End of "m=s" {_if_}
              } // End for "pMatch" {_for_}
              pMatch = matchCount / 30
              val rounded = Math.round(pMatch * 1000).toDouble() / 1000
              percentMatch = rounded
              holdName = sName
              if (percentMatch > box1)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = box3
                box3 = box2
                box2 = box1
                box1 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = sBox3
                sBox3 = sBox2
                sBox2 = sBox1
                sBox1 = holdName
              }
              else if (percentMatch > box2)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = box3
                box3 = box2
                box2 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = sBox3
                sBox3 = sBox2
                sBox2 = holdName
              }
              else if (percentMatch > box3)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = box3
                box3 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = sBox3
                sBox3 = holdName
              }
              else if (percentMatch > box4)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = holdName
              }
              else if (percentMatch > box5)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = holdName
              }
              else if (percentMatch > box6)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = holdName
              }
              else if (percentMatch > box7)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = holdName
              }
              else if (percentMatch > box8)
              {
                box9 = box8
                box10 = box9
                box8 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = holdName
              }
              else if (percentMatch > box9)
              {
                box10 = box9
                box9 = percentMatch
                sBox10 = sBox9
                sBox9 = holdName
              }
              else if (percentMatch > box10)
              {
                box10 = percentMatch
                sBox10 = holdName
              }
            }
          }
          println((mName + "," + sBox1 + "," + sBox2 + "," + sBox3 + ","
                   + sBox3 + "," + sBox4 + "," + sBox5 + "," + sBox6 + "," + sBox7 + ","
                   + sBox8 + "," + sBox9 + "," + sBox10))
        }
      }
      println("BEGIN NEXT GROUP")
      println("")
      println("")
      // MASTER M7 to F7 MATCHER\\
      for (M7 in 0 until lines)
      {
        if (arrayOfArrays[M7][1] == "M7" == true)
        {
          val mName = arrayOfArrays[M7][0]
          for (e in 0..29)
          {
            master[e] = arrayOfArrays[M7][2].substring(e, e + 1)
          } // End masterInt {_for_}
          // Start second
          val second = arrayOfNulls<String>(30)
          val sName = arrayOfArrays[0][0]
          val percentMatch = 0.0
          val box1 = 0.0
          val box2 = 0.0
          val box3 = 0.0
          val box4 = 0.0
          val box5 = 0.0
          val box6 = 0.0
          val box7 = 0.0
          val box8 = 0.0
          val box9 = 0.0
          val box10 = 0.0
          val holdName = ""
          val sBox1 = ""
          val sBox2 = ""
          val sBox3 = ""
          val sBox4 = ""
          val sBox5 = ""
          val sBox6 = ""
          val sBox7 = ""
          val sBox8 = ""
          val sBox9 = ""
          val sBox10 = ""
          for (F7 in 0 until lines)
          {
            if (arrayOfArrays[F7][1] == "F7" == true)
            {
              sName = arrayOfArrays[F7][0]
              for (k in 0..29)
              {
                second[k] = arrayOfArrays[F7][2]
                .substring(k, k + 1)
              } // End masterInt {_for_}
              // Declare Varibles
              val matchCount = 0.0
              val pMatch = 0.0
              // Do the Math
              for (c in 0..29)
              {
                if (master[c] == second[c] == true)
                {
                  matchCount++
                } // End of "m=s" {_if_}
              } // End for "pMatch" {_for_}
              pMatch = matchCount / 30
              val rounded = Math.round(pMatch * 1000).toDouble() / 1000
              percentMatch = rounded
              holdName = sName
              if (percentMatch > box1)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = box3
                box3 = box2
                box2 = box1
                box1 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = sBox3
                sBox3 = sBox2
                sBox2 = sBox1
                sBox1 = holdName
              }
              else if (percentMatch > box2)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = box3
                box3 = box2
                box2 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = sBox3
                sBox3 = sBox2
                sBox2 = holdName
              }
              else if (percentMatch > box3)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = box3
                box3 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = sBox3
                sBox3 = holdName
              }
              else if (percentMatch > box4)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = holdName
              }
              else if (percentMatch > box5)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = holdName
              }
              else if (percentMatch > box6)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = holdName
              }
              else if (percentMatch > box7)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = holdName
              }
              else if (percentMatch > box8)
              {
                box9 = box8
                box10 = box9
                box8 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = holdName
              }
              else if (percentMatch > box9)
              {
                box10 = box9
                box9 = percentMatch
                sBox10 = sBox9
                sBox9 = holdName
              }
              else if (percentMatch > box10)
              {
                box10 = percentMatch
                sBox10 = holdName
              }
            }
          }
          println((mName + "," + sBox1 + "," + sBox2 + "," + sBox3 + ","
                   + sBox3 + "," + sBox4 + "," + sBox5 + "," + sBox6 + "," + sBox7 + ","
                   + sBox8 + "," + sBox9 + "," + sBox10))
        }
      }
      println("BEGIN NEXT GROUP")
      println("")
      println("")
      // MASTER M8 to F8 MATCHER\\
      for (M8 in 0 until lines)
      {
        if (arrayOfArrays[M8][1] == "M8" == true)
        {
          val mName = arrayOfArrays[M8][0]
          for (e in 0..29)
          {
            master[e] = arrayOfArrays[M8][2].substring(e, e + 1)
          } // End masterInt {_for_}
          // Start second
          val second = arrayOfNulls<String>(30)
          val sName = arrayOfArrays[0][0]
          val percentMatch = 0.0
          val box1 = 0.0
          val box2 = 0.0
          val box3 = 0.0
          val box4 = 0.0
          val box5 = 0.0
          val box6 = 0.0
          val box7 = 0.0
          val box8 = 0.0
          val box9 = 0.0
          val box10 = 0.0
          val holdName = ""
          val sBox1 = ""
          val sBox2 = ""
          val sBox3 = ""
          val sBox4 = ""
          val sBox5 = ""
          val sBox6 = ""
          val sBox7 = ""
          val sBox8 = ""
          val sBox9 = ""
          val sBox10 = ""
          for (M7 in 0 until lines)
          {
            if (arrayOfArrays[M7][1] == "M7" == true)
            {
              sName = arrayOfArrays[M7][0]
              for (k in 0..29)
              {
                second[k] = arrayOfArrays[M7][2]
                .substring(k, k + 1)
              } // End masterInt {_for_}
              // Declare Varibles
              val matchCount = 0.0
              val pMatch = 0.0
              // Do the Math
              for (c in 0..29)
              {
                if (master[c] == second[c] == true)
                {
                  matchCount++
                } // End of "m=s" {_if_}
              } // End for "pMatch" {_for_}
              pMatch = matchCount / 30
              val rounded = Math.round(pMatch * 1000).toDouble() / 1000
              percentMatch = rounded
              holdName = sName
              if (percentMatch > box1)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = box3
                box3 = box2
                box2 = box1
                box1 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = sBox3
                sBox3 = sBox2
                sBox2 = sBox1
                sBox1 = holdName
              }
              else if (percentMatch > box2)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = box3
                box3 = box2
                box2 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = sBox3
                sBox3 = sBox2
                sBox2 = holdName
              }
              else if (percentMatch > box3)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = box3
                box3 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = sBox3
                sBox3 = holdName
              }
              else if (percentMatch > box4)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = holdName
              }
              else if (percentMatch > box5)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = holdName
              }
              else if (percentMatch > box6)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = holdName
              }
              else if (percentMatch > box7)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = holdName
              }
              else if (percentMatch > box8)
              {
                box9 = box8
                box10 = box9
                box8 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = holdName
              }
              else if (percentMatch > box9)
              {
                box10 = box9
                box9 = percentMatch
                sBox10 = sBox9
                sBox9 = holdName
              }
              else if (percentMatch > box10)
              {
                box10 = percentMatch
                sBox10 = holdName
              }
            }
          }
          println((mName + "," + sBox1 + "," + sBox2 + "," + sBox3 + ","
                   + sBox3 + "," + sBox4 + "," + sBox5 + "," + sBox6 + "," + sBox7 + ","
                   + sBox8 + "," + sBox9 + "," + sBox10))
        }
      }
      println("BEGIN NEXT GROUP")
      println("")
      println("")
      // MASTER M9 to F9 MATCHER\\
      for (M9 in 0 until lines)
      {
        if (arrayOfArrays[M9][1] == "M9" == true)
        {
          val mName = arrayOfArrays[M9][0]
          for (e in 0..29)
          {
            master[e] = arrayOfArrays[M9][2].substring(e, e + 1)
          } // End masterInt {_for_}
          // Start second
          val second = arrayOfNulls<String>(30)
          val sName = arrayOfArrays[0][0]
          val percentMatch = 0.0
          val box1 = 0.0
          val box2 = 0.0
          val box3 = 0.0
          val box4 = 0.0
          val box5 = 0.0
          val box6 = 0.0
          val box7 = 0.0
          val box8 = 0.0
          val box9 = 0.0
          val box10 = 0.0
          val holdName = ""
          val sBox1 = ""
          val sBox2 = ""
          val sBox3 = ""
          val sBox4 = ""
          val sBox5 = ""
          val sBox6 = ""
          val sBox7 = ""
          val sBox8 = ""
          val sBox9 = ""
          val sBox10 = ""
          for (F9 in 0 until lines)
          {
            if (arrayOfArrays[F9][1] == "F9" == true)
            {
              sName = arrayOfArrays[F9][0]
              for (k in 0..29)
              {
                second[k] = arrayOfArrays[F9][2]
                .substring(k, k + 1)
              } // End masterInt {_for_}
              // Declare Varibles
              val matchCount = 0.0
              val pMatch = 0.0
              // Do the Math
              for (c in 0..29)
              {
                if (master[c] == second[c] == true)
                {
                  matchCount++
                } // End of "m=s" {_if_}
              } // End for "pMatch" {_for_}
              pMatch = matchCount / 30
              val rounded = Math.round(pMatch * 1000).toDouble() / 1000
              percentMatch = rounded
              holdName = sName
              if (percentMatch > box1)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = box3
                box3 = box2
                box2 = box1
                box1 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = sBox3
                sBox3 = sBox2
                sBox2 = sBox1
                sBox1 = holdName
              }
              else if (percentMatch > box2)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = box3
                box3 = box2
                box2 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = sBox3
                sBox3 = sBox2
                sBox2 = holdName
              }
              else if (percentMatch > box3)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = box3
                box3 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = sBox3
                sBox3 = holdName
              }
              else if (percentMatch > box4)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = holdName
              }
              else if (percentMatch > box5)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = holdName
              }
              else if (percentMatch > box6)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = holdName
              }
              else if (percentMatch > box7)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = holdName
              }
              else if (percentMatch > box8)
              {
                box9 = box8
                box10 = box9
                box8 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = holdName
              }
              else if (percentMatch > box9)
              {
                box10 = box9
                box9 = percentMatch
                sBox10 = sBox9
                sBox9 = holdName
              }
              else if (percentMatch > box10)
              {
                box10 = percentMatch
                sBox10 = holdName
              }
            }
          }
          println((mName + "," + sBox1 + "," + sBox2 + "," + sBox3 + ","
                   + sBox3 + "," + sBox4 + "," + sBox5 + "," + sBox6 + "," + sBox7 + ","
                   + sBox8 + "," + sBox9 + "," + sBox10))
        }
      }
      println("BEGIN NEXT GROUP")
      println("")
      println("")
      // MASTER F8 to M7, M8, M9 MATCHER\\
      for (F8 in 0 until lines)
      {
        if (arrayOfArrays[F8][1] == "F8" == true)
        {
          val mName = arrayOfArrays[F8][0]
          for (e in 0..29)
          {
            master[e] = arrayOfArrays[F8][2].substring(e, e + 1)
          } // End masterInt {_for_}
          // Start second
          val second = arrayOfNulls<String>(30)
          val sName = arrayOfArrays[0][0]
          val percentMatch = 0.0
          val box1 = 0.0
          val box2 = 0.0
          val box3 = 0.0
          val box4 = 0.0
          val box5 = 0.0
          val box6 = 0.0
          val box7 = 0.0
          val box8 = 0.0
          val box9 = 0.0
          val box10 = 0.0
          val holdName = ""
          val sBox1 = ""
          val sBox2 = ""
          val sBox3 = ""
          val sBox4 = ""
          val sBox5 = ""
          val sBox6 = ""
          val sBox7 = ""
          val sBox8 = ""
          val sBox9 = ""
          val sBox10 = ""
          for (F9 in 0 until lines)
          {
            if (arrayOfArrays[F9][1] == "F9" == true)
            {
              sName = arrayOfArrays[F9][0]
              for (k in 0..29)
              {
                second[k] = arrayOfArrays[F9][2]
                .substring(k, k + 1)
              } // End masterInt {_for_}
              // Declare Varibles
              val matchCount = 0.0
              val pMatch = 0.0
              // Do the Math
              for (c in 0..29)
              {
                if (master[c] == second[c] == true)
                {
                  matchCount++
                } // End of "m=s" {_if_}
              } // End for "pMatch" {_for_}
              pMatch = matchCount / 30
              val rounded = Math.round(pMatch * 1000).toDouble() / 1000
              percentMatch = rounded
              holdName = sName
              if (percentMatch > box1)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = box3
                box3 = box2
                box2 = box1
                box1 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = sBox3
                sBox3 = sBox2
                sBox2 = sBox1
                sBox1 = holdName
              }
              else if (percentMatch > box2)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = box3
                box3 = box2
                box2 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = sBox3
                sBox3 = sBox2
                sBox2 = holdName
              }
              else if (percentMatch > box3)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = box3
                box3 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = sBox3
                sBox3 = holdName
              }
              else if (percentMatch > box4)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = holdName
              }
              else if (percentMatch > box5)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = holdName
              }
              else if (percentMatch > box6)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = holdName
              }
              else if (percentMatch > box7)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = holdName
              }
              else if (percentMatch > box8)
              {
                box9 = box8
                box10 = box9
                box8 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = holdName
              }
              else if (percentMatch > box9)
              {
                box10 = box9
                box9 = percentMatch
                sBox10 = sBox9
                sBox9 = holdName
              }
              else if (percentMatch > box10)
              {
                box10 = percentMatch
                sBox10 = holdName
              }
            }
          }
          for (M8 in 0 until lines)
          {
            if (arrayOfArrays[M8][1] == "M8" == true)
            {
              sName = arrayOfArrays[M8][0]
              for (k in 0..29)
              {
                second[k] = arrayOfArrays[M8][2]
                .substring(k, k + 1)
              } // End masterInt {_for_}
              // Declare Varibles
              val matchCount = 0.0
              val pMatch = 0.0
              // Do the Math
              for (c in 0..29)
              {
                if (master[c] == second[c] == true)
                {
                  matchCount++
                } // End of "m=s" {_if_}
              } // End for "pMatch" {_for_}
              pMatch = matchCount / 30
              val rounded = Math.round(pMatch * 1000).toDouble() / 1000
              percentMatch = rounded
              holdName = sName
              if (percentMatch > box1)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = box3
                box3 = box2
                box2 = box1
                box1 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = sBox3
                sBox3 = sBox2
                sBox2 = sBox1
                sBox1 = holdName
              }
              else if (percentMatch > box2)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = box3
                box3 = box2
                box2 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = sBox3
                sBox3 = sBox2
                sBox2 = holdName
              }
              else if (percentMatch > box3)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = box3
                box3 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = sBox3
                sBox3 = holdName
              }
              else if (percentMatch > box4)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = holdName
              }
              else if (percentMatch > box5)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = holdName
              }
              else if (percentMatch > box6)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = holdName
              }
              else if (percentMatch > box7)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = holdName
              }
              else if (percentMatch > box8)
              {
                box9 = box8
                box10 = box9
                box8 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = holdName
              }
              else if (percentMatch > box9)
              {
                box10 = box9
                box9 = percentMatch
                sBox10 = sBox9
                sBox9 = holdName
              }
              else if (percentMatch > box10)
              {
                box10 = percentMatch
                sBox10 = holdName
              }
            }
          }
          for (M7 in 0 until lines)
          {
            if (arrayOfArrays[M7][1] == "M7" == true)
            {
              sName = arrayOfArrays[M7][0]
              for (k in 0..29)
              {
                second[k] = arrayOfArrays[M7][2]
                .substring(k, k + 1)
              } // End masterInt {_for_}
              // Declare Varibles
              val matchCount = 0.0
              val pMatch = 0.0
              // Do the Math
              for (c in 0..29)
              {
                if (master[c] == second[c] == true)
                {
                  matchCount++
                } // End of "m=s" {_if_}
              } // End for "pMatch" {_for_}
              pMatch = matchCount / 30
              val rounded = Math.round(pMatch * 1000).toDouble() / 1000
              percentMatch = rounded
              holdName = sName
              if (percentMatch > box1)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = box3
                box3 = box2
                box2 = box1
                box1 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = sBox3
                sBox3 = sBox2
                sBox2 = sBox1
                sBox1 = holdName
              }
              else if (percentMatch > box2)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = box3
                box3 = box2
                box2 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = sBox3
                sBox3 = sBox2
                sBox2 = holdName
              }
              else if (percentMatch > box3)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = box3
                box3 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = sBox3
                sBox3 = holdName
              }
              else if (percentMatch > box4)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = holdName
              }
              else if (percentMatch > box5)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = holdName
              }
              else if (percentMatch > box6)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = holdName
              }
              else if (percentMatch > box7)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = holdName
              }
              else if (percentMatch > box8)
              {
                box9 = box8
                box10 = box9
                box8 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = holdName
              }
              else if (percentMatch > box9)
              {
                box10 = box9
                box9 = percentMatch
                sBox10 = sBox9
                sBox9 = holdName
              }
              else if (percentMatch > box10)
              {
                box10 = percentMatch
                sBox10 = holdName
              }
            }
          }
          println((mName + "," + sBox1 + "," + sBox2 + "," + sBox3 + ","
                   + sBox3 + "," + sBox4 + "," + sBox5 + "," + sBox6 + "," + sBox7 + ","
                   + sBox8 + "," + sBox9 + "," + sBox10))
        }
      }
      println("BEGIN NEXT GROUP")
      println("")
      println("")
      // MASTER F9 to M7, M8, M9 MATCHER\\
      for (F7 in 0 until lines)
      {
        if (arrayOfArrays[F7][1] == "F7" == true)
        {
          val mName = arrayOfArrays[F7][0]
          for (e in 0..29)
          {
            master[e] = arrayOfArrays[F7][2].substring(e, e + 1)
          } // End masterInt {_for_}
          // Start second
          val second = arrayOfNulls<String>(30)
          val sName = arrayOfArrays[0][0]
          val percentMatch = 0.0
          val box1 = 0.0
          val box2 = 0.0
          val box3 = 0.0
          val box4 = 0.0
          val box5 = 0.0
          val box6 = 0.0
          val box7 = 0.0
          val box8 = 0.0
          val box9 = 0.0
          val box10 = 0.0
          val holdName = ""
          val sBox1 = ""
          val sBox2 = ""
          val sBox3 = ""
          val sBox4 = ""
          val sBox5 = ""
          val sBox6 = ""
          val sBox7 = ""
          val sBox8 = ""
          val sBox9 = ""
          val sBox10 = ""
          for (F9 in 0 until lines)
          {
            if (arrayOfArrays[F9][1] == "F9" == true)
            {
              sName = arrayOfArrays[F9][0]
              for (k in 0..29)
              {
                second[k] = arrayOfArrays[F9][2]
                .substring(k, k + 1)
              } // End masterInt {_for_}
              // Declare Varibles
              val matchCount = 0.0
              val pMatch = 0.0
              // Do the Math
              for (c in 0..29)
              {
                if (master[c] == second[c] == true)
                {
                  matchCount++
                } // End of "m=s" {_if_}
              } // End for "pMatch" {_for_}
              pMatch = matchCount / 30
              val rounded = Math.round(pMatch * 1000).toDouble() / 1000
              percentMatch = rounded
              holdName = sName
              if (percentMatch > box1)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = box3
                box3 = box2
                box2 = box1
                box1 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = sBox3
                sBox3 = sBox2
                sBox2 = sBox1
                sBox1 = holdName
              }
              else if (percentMatch > box2)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = box3
                box3 = box2
                box2 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = sBox3
                sBox3 = sBox2
                sBox2 = holdName
              }
              else if (percentMatch > box3)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = box3
                box3 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = sBox3
                sBox3 = holdName
              }
              else if (percentMatch > box4)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = holdName
              }
              else if (percentMatch > box5)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = holdName
              }
              else if (percentMatch > box6)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = holdName
              }
              else if (percentMatch > box7)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = holdName
              }
              else if (percentMatch > box8)
              {
                box9 = box8
                box10 = box9
                box8 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = holdName
              }
              else if (percentMatch > box9)
              {
                box10 = box9
                box9 = percentMatch
                sBox10 = sBox9
                sBox9 = holdName
              }
              else if (percentMatch > box10)
              {
                box10 = percentMatch
                sBox10 = holdName
              }
            }
          }
          for (M8 in 0 until lines)
          {
            if (arrayOfArrays[M8][1] == "M8" == true)
            {
              sName = arrayOfArrays[M8][0]
              for (k in 0..29)
              {
                second[k] = arrayOfArrays[M8][2]
                .substring(k, k + 1)
              } // End masterInt {_for_}
              // Declare Varibles
              val matchCount = 0.0
              val pMatch = 0.0
              // Do the Math
              for (c in 0..29)
              {
                if (master[c] == second[c] == true)
                {
                  matchCount++
                } // End of "m=s" {_if_}
              } // End for "pMatch" {_for_}
              pMatch = matchCount / 30
              val rounded = Math.round(pMatch * 1000).toDouble() / 1000
              percentMatch = rounded
              holdName = sName
              if (percentMatch > box1)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = box3
                box3 = box2
                box2 = box1
                box1 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = sBox3
                sBox3 = sBox2
                sBox2 = sBox1
                sBox1 = holdName
              }
              else if (percentMatch > box2)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = box3
                box3 = box2
                box2 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = sBox3
                sBox3 = sBox2
                sBox2 = holdName
              }
              else if (percentMatch > box3)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = box3
                box3 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = sBox3
                sBox3 = holdName
              }
              else if (percentMatch > box4)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = holdName
              }
              else if (percentMatch > box5)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = holdName
              }
              else if (percentMatch > box6)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = holdName
              }
              else if (percentMatch > box7)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = holdName
              }
              else if (percentMatch > box8)
              {
                box9 = box8
                box10 = box9
                box8 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = holdName
              }
              else if (percentMatch > box9)
              {
                box10 = box9
                box9 = percentMatch
                sBox10 = sBox9
                sBox9 = holdName
              }
              else if (percentMatch > box10)
              {
                box10 = percentMatch
                sBox10 = holdName
              }
            }
          }
          for (M7 in 0 until lines)
          {
            if (arrayOfArrays[M7][1] == "M7" == true)
            {
              sName = arrayOfArrays[M7][0]
              for (k in 0..29)
              {
                second[k] = arrayOfArrays[M7][2]
                .substring(k, k + 1)
              } // End masterInt {_for_}
              // Declare Varibles
              val matchCount = 0.0
              val pMatch = 0.0
              // Do the Math
              for (c in 0..29)
              {
                if (master[c] == second[c] == true)
                {
                  matchCount++
                } // End of "m=s" {_if_}
              } // End for "pMatch" {_for_}
              pMatch = matchCount / 30
              val rounded = Math.round(pMatch * 1000).toDouble() / 1000
              percentMatch = rounded
              holdName = sName
              if (percentMatch > box1)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = box3
                box3 = box2
                box2 = box1
                box1 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = sBox3
                sBox3 = sBox2
                sBox2 = sBox1
                sBox1 = holdName
              }
              else if (percentMatch > box2)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = box3
                box3 = box2
                box2 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = sBox3
                sBox3 = sBox2
                sBox2 = holdName
              }
              else if (percentMatch > box3)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = box3
                box3 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = sBox3
                sBox3 = holdName
              }
              else if (percentMatch > box4)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = holdName
              }
              else if (percentMatch > box5)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = holdName
              }
              else if (percentMatch > box6)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = holdName
              }
              else if (percentMatch > box7)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = holdName
              }
              else if (percentMatch > box8)
              {
                box9 = box8
                box10 = box9
                box8 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = holdName
              }
              else if (percentMatch > box9)
              {
                box10 = box9
                box9 = percentMatch
                sBox10 = sBox9
                sBox9 = holdName
              }
              else if (percentMatch > box10)
              {
                box10 = percentMatch
                sBox10 = holdName
              }
            }
          }
          println((mName + "," + sBox1 + "," + sBox2 + "," + sBox3 + ","
                   + sBox3 + "," + sBox4 + "," + sBox5 + "," + sBox6 + "," + sBox7 + ","
                   + sBox8 + "," + sBox9 + "," + sBox10))
        }
      }
      println("BEGIN NEXT GROUP")
      println("")
      println("")
      // MASTER F7 to M7, M8, M9 MATCHER\\
      for (F7 in 0 until lines)
      {
        if (arrayOfArrays[F7][1] == "F7" == true)
        {
          val mName = arrayOfArrays[F7][0]
          for (e in 0..29)
          {
            master[e] = arrayOfArrays[F7][2].substring(e, e + 1)
          } // End masterInt {_for_}
          // Start second
          val second = arrayOfNulls<String>(30)
          val sName = arrayOfArrays[0][0]
          val percentMatch = 0.0
          val box1 = 0.0
          val box2 = 0.0
          val box3 = 0.0
          val box4 = 0.0
          val box5 = 0.0
          val box6 = 0.0
          val box7 = 0.0
          val box8 = 0.0
          val box9 = 0.0
          val box10 = 0.0
          val holdName = ""
          val sBox1 = ""
          val sBox2 = ""
          val sBox3 = ""
          val sBox4 = ""
          val sBox5 = ""
          val sBox6 = ""
          val sBox7 = ""
          val sBox8 = ""
          val sBox9 = ""
          val sBox10 = ""
          for (F9 in 0 until lines)
          {
            if (arrayOfArrays[F9][1] == "F9" == true)
            {
              sName = arrayOfArrays[F9][0]
              for (k in 0..29)
              {
                second[k] = arrayOfArrays[F9][2]
                .substring(k, k + 1)
              } // End masterInt {_for_}
              // Declare Varibles
              val matchCount = 0.0
              val pMatch = 0.0
              // Do the Math
              for (c in 0..29)
              {
                if (master[c] == second[c] == true)
                {
                  matchCount++
                } // End of "m=s" {_if_}
              } // End for "pMatch" {_for_}
              pMatch = matchCount / 30
              val rounded = Math.round(pMatch * 1000).toDouble() / 1000
              percentMatch = rounded
              holdName = sName
              if (percentMatch > box1)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = box3
                box3 = box2
                box2 = box1
                box1 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = sBox3
                sBox3 = sBox2
                sBox2 = sBox1
                sBox1 = holdName
              }
              else if (percentMatch > box2)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = box3
                box3 = box2
                box2 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = sBox3
                sBox3 = sBox2
                sBox2 = holdName
              }
              else if (percentMatch > box3)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = box3
                box3 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = sBox3
                sBox3 = holdName
              }
              else if (percentMatch > box4)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = holdName
              }
              else if (percentMatch > box5)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = holdName
              }
              else if (percentMatch > box6)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = holdName
              }
              else if (percentMatch > box7)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = holdName
              }
              else if (percentMatch > box8)
              {
                box9 = box8
                box10 = box9
                box8 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = holdName
              }
              else if (percentMatch > box9)
              {
                box10 = box9
                box9 = percentMatch
                sBox10 = sBox9
                sBox9 = holdName
              }
              else if (percentMatch > box10)
              {
                box10 = percentMatch
                sBox10 = holdName
              }
            }
          }
          for (M8 in 0 until lines)
          {
            if (arrayOfArrays[M8][1] == "M8" == true)
            {
              sName = arrayOfArrays[M8][0]
              for (k in 0..29)
              {
                second[k] = arrayOfArrays[M8][2]
                .substring(k, k + 1)
              } // End masterInt {_for_}
              // Declare Varibles
              val matchCount = 0.0
              val pMatch = 0.0
              // Do the Math
              for (c in 0..29)
              {
                if (master[c] == second[c] == true)
                {
                  matchCount++
                } // End of "m=s" {_if_}
              } // End for "pMatch" {_for_}
              pMatch = matchCount / 30
              val rounded = Math.round(pMatch * 1000).toDouble() / 1000
              percentMatch = rounded
              holdName = sName
              if (percentMatch > box1)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = box3
                box3 = box2
                box2 = box1
                box1 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = sBox3
                sBox3 = sBox2
                sBox2 = sBox1
                sBox1 = holdName
              }
              else if (percentMatch > box2)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = box3
                box3 = box2
                box2 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = sBox3
                sBox3 = sBox2
                sBox2 = holdName
              }
              else if (percentMatch > box3)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = box3
                box3 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = sBox3
                sBox3 = holdName
              }
              else if (percentMatch > box4)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = holdName
              }
              else if (percentMatch > box5)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = holdName
              }
              else if (percentMatch > box6)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = holdName
              }
              else if (percentMatch > box7)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = holdName
              }
              else if (percentMatch > box8)
              {
                box9 = box8
                box10 = box9
                box8 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = holdName
              }
              else if (percentMatch > box9)
              {
                box10 = box9
                box9 = percentMatch
                sBox10 = sBox9
                sBox9 = holdName
              }
              else if (percentMatch > box10)
              {
                box10 = percentMatch
                sBox10 = holdName
              }
            }
          }
          for (M7 in 0 until lines)
          {
            if (arrayOfArrays[M7][1] == "M7" == true)
            {
              sName = arrayOfArrays[M7][0]
              for (k in 0..29)
              {
                second[k] = arrayOfArrays[M7][2]
                .substring(k, k + 1)
              } // End masterInt {_for_}
              // Declare Varibles
              val matchCount = 0.0
              val pMatch = 0.0
              // Do the Math
              for (c in 0..29)
              {
                if (master[c] == second[c] == true)
                {
                  matchCount++
                } // End of "m=s" {_if_}
              } // End for "pMatch" {_for_}
              pMatch = matchCount / 30
              val rounded = Math.round(pMatch * 1000).toDouble() / 1000
              percentMatch = rounded
              holdName = sName
              if (percentMatch > box1)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = box3
                box3 = box2
                box2 = box1
                box1 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = sBox3
                sBox3 = sBox2
                sBox2 = sBox1
                sBox1 = holdName
              }
              else if (percentMatch > box2)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = box3
                box3 = box2
                box2 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = sBox3
                sBox3 = sBox2
                sBox2 = holdName
              }
              else if (percentMatch > box3)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = box3
                box3 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = sBox3
                sBox3 = holdName
              }
              else if (percentMatch > box4)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = holdName
              }
              else if (percentMatch > box5)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = holdName
              }
              else if (percentMatch > box6)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = holdName
              }
              else if (percentMatch > box7)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = holdName
              }
              else if (percentMatch > box8)
              {
                box9 = box8
                box10 = box9
                box8 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = holdName
              }
              else if (percentMatch > box9)
              {
                box10 = box9
                box9 = percentMatch
                sBox10 = sBox9
                sBox9 = holdName
              }
              else if (percentMatch > box10)
              {
                box10 = percentMatch
                sBox10 = holdName
              }
            }
          }
          println((mName + "," + sBox1 + "," + sBox2 + "," + sBox3 + ","
                   + sBox3 + "," + sBox4 + "," + sBox5 + "," + sBox6 + "," + sBox7 + ","
                   + sBox8 + "," + sBox9 + "," + sBox10))
        }
      }
      println("BEGIN NEXT GROUP")
      println("")
      println("")
      // MASTER M7 to F7, F8, F9 MATCHER\\
      for (M7 in 0 until lines)
      {
        if (arrayOfArrays[M7][1] == "M7" == true)
        {
          val mName = arrayOfArrays[M7][0]
          for (e in 0..29)
          {
            master[e] = arrayOfArrays[M7][2].substring(e, e + 1)
          } // End masterInt {_for_}
          // Start second
          val second = arrayOfNulls<String>(30)
          val sName = arrayOfArrays[0][0]
          val percentMatch = 0.0
          val box1 = 0.0
          val box2 = 0.0
          val box3 = 0.0
          val box4 = 0.0
          val box5 = 0.0
          val box6 = 0.0
          val box7 = 0.0
          val box8 = 0.0
          val box9 = 0.0
          val box10 = 0.0
          val holdName = ""
          val sBox1 = ""
          val sBox2 = ""
          val sBox3 = ""
          val sBox4 = ""
          val sBox5 = ""
          val sBox6 = ""
          val sBox7 = ""
          val sBox8 = ""
          val sBox9 = ""
          val sBox10 = ""
          for (F9 in 0 until lines)
          {
            if (arrayOfArrays[F9][1] == "F9" == true)
            {
              sName = arrayOfArrays[F9][0]
              for (k in 0..29)
              {
                second[k] = arrayOfArrays[F9][2]
                .substring(k, k + 1)
              } // End masterInt {_for_}
              // Declare Varibles
              val matchCount = 0.0
              val pMatch = 0.0
              // Do the Math
              for (c in 0..29)
              {
                if (master[c] == second[c] == true)
                {
                  matchCount++
                } // End of "m=s" {_if_}
              } // End for "pMatch" {_for_}
              pMatch = matchCount / 30
              val rounded = Math.round(pMatch * 1000).toDouble() / 1000
              percentMatch = rounded
              holdName = sName
              if (percentMatch > box1)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = box3
                box3 = box2
                box2 = box1
                box1 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = sBox3
                sBox3 = sBox2
                sBox2 = sBox1
                sBox1 = holdName
              }
              else if (percentMatch > box2)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = box3
                box3 = box2
                box2 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = sBox3
                sBox3 = sBox2
                sBox2 = holdName
              }
              else if (percentMatch > box3)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = box3
                box3 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = sBox3
                sBox3 = holdName
              }
              else if (percentMatch > box4)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = holdName
              }
              else if (percentMatch > box5)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = holdName
              }
              else if (percentMatch > box6)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = holdName
              }
              else if (percentMatch > box7)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = holdName
              }
              else if (percentMatch > box8)
              {
                box9 = box8
                box10 = box9
                box8 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = holdName
              }
              else if (percentMatch > box9)
              {
                box10 = box9
                box9 = percentMatch
                sBox10 = sBox9
                sBox9 = holdName
              }
              else if (percentMatch > box10)
              {
                box10 = percentMatch
                sBox10 = holdName
              }
            }
          }
          for (F8 in 0 until lines)
          {
            if (arrayOfArrays[F8][1] == "F8" == true)
            {
              sName = arrayOfArrays[F8][0]
              for (k in 0..29)
              {
                second[k] = arrayOfArrays[F8][2]
                .substring(k, k + 1)
              } // End masterInt {_for_}
              // Declare Varibles
              val matchCount = 0.0
              val pMatch = 0.0
              // Do the Math
              for (c in 0..29)
              {
                if (master[c] == second[c] == true)
                {
                  matchCount++
                } // End of "m=s" {_if_}
              } // End for "pMatch" {_for_}
              pMatch = matchCount / 30
              val rounded = Math.round(pMatch * 1000).toDouble() / 1000
              percentMatch = rounded
              holdName = sName
              if (percentMatch > box1)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = box3
                box3 = box2
                box2 = box1
                box1 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = sBox3
                sBox3 = sBox2
                sBox2 = sBox1
                sBox1 = holdName
              }
              else if (percentMatch > box2)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = box3
                box3 = box2
                box2 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = sBox3
                sBox3 = sBox2
                sBox2 = holdName
              }
              else if (percentMatch > box3)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = box3
                box3 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = sBox3
                sBox3 = holdName
              }
              else if (percentMatch > box4)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = holdName
              }
              else if (percentMatch > box5)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = holdName
              }
              else if (percentMatch > box6)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = holdName
              }
              else if (percentMatch > box7)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = holdName
              }
              else if (percentMatch > box8)
              {
                box9 = box8
                box10 = box9
                box8 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = holdName
              }
              else if (percentMatch > box9)
              {
                box10 = box9
                box9 = percentMatch
                sBox10 = sBox9
                sBox9 = holdName
              }
              else if (percentMatch > box10)
              {
                box10 = percentMatch
                sBox10 = holdName
              }
            }
          }
          for (F9 in 0 until lines)
          {
            if (arrayOfArrays[F9][1] == "F9" == true)
            {
              sName = arrayOfArrays[F9][0]
              for (k in 0..29)
              {
                second[k] = arrayOfArrays[F9][2]
                .substring(k, k + 1)
              } // End masterInt {_for_}
              // Declare Varibles
              val matchCount = 0.0
              val pMatch = 0.0
              // Do the Math
              for (c in 0..29)
              {
                if (master[c] == second[c] == true)
                {
                  matchCount++
                } // End of "m=s" {_if_}
              } // End for "pMatch" {_for_}
              pMatch = matchCount / 30
              val rounded = Math.round(pMatch * 1000).toDouble() / 1000
              percentMatch = rounded
              holdName = sName
              if (percentMatch > box1)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = box3
                box3 = box2
                box2 = box1
                box1 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = sBox3
                sBox3 = sBox2
                sBox2 = sBox1
                sBox1 = holdName
              }
              else if (percentMatch > box2)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = box3
                box3 = box2
                box2 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = sBox3
                sBox3 = sBox2
                sBox2 = holdName
              }
              else if (percentMatch > box3)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = box3
                box3 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = sBox3
                sBox3 = holdName
              }
              else if (percentMatch > box4)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = holdName
              }
              else if (percentMatch > box5)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = holdName
              }
              else if (percentMatch > box6)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = holdName
              }
              else if (percentMatch > box7)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = holdName
              }
              else if (percentMatch > box8)
              {
                box9 = box8
                box10 = box9
                box8 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = holdName
              }
              else if (percentMatch > box9)
              {
                box10 = box9
                box9 = percentMatch
                sBox10 = sBox9
                sBox9 = holdName
              }
              else if (percentMatch > box10)
              {
                box10 = percentMatch
                sBox10 = holdName
              }
            }
          }
          println((mName + "," + sBox1 + "," + sBox2 + "," + sBox3 + ","
                   + sBox3 + "," + sBox4 + "," + sBox5 + "," + sBox6 + "," + sBox7 + ","
                   + sBox8 + "," + sBox9 + "," + sBox10))
        }
      }
      println("BEGIN NEXT GROUP")
      println("")
      println("")
      // MASTER M8 to F7, F8, F9 MATCHER\\
      for (M8 in 0 until lines)
      {
        if (arrayOfArrays[M8][1] == "M8" == true)
        {
          val mName = arrayOfArrays[M8][0]
          for (e in 0..29)
          {
            master[e] = arrayOfArrays[M8][2].substring(e, e + 1)
          } // End masterInt {_for_}
          // Start second
          val second = arrayOfNulls<String>(30)
          val sName = arrayOfArrays[0][0]
          val percentMatch = 0.0
          val box1 = 0.0
          val box2 = 0.0
          val box3 = 0.0
          val box4 = 0.0
          val box5 = 0.0
          val box6 = 0.0
          val box7 = 0.0
          val box8 = 0.0
          val box9 = 0.0
          val box10 = 0.0
          val holdName = ""
          val sBox1 = ""
          val sBox2 = ""
          val sBox3 = ""
          val sBox4 = ""
          val sBox5 = ""
          val sBox6 = ""
          val sBox7 = ""
          val sBox8 = ""
          val sBox9 = ""
          val sBox10 = ""
          for (F9 in 0 until lines)
          {
            if (arrayOfArrays[F9][1] == "F9" == true)
            {
              sName = arrayOfArrays[F9][0]
              for (k in 0..29)
              {
                second[k] = arrayOfArrays[F9][2]
                .substring(k, k + 1)
              } // End masterInt {_for_}
              // Declare Varibles
              val matchCount = 0.0
              val pMatch = 0.0
              // Do the Math
              for (c in 0..29)
              {
                if (master[c] == second[c] == true)
                {
                  matchCount++
                } // End of "m=s" {_if_}
              } // End for "pMatch" {_for_}
              pMatch = matchCount / 30
              val rounded = Math.round(pMatch * 1000).toDouble() / 1000
              percentMatch = rounded
              holdName = sName
              if (percentMatch > box1)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = box3
                box3 = box2
                box2 = box1
                box1 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = sBox3
                sBox3 = sBox2
                sBox2 = sBox1
                sBox1 = holdName
              }
              else if (percentMatch > box2)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = box3
                box3 = box2
                box2 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = sBox3
                sBox3 = sBox2
                sBox2 = holdName
              }
              else if (percentMatch > box3)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = box3
                box3 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = sBox3
                sBox3 = holdName
              }
              else if (percentMatch > box4)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = holdName
              }
              else if (percentMatch > box5)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = holdName
              }
              else if (percentMatch > box6)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = holdName
              }
              else if (percentMatch > box7)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = holdName
              }
              else if (percentMatch > box8)
              {
                box9 = box8
                box10 = box9
                box8 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = holdName
              }
              else if (percentMatch > box9)
              {
                box10 = box9
                box9 = percentMatch
                sBox10 = sBox9
                sBox9 = holdName
              }
              else if (percentMatch > box10)
              {
                box10 = percentMatch
                sBox10 = holdName
              }
            }
          }
          for (F8 in 0 until lines)
          {
            if (arrayOfArrays[F8][1] == "F8" == true)
            {
              sName = arrayOfArrays[F8][0]
              for (k in 0..29)
              {
                second[k] = arrayOfArrays[F8][2]
                .substring(k, k + 1)
              } // End masterInt {_for_}
              // Declare Varibles
              val matchCount = 0.0
              val pMatch = 0.0
              // Do the Math
              for (c in 0..29)
              {
                if (master[c] == second[c] == true)
                {
                  matchCount++
                } // End of "m=s" {_if_}
              } // End for "pMatch" {_for_}
              pMatch = matchCount / 30
              val rounded = Math.round(pMatch * 1000).toDouble() / 1000
              percentMatch = rounded
              holdName = sName
              if (percentMatch > box1)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = box3
                box3 = box2
                box2 = box1
                box1 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = sBox3
                sBox3 = sBox2
                sBox2 = sBox1
                sBox1 = holdName
              }
              else if (percentMatch > box2)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = box3
                box3 = box2
                box2 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = sBox3
                sBox3 = sBox2
                sBox2 = holdName
              }
              else if (percentMatch > box3)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = box3
                box3 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = sBox3
                sBox3 = holdName
              }
              else if (percentMatch > box4)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = holdName
              }
              else if (percentMatch > box5)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = holdName
              }
              else if (percentMatch > box6)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = holdName
              }
              else if (percentMatch > box7)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = holdName
              }
              else if (percentMatch > box8)
              {
                box9 = box8
                box10 = box9
                box8 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = holdName
              }
              else if (percentMatch > box9)
              {
                box10 = box9
                box9 = percentMatch
                sBox10 = sBox9
                sBox9 = holdName
              }
              else if (percentMatch > box10)
              {
                box10 = percentMatch
                sBox10 = holdName
              }
            }
          }
          for (F9 in 0 until lines)
          {
            if (arrayOfArrays[F9][1] == "F9" == true)
            {
              sName = arrayOfArrays[F9][0]
              for (k in 0..29)
              {
                second[k] = arrayOfArrays[F9][2]
                .substring(k, k + 1)
              } // End masterInt {_for_}
              // Declare Varibles
              val matchCount = 0.0
              val pMatch = 0.0
              // Do the Math
              for (c in 0..29)
              {
                if (master[c] == second[c] == true)
                {
                  matchCount++
                } // End of "m=s" {_if_}
              } // End for "pMatch" {_for_}
              pMatch = matchCount / 30
              val rounded = Math.round(pMatch * 1000).toDouble() / 1000
              percentMatch = rounded
              holdName = sName
              if (percentMatch > box1)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = box3
                box3 = box2
                box2 = box1
                box1 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = sBox3
                sBox3 = sBox2
                sBox2 = sBox1
                sBox1 = holdName
              }
              else if (percentMatch > box2)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = box3
                box3 = box2
                box2 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = sBox3
                sBox3 = sBox2
                sBox2 = holdName
              }
              else if (percentMatch > box3)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = box3
                box3 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = sBox3
                sBox3 = holdName
              }
              else if (percentMatch > box4)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = holdName
              }
              else if (percentMatch > box5)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = holdName
              }
              else if (percentMatch > box6)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = holdName
              }
              else if (percentMatch > box7)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = holdName
              }
              else if (percentMatch > box8)
              {
                box9 = box8
                box10 = box9
                box8 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = holdName
              }
              else if (percentMatch > box9)
              {
                box10 = box9
                box9 = percentMatch
                sBox10 = sBox9
                sBox9 = holdName
              }
              else if (percentMatch > box10)
              {
                box10 = percentMatch
                sBox10 = holdName
              }
            }
          }
          println((mName + "," + sBox1 + "," + sBox2 + "," + sBox3 + ","
                   + sBox3 + "," + sBox4 + "," + sBox5 + "," + sBox6 + "," + sBox7 + ","
                   + sBox8 + "," + sBox9 + "," + sBox10))
        }
      }
      println("BEGIN NEXT GROUP")
      println("")
      println("")
      // MASTER M9 to F7, F8, F9 MATCHER\\
      for (M9 in 0 until lines)
      {
        if (arrayOfArrays[M9][1] == "M9" == true)
        {
          val mName = arrayOfArrays[M9][0]
          for (e in 0..29)
          {
            master[e] = arrayOfArrays[M9][2].substring(e, e + 1)
          } // End masterInt {_for_}
          // Start second
          val second = arrayOfNulls<String>(30)
          val sName = arrayOfArrays[0][0]
          val percentMatch = 0.0
          val box1 = 0.0
          val box2 = 0.0
          val box3 = 0.0
          val box4 = 0.0
          val box5 = 0.0
          val box6 = 0.0
          val box7 = 0.0
          val box8 = 0.0
          val box9 = 0.0
          val box10 = 0.0
          val holdName = ""
          val sBox1 = ""
          val sBox2 = ""
          val sBox3 = ""
          val sBox4 = ""
          val sBox5 = ""
          val sBox6 = ""
          val sBox7 = ""
          val sBox8 = ""
          val sBox9 = ""
          val sBox10 = ""
          for (F9 in 0 until lines)
          {
            if (arrayOfArrays[F9][1] == "F9" == true)
            {
              sName = arrayOfArrays[F9][0]
              for (k in 0..29)
              {
                second[k] = arrayOfArrays[F9][2]
                .substring(k, k + 1)
              } // End masterInt {_for_}
              // Declare Varibles
              val matchCount = 0.0
              val pMatch = 0.0
              // Do the Math
              for (c in 0..29)
              {
                if (master[c] == second[c] == true)
                {
                  matchCount++
                } // End of "m=s" {_if_}
              } // End for "pMatch" {_for_}
              pMatch = matchCount / 30
              val rounded = Math.round(pMatch * 1000).toDouble() / 1000
              percentMatch = rounded
              holdName = sName
              if (percentMatch > box1)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = box3
                box3 = box2
                box2 = box1
                box1 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = sBox3
                sBox3 = sBox2
                sBox2 = sBox1
                sBox1 = holdName
              }
              else if (percentMatch > box2)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = box3
                box3 = box2
                box2 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = sBox3
                sBox3 = sBox2
                sBox2 = holdName
              }
              else if (percentMatch > box3)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = box3
                box3 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = sBox3
                sBox3 = holdName
              }
              else if (percentMatch > box4)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = holdName
              }
              else if (percentMatch > box5)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = holdName
              }
              else if (percentMatch > box6)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = holdName
              }
              else if (percentMatch > box7)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = holdName
              }
              else if (percentMatch > box8)
              {
                box9 = box8
                box10 = box9
                box8 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = holdName
              }
              else if (percentMatch > box9)
              {
                box10 = box9
                box9 = percentMatch
                sBox10 = sBox9
                sBox9 = holdName
              }
              else if (percentMatch > box10)
              {
                box10 = percentMatch
                sBox10 = holdName
              }
            }
          }
          for (F8 in 0 until lines)
          {
            if (arrayOfArrays[F8][1] == "F8" == true)
            {
              sName = arrayOfArrays[F8][0]
              for (k in 0..29)
              {
                second[k] = arrayOfArrays[F8][2]
                .substring(k, k + 1)
              } // End masterInt {_for_}
              // Declare Varibles
              val matchCount = 0.0
              val pMatch = 0.0
              // Do the Math
              for (c in 0..29)
              {
                if (master[c] == second[c] == true)
                {
                  matchCount++
                } // End of "m=s" {_if_}
              } // End for "pMatch" {_for_}
              pMatch = matchCount / 30
              val rounded = Math.round(pMatch * 1000).toDouble() / 1000
              percentMatch = rounded
              holdName = sName
              if (percentMatch > box1)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = box3
                box3 = box2
                box2 = box1
                box1 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = sBox3
                sBox3 = sBox2
                sBox2 = sBox1
                sBox1 = holdName
              }
              else if (percentMatch > box2)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = box3
                box3 = box2
                box2 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = sBox3
                sBox3 = sBox2
                sBox2 = holdName
              }
              else if (percentMatch > box3)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = box3
                box3 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = sBox3
                sBox3 = holdName
              }
              else if (percentMatch > box4)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = holdName
              }
              else if (percentMatch > box5)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = holdName
              }
              else if (percentMatch > box6)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = holdName
              }
              else if (percentMatch > box7)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = holdName
              }
              else if (percentMatch > box8)
              {
                box9 = box8
                box10 = box9
                box8 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = holdName
              }
              else if (percentMatch > box9)
              {
                box10 = box9
                box9 = percentMatch
                sBox10 = sBox9
                sBox9 = holdName
              }
              else if (percentMatch > box10)
              {
                box10 = percentMatch
                sBox10 = holdName
              }
            }
          }
          for (F9 in 0 until lines)
          {
            if (arrayOfArrays[F9][1] == "F9" == true)
            {
              sName = arrayOfArrays[F9][0]
              for (k in 0..29)
              {
                second[k] = arrayOfArrays[F9][2]
                .substring(k, k + 1)
              } // End masterInt {_for_}
              // Declare Varibles
              val matchCount = 0.0
              val pMatch = 0.0
              // Do the Math
              for (c in 0..29)
              {
                if (master[c] == second[c] == true)
                {
                  matchCount++
                } // End of "m=s" {_if_}
              } // End for "pMatch" {_for_}
              pMatch = matchCount / 30
              val rounded = Math.round(pMatch * 1000).toDouble() / 1000
              percentMatch = rounded
              holdName = sName
              if (percentMatch > box1)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = box3
                box3 = box2
                box2 = box1
                box1 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = sBox3
                sBox3 = sBox2
                sBox2 = sBox1
                sBox1 = holdName
              }
              else if (percentMatch > box2)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = box3
                box3 = box2
                box2 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = sBox3
                sBox3 = sBox2
                sBox2 = holdName
              }
              else if (percentMatch > box3)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = box3
                box3 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = sBox3
                sBox3 = holdName
              }
              else if (percentMatch > box4)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = box4
                box4 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = sBox4
                sBox4 = holdName
              }
              else if (percentMatch > box5)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = box5
                box5 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = sBox5
                sBox5 = holdName
              }
              else if (percentMatch > box6)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = box6
                box6 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = sBox6
                sBox6 = holdName
              }
              else if (percentMatch > box7)
              {
                box10 = box9
                box9 = box8
                box8 = box7
                box7 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = sBox7
                sBox7 = holdName
              }
              else if (percentMatch > box8)
              {
                box9 = box8
                box10 = box9
                box8 = percentMatch
                sBox10 = sBox9
                sBox9 = sBox8
                sBox8 = holdName
              }
              else if (percentMatch > box9)
              {
                box10 = box9
                box9 = percentMatch
                sBox10 = sBox9
                sBox9 = holdName
              }
              else if (percentMatch > box10)
              {
                box10 = percentMatch
                sBox10 = holdName
              }
            }
          }
          println((mName + "," + sBox1 + "," + sBox2 + "," + sBox3 + ","
                   + sBox3 + "," + sBox4 + "," + sBox5 + "," + sBox6 + "," + sBox7 + ","
                   + sBox8 + "," + sBox9 + "," + sBox10))
        }
      }
    } // End of the {_try_}
    catch (e:Exception) {
      println(" :( ")
    }
    // Catch {_file_f_}
  }
}
