class Phone extends Contact{
   public Phone(String name, String num) {
      super(name);
      this.num = num;
   }

   private String num;
   
   @Override
   void contact() {
      System.out.println("Calling "+ num);
      
   }

   

}
