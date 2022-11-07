package edu.umb.cs680.hw06;

class ModelABC extends PrintJobExecutor {
   @Override
   protected void doAuthentication(EncryptedString password) throws Exception {
      // TODO Auto-generated method stub
      if (Authenticator.authenticate()) {
         changeState(new LoggedIn());
     } else {
         // auth error handling
     }
      
   }
    
    private void changeState(LoggedIn loggedIn) {
      // User is Logged In
   }

   public void doAccessControl() {
       // No need for access control
    }
    
    @Override
    protected void doPrint() {
       // TODO Auto-generated method stub
       System.out.println("Printing in Progress");
       
    }
    
    public void doErrorHandling(Exception e) {
       // Handle errors
    }

   

  
 }