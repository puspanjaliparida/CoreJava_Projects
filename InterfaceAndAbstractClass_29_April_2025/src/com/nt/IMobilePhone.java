package com.nt;

public interface IMobilePhone {
   void insertingSIMCards(ISIMCard sim);
   void removingSIMCards();
   void makingCalls(String number);
   void sendMessage(String number,String message);
}
