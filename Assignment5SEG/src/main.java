import java.sql.Date;

public class main {
	public static void main(String[] args) {
		boolean positive = true;
		boolean negative  = false;

        
        Patient p1 = new Patient("James", "2 Rideau St", "613-000-0001", 0001);
        Test Test1 = new Test(p1.getName(), new Date(1591277400000L), "Princeton-Plainsboro Hospital lab", "Blood Test", "Princeton-Plainsboro Hospital", new Date(1591624800000L), positive);
        Test Test2 = new Test(p1.getName(), new Date(1591364700000L), "Princeton-Plainsboro Hospital lab", "Swab Test", "Princeton-Plainsboro Hospital", new Date(1591710300000L), positive);
        p1.addListOfTest(Test1);
        p1.addListOfTest(Test2);
        
        System.out.println(p1.toString());


        Patient p2 = new Patient("Susan", "5 Mackenzie St", "613-000-0002", 0002);
        Test Test3 = new Test(p2.getName(), new Date(1591277400000L), "Ottawa General Hospital Lab", "Blood Test", "Ottawa General Hospital", new Date(1591624800000L), negative);
        Test Test4 = new Test(p2.getName(), new Date(1591364700000L), "Ottawa General Hospital Lab", "Nose Swab Test", "Ottawa General Hospital Lab", new Date(1591710300000L), negative);
        p2.addListOfTest(Test3);
        p2.addListOfTest(Test4);
        
        System.out.println(p2.toString());



        Patient p3 = new Patient("Andre", "20 Greenfield St", "613-000-0003", 0003);
        Test Test5 = new Test(p3.getName(), new Date(1591277400000L), "Ottawa General Hospital Lab", "Blood Test", "Ottawa General Hospital", new Date(1591624800000L), negative);
        Test Test6 = new Test(p3.getName(), new Date(1591364700000L), "Ottawa General Hospital Lab", "Nose Swab Test", "Ottawa General Hospital Lab", new Date(1591710300000L), negative);
        p3.addListOfTest(Test5);
        p3.addListOfTest(Test6);
        
        System.out.println(p3.toString());


        Patient p4 = new Patient("Ash", "3 Mann Ave.", "613-000-0004", 0004);
        Test Test7 = new Test(p4.getName(), new Date(1591277400000L), "Princeton-Plainsboro Hospital lab", "Blood Test", "Princeton-Plainsboro Hospital", new Date(1591624800000L), positive);
        Test Test8 = new Test(p4.getName(), new Date(1591364700000L), "Princeton-Plainsboro Hospital lab", "Swab Test", "Princeton-Plainsboro Hospital", new Date(1591710300000L), positive);
        p4.addListOfTest(Test7);
        p4.addListOfTest(Test8);
        
        System.out.println(p4.toString());


        Patient p5 = new Patient("Frank", "63 Blackburn St.", "613-000-0005", 0005);
        Test Test9 = new Test(p5.getName(), new Date(1591277400000L), "John Hopkins Hospital lab", "Blood Test", "John Hopkins Hospital", new Date(1591624800000L), positive);
        Test Test10 = new Test(p5.getName(), new Date(1591364700000L), "John Hopkins Hospital lab", "Swab Test", "John Hopkins Hospital", new Date(1591710300000L), positive);
        p5.addListOfTest(Test9);
        p5.addListOfTest(Test10);
        
        System.out.println(p5.toString());

    }
}
