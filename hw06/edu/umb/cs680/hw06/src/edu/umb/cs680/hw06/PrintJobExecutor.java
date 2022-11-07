package edu.umb.cs680.hw06;



abstract class PrintJobExecutor {
    public final void execute(PrintJob job, EncryptedString password, SecurityContext ctx) throws Exception{
      //perform Authentication
      doAuthentication(password);
      
      //Give Access Control
      doAccessControl();
      //Print
      doPrint();

      //Perform Error Handling
      doErrorHandling(null);

    }
       

    protected abstract void doAuthentication(EncryptedString password) throws Exception;
    protected abstract void doAccessControl();
    protected abstract void doPrint();
    protected abstract void doErrorHandling(Exception e);
 }