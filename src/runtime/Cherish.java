import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * @author Drishty Kapoor
 * @author Chetanya Ahuja
 */

public class Cherish 
{

    public void runCode(String input)
    {
        Stack<String> s = new Stack<>();
        StringTokenizer t = new StringTokenizer(input);
        HashMap<String, String> map = new HashMap<>();
        while(t.hasMoreTokens()) {
            String str = t.nextToken();
            switch(str) {
                case "MOV":
                    s.push(str);
                    break;
                case "DISPLAY":
                    s.push(str);
                    break;
                case ";":
                    ArrayList<String> x = new ArrayList<>();
                    String popped = s.pop();
                    while(!(popped.equals("MOV") || popped.equals("DISPLAY") ))
                    {
                        x.add(popped);
                        popped = s.pop();
                    }

                    if(popped.equals("MOV"))
                    {
                        String id = x.get(1);
                        String value = x.get(0);
                        map.put(id, value);
                    }

                    if(popped.equals("DISPLAY"))
                    {
                        String value = map.get(x.get(0));
                        System.out.print(value);
                    }


                    break;
                default:
                    s.push(str);
                    break;
            }
        }
    }

    public static void main(String args[])
    {
        Cherish c = new Cherish();
        String inputIntermediateCode = "MOV x 5 ; MOV y 100 ; DISPLAY x ;";
        c.runCode(inputIntermediateCode);
    }
}
