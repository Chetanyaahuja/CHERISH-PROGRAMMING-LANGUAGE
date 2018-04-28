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
            switch(str) 
            {
                case "EQL":
                    s.push(str);
                    break;
                case "IF":
                    s.push(str);
                    break;
                case "MOV":
                    s.push(str);
                    break;
                case "DISPLAY":
                    s.push(str);
                    break;
                case "ADD":
                    s.push(str);
                    break;
                case ";":
                    ArrayList<String> x = new ArrayList<>();
                    String popped = s.pop();
                    while(!(popped.equals("MOV") || popped.equals("DISPLAY") || popped.equals("ADD") ||
                            popped.equals("SUB") || popped.equals("MUL") || popped.equals("DIV") || popped.equals("REM")
                            || popped.equals("INC") || popped.equals("DEC") || popped.equals("GEQL") ||
                            popped.equals("LEQL") || popped.equals("LESS") || popped.equals("GRT")
                            || popped.equals("EQL") || popped.equals("NEQL") || popped.equals("IF")))
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
                    if(popped.equals("ADD")) {
                        int a,b;
                        if(isNumeric(x.get(1)))
                            a = Integer.parseInt(x.get(1));
                        else
                            a = Integer.parseInt(map.get(x.get(1)));
                        if(isNumeric(x.get(0)))
                            b = Integer.parseInt(x.get(0));
                        else
                            b = Integer.parseInt(map.get(x.get(0)));
                        a = a + b;
                        String val = "" + a;
                        map.put(x.get(1), val);
                    }

                    if(popped.equals("SUB")) {
                    int a,b;
                    if(isNumeric(x.get(1)))
                        a = Integer.parseInt(x.get(1));
                    else
                        a = Integer.parseInt(map.get(x.get(1)));
                    if(isNumeric(x.get(0)))
                        b = Integer.parseInt(x.get(0));
                    else
                        b = Integer.parseInt(map.get(x.get(0)));
                    a = a - b;
                    String val = "" + a;
                    map.put(x.get(1), val);
                }

                    if(popped.equals("MUL")) {
                        int a,b;
                        if(isNumeric(x.get(1)))
                            a = Integer.parseInt(x.get(1));
                        else
                            a = Integer.parseInt(map.get(x.get(1)));
                        if(isNumeric(x.get(0)))
                            b = Integer.parseInt(x.get(0));
                        else
                            b = Integer.parseInt(map.get(x.get(0)));
                        a = a * b;
                        String val = "" + a;
                        map.put(x.get(1), val);
                    }

                    if(popped.equals("DIV")) {
                        int a,b;
                        if(isNumeric(x.get(1)))
                            a = Integer.parseInt(x.get(1));
                        else
                            a = Integer.parseInt(map.get(x.get(1)));
                        if(isNumeric(x.get(0)))
                            b = Integer.parseInt(x.get(0));
                        else
                            b = Integer.parseInt(map.get(x.get(0)));
                        a = a / b;
                        String val = "" + a;
                        map.put(x.get(1), val);
                    }

                    if(popped.equals("REM")) {
                        int a,b;
                        if(isNumeric(x.get(1)))
                            a = Integer.parseInt(x.get(1));
                        else
                            a = Integer.parseInt(map.get(x.get(1)));
                        if(isNumeric(x.get(0)))
                            b = Integer.parseInt(x.get(0));
                        else
                            b = Integer.parseInt(map.get(x.get(0)));
                        a = a % b;
                        String val = "" + a;
                        map.put(x.get(1), val);
                    }

                    if(popped.equals("INC")) {
                        int a,b;
                        if(isNumeric(x.get(0)))
                            a = Integer.parseInt(x.get(0));
                        else
                            a = Integer.parseInt(map.get(x.get(0)));
                      /*  if(isNumeric(x.get(0)))
                            b = Integer.parseInt(x.get(0));
                        else
                            b = Integer.parseInt(map.get(x.get(0)));*/
                        a = a + 1;
                        String val = "" + a;
                        map.put(x.get(0), val);
                    }

                    if(popped.equals("DEC")) {
                        int a,b;
                        if(isNumeric(x.get(0)))
                            a = Integer.parseInt(x.get(0));
                        else
                            a = Integer.parseInt(map.get(x.get(0)));
                      /*  if(isNumeric(x.get(0)))
                            b = Integer.parseInt(x.get(0));
                        else
                            b = Integer.parseInt(map.get(x.get(0)));*/
                        a = a - 1;
                        String val = "" + a;
                        map.put(x.get(0), val);
                    }

                    if(popped.equals("GEQL")) {
                    int a,b;
                    Boolean c;
                    if(isNumeric(x.get(1)))
                        a = Integer.parseInt(x.get(1));
                    else
                        a = Integer.parseInt(map.get(x.get(1)));
                    if(isNumeric(x.get(0)))
                        b = Integer.parseInt(x.get(0));
                    else
                        b = Integer.parseInt(map.get(x.get(0)));
                    c = (a >= b);
                    String val = "" + c;
                    s.push(val);

                }
                    if (popped.equals("IF")) {
                            int b;

                            if (isNumeric(x.get(0)))
                                b = Integer.parseInt(x.get(0));
                            else
                                b = Integer.parseInt(map.get(x.get(0)));
                            map.put(x.get(0), b + "");
                        }

                    if(popped.equals("LEQL")) {
                        int a,b;
                        Boolean c;
                        if(isNumeric(x.get(1)))
                            a = Integer.parseInt(x.get(1));
                        else
                            a = Integer.parseInt(map.get(x.get(1)));
                        if(isNumeric(x.get(0)))
                            b = Integer.parseInt(x.get(0));
                        else
                            b = Integer.parseInt(map.get(x.get(0)));
                        c = (a <= b);
                        String val = "" + c;
                        s.push(val);
                    }

                    if(popped.equals("LESS")) {
                        int a,b;
                        Boolean c;
                        if(isNumeric(x.get(1)))
                            a = Integer.parseInt(x.get(1));
                        else
                            a = Integer.parseInt(map.get(x.get(1)));
                        if(isNumeric(x.get(0)))
                            b = Integer.parseInt(x.get(0));
                        else
                            b = Integer.parseInt(map.get(x.get(0)));
                        c = (a < b);
                        String val = "" + c;
                        s.push(val);
                    }

                    if(popped.equals("GRT")) {
                        int a,b;
                        Boolean c;
                        if(isNumeric(x.get(1)))
                            a = Integer.parseInt(x.get(1));
                        else
                            a = Integer.parseInt(map.get(x.get(1)));
                        if(isNumeric(x.get(0)))
                            b = Integer.parseInt(x.get(0));
                        else
                            b = Integer.parseInt(map.get(x.get(0)));
                        c = (a > b);
                        String val = "" + c;
                        s.push(val);
                    }

                    if (popped.equals("EQL")) {
                            int a, b;
                            Boolean c;
                            if (isNumeric(x.get(1)))
                                a = Integer.parseInt(x.get(1));
                            else
                                a = Integer.parseInt(map.get(x.get(1)));
                            if (isNumeric(x.get(0)))
                                b = Integer.parseInt(x.get(0));
                            else
                                b = Integer.parseInt(map.get(x.get(0)));
                            c = (a == b);
                            if(c)
                                s.push("1");
                            else
                                s.push("0");
                        }

                    if(popped.equals("NEQL")) {
                        int a,b;
                        Boolean c;
                        if(isNumeric(x.get(1)))
                            a = Integer.parseInt(x.get(1));
                        else
                            a = Integer.parseInt(map.get(x.get(1)));
                        if(isNumeric(x.get(0)))
                            b = Integer.parseInt(x.get(0));
                        else
                            b = Integer.parseInt(map.get(x.get(0)));
                        c = (a != b);
                        String val = "" + c;
                        s.push(val);
                    }
            }
                    break;
                default:
                    s.push(str);
                    break;
            }
        }
    }
    public static boolean isNumeric(String str)
    {
        try
        {
            double d = Double.parseDouble(str);
        }
        catch(NumberFormatException nfe)
        {
            return false;
        }
        return true;
    }
    public static boolean geql(int a, int b)
    {
        Boolean c;
        c = (a >= b);
        return c;
    }

    public static void main(String args[])
    {
        Cherish c = new Cherish();
        String inputIntermediateCode = "MOV a 6 ; IF EQL a 6 ; DISPLAY 9 ; ";
        c.runCode(inputIntermediateCode);
    }
}
