import static propel.core.functional.predicates.Predicates.*;
import static propel.core.functional.projections.Projections.*;
import lombok.ExtensionMethod;
import lombok.val;
import propel.core.utils.Linq;
//import propel.core.utils.Matcher;

@ExtensionMethod({Linq.class})
public class Main
{

  public static void main(String[] args)
  {
    // LINQ, extension methods, functions
    val names = new String[] { "john", "james", "john", "eddie" }.where(startsWith("j")).distinct().select(toUpperCase());  
    names.all(println());   
  }
}
