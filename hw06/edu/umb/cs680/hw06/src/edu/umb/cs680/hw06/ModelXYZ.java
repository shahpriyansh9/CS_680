package edu.umb.cs680.hw06;

import java.util.Map;

class ModelXYZ extends PrintJobExecutor {
    
   @Override
   protected void doAuthentication(EncryptedString password) throws Exception {
      // TODO Auto-generated method stub
      
   }
    
    public void doAccessControl() {
       // No need for access control
    }
    
    @Override
    protected void doPrint() {
       // TODO Auto-generated method stub
       
    }
    
    public void doErrorHandling(Exception e) {
       // Handle errors
    }

}