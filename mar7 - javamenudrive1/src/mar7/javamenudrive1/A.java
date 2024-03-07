/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mar7.javamenudrive1;

import java.util.Scanner;
public class A {
    int accNum,pin,avlBal;
    
    public A(int accNum, int pin, int avlBal){
        this.accNum = accNum;
        this.pin = pin;
        this.avlBal = avlBal;
    }
    
 Scanner sc = new Scanner(System.in);
    //method to check pin
    public boolean pinCheck(){
        int pinID;
        System.out.print("Enter ATM pin here : ");
        pinID = sc.nextInt();
        
        if(pinID == this.pin){
            return true;
        }
        else {
            System.out.println("incorrect pin");
            return false;
        }
    }
    
    //method to check if account axists
    public boolean accNumCheck(int acNum){
        if(acNum == this.accNum){
            System.out.println("Account exists");
            return true;
        }
        else {
            System.out.println("Account doesnt exist");
            return false;
        }
    }
    
    //method to check for account balance
    public boolean accBalCheck(int withdraw){
        if(withdraw > this.avlBal) {
            System.out.println("insufficient balance");
            return false;
        }
        else {
            return true;
        }
    }
    
    public void withdrawAmt(int acNum){
        //boolean numCheck = this.accNumCheck(acNum);
        boolean balCheck, pinCheck; int draw;
        if(this.accNumCheck(acNum) == true){
            System.out.print("enter amount to withdraw : ");
            draw = sc.nextInt();
            //balCheck = this.accBalCheck(draw);
            if (this.accBalCheck(draw) == true){
                //pinCheck = this.pinCheck();
                
                if(this.pinCheck() == true){
                    this.avlBal = this.avlBal - draw;
                    System.out.print("Funds withdrawn");
                    System.out.print("AValibale bal is : " + (this.avlBal));
                }
            }
        }
        //return true;
    }
    
    //method to deposit money
    public void deposit(int acNum){
       int depositAmt;
        if(this.accNumCheck(acNum) == true){
            System.out.print("enter amount to deposit: ");
            depositAmt = sc.nextInt();
            //balCheck = this.accBalCheck(draw);
            if (this.accBalCheck(depositAmt) == true){
                //pinCheck = this.pinCheck();
                
                if(this.pinCheck() == true){
                    this.avlBal = this.avlBal +  depositAmt;
                    System.out.println("Funds deposited");
                    System.out.println("AValibale bal is : " + (this.avlBal));
                }
            } 
        }
    }//deposit method close
    
    
    public static void main(String[] args) {
        int opt,userNum;
        Scanner input = new Scanner(System.in);
        A us1 = new A(1234,4321,5000);
        A us2 = new A(2345,5432,9000);
        A us3 = new A(3456,6543,7000);
        
        
        System.out.print("Enter user 1, 2 or 3 : ");
        userNum=input.nextInt();
        
      System.out.println("1. Withdraw\t2.deposit\t3.transfer");    
      System.out.print("Enter option here : ");
      opt=input.nextInt();
      
      
      switch(opt){
          case 1 : System.out.println("Withdrawal");
                   //System.out.print("Enter user 1 2 or 3 : ");
                   //userNum=input.nextInt();
                   
                   if(userNum==1) {
                       System.out.print("Enter account number : ");
                       us1.withdrawAmt(input.nextInt());
                   }
                   
                   else if (userNum==2){  
                       System.out.print("Enter account number : ");
                       us2.withdrawAmt(input.nextInt());
                        }
                   else if (userNum==3) {
                       System.out.print("Enter account number : ");
                       us3.withdrawAmt(input.nextInt());
                        }
                    break;
              
             //-----------deposit - case 2 ---------
          case 2 : System.out.println("Deposit");
                   if(userNum==1) {
                       System.out.print("Enter account number : ");
                       us1.deposit(input.nextInt());
                   }
                   
                   else if (userNum==2){  
                       System.out.print("Enter account number : ");
                       us2.deposit(input.nextInt());
                        }
                   else if (userNum==3) {
                       System.out.print("Enter account number : ");
                       us3.deposit(input.nextInt());
                    }
                break;
        }
      }
    }

