/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.0.4181.a593105a9 modeling language!*/


import java.sql.Date;

// line 17 "main.ump"
public class Test
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Test Attributes
  private String patientName;
  private Date testDate;
  private String testLocation;
  private String testType;
  private String labLocation;
  private Date resultDate;
  private boolean result;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Test(String aPatientName, Date aTestDate, String aTestLocation, String aTestType, String aLabLocation, Date aResultDate, boolean aResult)
  {
    patientName = aPatientName;
    testDate = aTestDate;
    testLocation = aTestLocation;
    testType = aTestType;
    labLocation = aLabLocation;
    resultDate = aResultDate;
    result = aResult;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setPatientName(String aPatientName)
  {
    boolean wasSet = false;
    patientName = aPatientName;
    wasSet = true;
    return wasSet;
  }

  public boolean setTestDate(Date aTestDate)
  {
    boolean wasSet = false;
    testDate = aTestDate;
    wasSet = true;
    return wasSet;
  }

  public boolean setTestLocation(String aTestLocation)
  {
    boolean wasSet = false;
    testLocation = aTestLocation;
    wasSet = true;
    return wasSet;
  }

  public boolean setTestType(String aTestType)
  {
    boolean wasSet = false;
    testType = aTestType;
    wasSet = true;
    return wasSet;
  }

  public boolean setLabLocation(String aLabLocation)
  {
    boolean wasSet = false;
    labLocation = aLabLocation;
    wasSet = true;
    return wasSet;
  }

  public boolean setResultDate(Date aResultDate)
  {
    boolean wasSet = false;
    resultDate = aResultDate;
    wasSet = true;
    return wasSet;
  }

  public boolean setResult(boolean aResult)
  {
    boolean wasSet = false;
    result = aResult;
    wasSet = true;
    return wasSet;
  }

  public String getPatientName()
  {
    return patientName;
  }

  public Date getTestDate()
  {
    return testDate;
  }

  public String getTestLocation()
  {
    return testLocation;
  }

  public String getTestType()
  {
    return testType;
  }

  public String getLabLocation()
  {
    return labLocation;
  }

  public Date getResultDate()
  {
    return resultDate;
  }

  public boolean getResult()
  {
    return result;
  }

  public void delete()
  {}


  public String toString()
  {
    return  "\n\tpatientName" + ":" + getPatientName()+ "\n" +
            "\ttestLocation" + ":" + getTestLocation()+ "\n" +
            "\ttestType" + ":" + getTestType()+ "\n" +
            "\tlabLocation" + ":" + getLabLocation()+ "\n" +
            "\tresult" + ":" + getResult() + System.getProperties().getProperty("line.separator") +
            "\t" + "testDate" + "=" + (getTestDate() != null ? !getTestDate().equals(this)  ? getTestDate().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "\t" + "resultDate" + "=" + (getResultDate() != null ? !getResultDate().equals(this)  ? getResultDate().toString().replaceAll("  ","    ") : "this" : "null");
  }
}