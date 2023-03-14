class Email extends Contact{
   public Email(String name, String email) {
      super(name);
      this.email = email;
   }

   private String email;

   @Override
   void contact() {
      System.out.println("Emailing " + email);
      
   }

   
}
