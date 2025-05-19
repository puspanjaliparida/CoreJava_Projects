package com.nt;

public class TextPost implements IPost {
   private String textContent;
   private int likes;
   
   public TextPost(String textContent, int likes) {
	super();
	this.textContent = textContent;
	this.likes = 0;
   }
   
   @Override
   public  void publish() {
	   System.out.println("The Post Has been published.");
   }
   
   @Override
   public  void like() {
	   likes++; 
       System.out.println("The post has been liked. Total Likes: " + likes);
   }  
   
   public void getTextContent(){
	   System.out.println("The Text Content is: "+textContent);
   }
}
