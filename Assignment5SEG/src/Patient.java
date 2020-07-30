/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.0.4181.a593105a9 modeling language!*/


import java.util.*;

// line 1 "main.ump"
public class Patient
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Patient Attributes
  private String name;
  private String address;
  private String phoneNumber;
  private int healthNumber;
  private List<Test> listOfTests;
  private List<Symptom> listOfSymptoms;
  private List<Patient> listOfContacts;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Patient(String aName, String aAddress, String aPhoneNumber, int aHealthNumber)
  {
    name = aName;
    address = aAddress;
    phoneNumber = aPhoneNumber;
    healthNumber = aHealthNumber;
    listOfTests = new ArrayList<Test>();
    listOfSymptoms = new ArrayList<Symptom>();
    listOfContacts = new ArrayList<Patient>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setName(String aName)
  {
    boolean wasSet = false;
    name = aName;
    wasSet = true;
    return wasSet;
  }

  public boolean setAddress(String aAddress)
  {
    boolean wasSet = false;
    address = aAddress;
    wasSet = true;
    return wasSet;
  }

  public boolean setPhoneNumber(String aPhoneNumber)
  {
    boolean wasSet = false;
    phoneNumber = aPhoneNumber;
    wasSet = true;
    return wasSet;
  }

  public boolean setHealthNumber(int aHealthNumber)
  {
    boolean wasSet = false;
    healthNumber = aHealthNumber;
    wasSet = true;
    return wasSet;
  }
  /* Code from template attribute_SetMany */
  public boolean addListOfTest(Test aListOfTest)
  {
    boolean wasAdded = false;
    wasAdded = listOfTests.add(aListOfTest);
    return wasAdded;
  }

  public boolean removeListOfTest(Test aListOfTest)
  {
    boolean wasRemoved = false;
    wasRemoved = listOfTests.remove(aListOfTest);
    return wasRemoved;
  }
  /* Code from template attribute_SetMany */
  public boolean addListOfSymptom(Symptom aListOfSymptom)
  {
    boolean wasAdded = false;
    wasAdded = listOfSymptoms.add(aListOfSymptom);
    return wasAdded;
  }

  public boolean removeListOfSymptom(Symptom aListOfSymptom)
  {
    boolean wasRemoved = false;
    wasRemoved = listOfSymptoms.remove(aListOfSymptom);
    return wasRemoved;
  }
  /* Code from template attribute_SetMany */
  public boolean addListOfContact(Patient aListOfContact)
  {
    boolean wasAdded = false;
    wasAdded = listOfContacts.add(aListOfContact);
    return wasAdded;
  }

  public boolean removeListOfContact(Patient aListOfContact)
  {
    boolean wasRemoved = false;
    wasRemoved = listOfContacts.remove(aListOfContact);
    return wasRemoved;
  }

  public String getName()
  {
    return name;
  }

  public String getAddress()
  {
    return address;
  }

  public String getPhoneNumber()
  {
    return phoneNumber;
  }

  public int getHealthNumber()
  {
    return healthNumber;
  }
  /* Code from template attribute_GetMany */
  public Test getListOfTest(int index)
  {
    Test aListOfTest = listOfTests.get(index);
    return aListOfTest;
  }

  public Test[] getListOfTests()
  {
    Test[] newListOfTests = listOfTests.toArray(new Test[listOfTests.size()]);
    return newListOfTests;
  }

  public int numberOfListOfTests()
  {
    int number = listOfTests.size();
    return number;
  }

  public boolean hasListOfTests()
  {
    boolean has = listOfTests.size() > 0;
    return has;
  }

  public int indexOfListOfTest(Test aListOfTest)
  {
    int index = listOfTests.indexOf(aListOfTest);
    return index;
  }
  /* Code from template attribute_GetMany */
  public Symptom getListOfSymptom(int index)
  {
    Symptom aListOfSymptom = listOfSymptoms.get(index);
    return aListOfSymptom;
  }

  public Symptom[] getListOfSymptoms()
  {
    Symptom[] newListOfSymptoms = listOfSymptoms.toArray(new Symptom[listOfSymptoms.size()]);
    return newListOfSymptoms;
  }

  public int numberOfListOfSymptoms()
  {
    int number = listOfSymptoms.size();
    return number;
  }

  public boolean hasListOfSymptoms()
  {
    boolean has = listOfSymptoms.size() > 0;
    return has;
  }

  public int indexOfListOfSymptom(Symptom aListOfSymptom)
  {
    int index = listOfSymptoms.indexOf(aListOfSymptom);
    return index;
  }
  /* Code from template attribute_GetMany */
  public Patient getListOfContact(int index)
  {
    Patient aListOfContact = listOfContacts.get(index);
    return aListOfContact;
  }

  public Patient[] getListOfContacts()
  {
    Patient[] newListOfContacts = listOfContacts.toArray(new Patient[listOfContacts.size()]);
    return newListOfContacts;
  }

  public int numberOfListOfContacts()
  {
    int number = listOfContacts.size();
    return number;
  }

  public boolean hasListOfContacts()
  {
    boolean has = listOfContacts.size() > 0;
    return has;
  }

  public int indexOfListOfContact(Patient aListOfContact)
  {
    int index = listOfContacts.indexOf(aListOfContact);
    return index;
  }

  public void delete()
  {}


  public String toString()
  {
	  String s = "";
	  for(int i = 0; i < numberOfListOfTests(); i++){
			s += getListOfTest(i).toString() + "\n";
		};
    return  "name" + ":" + getName()+ "\n" +
    		"address" + ":" + getAddress()+ "\n" +
    		"phoneNumber" + ":" + getPhoneNumber()+ "\n" +
    		"healthNumber" + ":" + getHealthNumber()+ "\n"+
    		"Tests" + ":" + s + "\n";
    		
  }
}