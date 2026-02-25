package ENUM;

public enum API_URLS {
    GOOGLE("https://google.com"),
    timesofindia("ssss"),
    fb("sssdsds");

   private String url;
   //modifier not allowed
   API_URLS(String url)
   {
       this.url = url;
   }

   public String getUrl()
   {return  this.url;
   }

}
