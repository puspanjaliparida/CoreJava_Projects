package com.nt;

public class SocialMediaMainClass {
   public static void main(String[] args) {
	  TextPost tp=new TextPost("My Post", 4);
	  tp.publish();
	  tp.like();
	  tp.like();
	  tp.getTextContent();
   }
}