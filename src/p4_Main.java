package p4;

import p3.*;
import java.util.*;
import java.io.*;
/**
 *
 * @author ckc
 */
	public class Main {
    public static void main(String[] args) {
        Vector _shapes = new Vector();
        boolean cont = true;
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);

        try {
            
            
            
            while (cont) {
                System.out.println("Enter command: 0 = exit, 1 = draw all shapes, 2 = create circle, 3 = create rectangle");
                String line = br.readLine();
                int command = Integer.parseInt(line);
                
                String[] creators = {"p4.CircleCreator","p4.RectangleCreator"};
                

                if (command == 0) {
                    cont = false;
                } else if (command == 1) {
                    for (int i = 0; i < _shapes.size(); i++) {
                        ((Shape) _shapes.elementAt(i)).draw();
                    }
                } else if (command == 2) {
                    ShapeCreator c1 = (ShapeCreator) Class.forName(creators[0]).newInstance();
                    _shapes.add(c1.CreateShape());
                } else if (command == 3) {
                     ShapeCreator c1 = (ShapeCreator) Class.forName(creators[1]).newInstance();
                    _shapes.add(c1.CreateShape());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
                
	}

