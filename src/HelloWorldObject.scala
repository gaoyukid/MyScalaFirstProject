import java.util.{Date, Locale};
import java.text.DateFormat;
import java.text.DateFormat._;

object HelloWorldObject {

  def main(args: Array[String]): Unit = {
    println("hello wrold, scala");
    
    val now = new Date;
    
    val df = getDateInstance(LONG, Locale.FRANCE);

    println(df format now); //    df.format(now);
    
  }

}